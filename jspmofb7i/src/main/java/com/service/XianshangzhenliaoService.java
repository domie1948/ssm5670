package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianshangzhenliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianshangzhenliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianshangzhenliaoView;


/**
 * 线上诊疗
 *
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
public interface XianshangzhenliaoService extends IService<XianshangzhenliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianshangzhenliaoVO> selectListVO(Wrapper<XianshangzhenliaoEntity> wrapper);
   	
   	XianshangzhenliaoVO selectVO(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
   	
   	List<XianshangzhenliaoView> selectListView(Wrapper<XianshangzhenliaoEntity> wrapper);
   	
   	XianshangzhenliaoView selectView(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianshangzhenliaoEntity> wrapper);
   	
}

