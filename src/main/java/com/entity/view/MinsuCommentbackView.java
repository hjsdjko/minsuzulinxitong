package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.MinsuCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 民宿评价
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("minsu_commentback")
public class MinsuCommentbackView extends MinsuCommentbackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 民宿信息
					 
		/**
		* 民宿信息 的 商家
		*/
		@ColumnInfo(comment="商家",type="int(11)")
		private Integer minsuShangjiaId;
		/**
		* 房间名称
		*/

		@ColumnInfo(comment="房间名称",type="varchar(200)")
		private String minsuName;
		/**
		* 房间照片
		*/

		@ColumnInfo(comment="房间照片",type="varchar(200)")
		private String minsuPhoto;
		/**
		* 房间类型
		*/
		@ColumnInfo(comment="房间类型",type="int(11)")
		private Integer minsuTypes;
			/**
			* 房间类型的值
			*/
			@ColumnInfo(comment="房间类型的字典表值",type="varchar(200)")
			private String minsuValue;
		/**
		* 价格
		*/
		@ColumnInfo(comment="价格",type="decimal(10,2)")
		private Double minsuNewMoney;
		/**
		* 点击次数
		*/

		@ColumnInfo(comment="点击次数",type="int(11)")
		private Integer minsuClicknum;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer minsuDelete;
		/**
		* 民宿简介
		*/

		@ColumnInfo(comment="民宿简介",type="text")
		private String minsuContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 身份证号
		*/

		@ColumnInfo(comment="身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;



	public MinsuCommentbackView() {

	}

	public MinsuCommentbackView(MinsuCommentbackEntity minsuCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, minsuCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 民宿信息
		/**
		* 获取：民宿信息 的 商家
		*/
		public Integer getMinsuShangjiaId() {
			return minsuShangjiaId;
		}
		/**
		* 设置：民宿信息 的 商家
		*/
		public void setMinsuShangjiaId(Integer minsuShangjiaId) {
			this.minsuShangjiaId = minsuShangjiaId;
		}

		/**
		* 获取： 房间名称
		*/
		public String getMinsuName() {
			return minsuName;
		}
		/**
		* 设置： 房间名称
		*/
		public void setMinsuName(String minsuName) {
			this.minsuName = minsuName;
		}

		/**
		* 获取： 房间照片
		*/
		public String getMinsuPhoto() {
			return minsuPhoto;
		}
		/**
		* 设置： 房间照片
		*/
		public void setMinsuPhoto(String minsuPhoto) {
			this.minsuPhoto = minsuPhoto;
		}
		/**
		* 获取： 房间类型
		*/
		public Integer getMinsuTypes() {
			return minsuTypes;
		}
		/**
		* 设置： 房间类型
		*/
		public void setMinsuTypes(Integer minsuTypes) {
			this.minsuTypes = minsuTypes;
		}


			/**
			* 获取： 房间类型的值
			*/
			public String getMinsuValue() {
				return minsuValue;
			}
			/**
			* 设置： 房间类型的值
			*/
			public void setMinsuValue(String minsuValue) {
				this.minsuValue = minsuValue;
			}

		/**
		* 获取： 价格
		*/
		public Double getMinsuNewMoney() {
			return minsuNewMoney;
		}
		/**
		* 设置： 价格
		*/
		public void setMinsuNewMoney(Double minsuNewMoney) {
			this.minsuNewMoney = minsuNewMoney;
		}

		/**
		* 获取： 点击次数
		*/
		public Integer getMinsuClicknum() {
			return minsuClicknum;
		}
		/**
		* 设置： 点击次数
		*/
		public void setMinsuClicknum(Integer minsuClicknum) {
			this.minsuClicknum = minsuClicknum;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getMinsuDelete() {
			return minsuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setMinsuDelete(Integer minsuDelete) {
			this.minsuDelete = minsuDelete;
		}

		/**
		* 获取： 民宿简介
		*/
		public String getMinsuContent() {
			return minsuContent;
		}
		/**
		* 设置： 民宿简介
		*/
		public void setMinsuContent(String minsuContent) {
			this.minsuContent = minsuContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 联系方式
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}


	@Override
	public String toString() {
		return "MinsuCommentbackView{" +
			", minsuName=" + minsuName +
			", minsuPhoto=" + minsuPhoto +
			", minsuNewMoney=" + minsuNewMoney +
			", minsuClicknum=" + minsuClicknum +
			", minsuDelete=" + minsuDelete +
			", minsuContent=" + minsuContent +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
