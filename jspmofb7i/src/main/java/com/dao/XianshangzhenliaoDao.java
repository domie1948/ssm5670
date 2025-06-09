package com.dao;

import com.entity.XianshangzhenliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianshangzhenliaoVO;
import com.entity.view.XianshangzhenliaoView;


/**
 * 线上诊疗
 * 
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
public interface XianshangzhenliaoDao extends BaseMapper<XianshangzhenliaoEntity> {
	
	List<XianshangzhenliaoVO> selectListVO(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
	
	XianshangzhenliaoVO selectVO(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
	
	List<XianshangzhenliaoView> selectListView(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);

	List<XianshangzhenliaoView> selectListView(Pagination page,@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
	
	XianshangzhenliaoView selectView(@Param("ew") Wrapper<XianshangzhenliaoEntity> wrapper);
	
}
