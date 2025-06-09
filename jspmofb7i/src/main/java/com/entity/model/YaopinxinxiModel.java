package com.entity.model;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
public class YaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 是否为处方药
	 */
	
	private String shifouweichufangyao;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 剂量
	 */
	
	private String jiliang;
		
	/**
	 * 功效
	 */
	
	private String gongxiao;
		
	/**
	 * 生产时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanshijian;
		
	/**
	 * 生产厂家
	 */
	
	private String shengchanchangjia;
		
	/**
	 * 药品详情
	 */
	
	private String yaopinxiangqing;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：是否为处方药
	 */
	 
	public void setShifouweichufangyao(String shifouweichufangyao) {
		this.shifouweichufangyao = shifouweichufangyao;
	}
	
	/**
	 * 获取：是否为处方药
	 */
	public String getShifouweichufangyao() {
		return shifouweichufangyao;
	}
				
	
	/**
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：剂量
	 */
	 
	public void setJiliang(String jiliang) {
		this.jiliang = jiliang;
	}
	
	/**
	 * 获取：剂量
	 */
	public String getJiliang() {
		return jiliang;
	}
				
	
	/**
	 * 设置：功效
	 */
	 
	public void setGongxiao(String gongxiao) {
		this.gongxiao = gongxiao;
	}
	
	/**
	 * 获取：功效
	 */
	public String getGongxiao() {
		return gongxiao;
	}
				
	
	/**
	 * 设置：生产时间
	 */
	 
	public void setShengchanshijian(Date shengchanshijian) {
		this.shengchanshijian = shengchanshijian;
	}
	
	/**
	 * 获取：生产时间
	 */
	public Date getShengchanshijian() {
		return shengchanshijian;
	}
				
	
	/**
	 * 设置：生产厂家
	 */
	 
	public void setShengchanchangjia(String shengchanchangjia) {
		this.shengchanchangjia = shengchanchangjia;
	}
	
	/**
	 * 获取：生产厂家
	 */
	public String getShengchanchangjia() {
		return shengchanchangjia;
	}
				
	
	/**
	 * 设置：药品详情
	 */
	 
	public void setYaopinxiangqing(String yaopinxiangqing) {
		this.yaopinxiangqing = yaopinxiangqing;
	}
	
	/**
	 * 获取：药品详情
	 */
	public String getYaopinxiangqing() {
		return yaopinxiangqing;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
