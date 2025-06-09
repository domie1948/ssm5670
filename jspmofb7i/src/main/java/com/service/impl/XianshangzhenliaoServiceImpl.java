package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XianshangzhenliaoDao;
import com.entity.XianshangzhenliaoEntity;
import com.service.XianshangzhenliaoService;
import com.entity.vo.XianshangzhenliaoVO;
import com.entity.view.XianshangzhenliaoView;

@Service("xianshangzhenliaoService")
public class XianshangzhenliaoServiceImpl extends ServiceImpl<XianshangzhenliaoDao, XianshangzhenliaoEntity> implements XianshangzhenliaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianshangzhenliaoEntity> page = this.selectPage(
                new Query<XianshangzhenliaoEntity>(params).getPage(),
                new EntityWrapper<XianshangzhenliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianshangzhenliaoEntity> wrapper) {
		  Page<XianshangzhenliaoView> page =new Query<XianshangzhenliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianshangzhenliaoVO> selectListVO(Wrapper<XianshangzhenliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianshangzhenliaoVO selectVO(Wrapper<XianshangzhenliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianshangzhenliaoView> selectListView(Wrapper<XianshangzhenliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianshangzhenliaoView selectView(Wrapper<XianshangzhenliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
