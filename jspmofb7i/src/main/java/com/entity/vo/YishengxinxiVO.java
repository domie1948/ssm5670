package com.entity.vo;

import com.entity.YishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医生信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
public class YishengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 从业时间
	 */
	
	private String congyeshijian;
		
	/**
	 * 擅长领域
	 */
	
	private String shanzhanglingyu;
		
	/**
	 * 个人简介
	 */
	
	private String gerenjianjie;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：从业时间
	 */
	 
	public void setCongyeshijian(String congyeshijian) {
		this.congyeshijian = congyeshijian;
	}
	
	/**
	 * 获取：从业时间
	 */
	public String getCongyeshijian() {
		return congyeshijian;
	}
				
	
	/**
	 * 设置：擅长领域
	 */
	 
	public void setShanzhanglingyu(String shanzhanglingyu) {
		this.shanzhanglingyu = shanzhanglingyu;
	}
	
	/**
	 * 获取：擅长领域
	 */
	public String getShanzhanglingyu() {
		return shanzhanglingyu;
	}
				
	
	/**
	 * 设置：个人简介
	 */
	 
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
			
}
