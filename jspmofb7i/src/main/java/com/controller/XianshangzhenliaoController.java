package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XianshangzhenliaoEntity;
import com.entity.view.XianshangzhenliaoView;

import com.service.XianshangzhenliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 线上诊疗
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
@RestController
@RequestMapping("/xianshangzhenliao")
public class XianshangzhenliaoController {
    @Autowired
    private XianshangzhenliaoService xianshangzhenliaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XianshangzhenliaoEntity xianshangzhenliao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			xianshangzhenliao.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xianshangzhenliao.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XianshangzhenliaoEntity> ew = new EntityWrapper<XianshangzhenliaoEntity>();
    	PageUtils page = xianshangzhenliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianshangzhenliao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XianshangzhenliaoEntity xianshangzhenliao, HttpServletRequest request){
        EntityWrapper<XianshangzhenliaoEntity> ew = new EntityWrapper<XianshangzhenliaoEntity>();
    	PageUtils page = xianshangzhenliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianshangzhenliao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XianshangzhenliaoEntity xianshangzhenliao){
       	EntityWrapper<XianshangzhenliaoEntity> ew = new EntityWrapper<XianshangzhenliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xianshangzhenliao, "xianshangzhenliao")); 
        return R.ok().put("data", xianshangzhenliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XianshangzhenliaoEntity xianshangzhenliao){
        EntityWrapper< XianshangzhenliaoEntity> ew = new EntityWrapper< XianshangzhenliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xianshangzhenliao, "xianshangzhenliao")); 
		XianshangzhenliaoView xianshangzhenliaoView =  xianshangzhenliaoService.selectView(ew);
		return R.ok("查询线上诊疗成功").put("data", xianshangzhenliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XianshangzhenliaoEntity xianshangzhenliao = xianshangzhenliaoService.selectById(id);
        return R.ok().put("data", xianshangzhenliao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XianshangzhenliaoEntity xianshangzhenliao = xianshangzhenliaoService.selectById(id);
        return R.ok().put("data", xianshangzhenliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XianshangzhenliaoEntity xianshangzhenliao, HttpServletRequest request){
    	xianshangzhenliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianshangzhenliao);

        xianshangzhenliaoService.insert(xianshangzhenliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XianshangzhenliaoEntity xianshangzhenliao, HttpServletRequest request){
    	xianshangzhenliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianshangzhenliao);

        xianshangzhenliaoService.insert(xianshangzhenliao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XianshangzhenliaoEntity xianshangzhenliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xianshangzhenliao);
        xianshangzhenliaoService.updateById(xianshangzhenliao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xianshangzhenliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XianshangzhenliaoEntity> wrapper = new EntityWrapper<XianshangzhenliaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = xianshangzhenliaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
