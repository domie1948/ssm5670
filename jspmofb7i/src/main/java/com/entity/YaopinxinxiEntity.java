package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-31 23:55:45
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
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
