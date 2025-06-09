package com.entity.view;

import com.entity.XianshangzhenliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线上诊疗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
@TableName("xianshangzhenliao")
public class XianshangzhenliaoView  extends XianshangzhenliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianshangzhenliaoView(){
	}
 
 	public XianshangzhenliaoView(XianshangzhenliaoEntity xianshangzhenliaoEntity){
 	try {
			BeanUtils.copyProperties(this, xianshangzhenliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
