package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 民宿信息
 *
 * @author 
 * @email
 */
@TableName("minsu")
public class MinsuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MinsuEntity() {

	}

	public MinsuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 商家
     */
    @ColumnInfo(comment="商家",type="int(11)")
    @TableField(value = "shangjia_id")

    private Integer shangjiaId;


    /**
     * 房间名称
     */
    @ColumnInfo(comment="房间名称",type="varchar(200)")
    @TableField(value = "minsu_name")

    private String minsuName;


    /**
     * 房间照片
     */
    @ColumnInfo(comment="房间照片",type="varchar(200)")
    @TableField(value = "minsu_photo")

    private String minsuPhoto;


    /**
     * 房间类型
     */
    @ColumnInfo(comment="房间类型",type="int(11)")
    @TableField(value = "minsu_types")

    private Integer minsuTypes;


    /**
     * 价格
     */
    @ColumnInfo(comment="价格",type="decimal(10,2)")
    @TableField(value = "minsu_new_money")

    private Double minsuNewMoney;


    /**
     * 点击次数
     */
    @ColumnInfo(comment="点击次数",type="int(11)")
    @TableField(value = "minsu_clicknum")

    private Integer minsuClicknum;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "minsu_delete")

    private Integer minsuDelete;


    /**
     * 民宿简介
     */
    @ColumnInfo(comment="民宿简介",type="text")
    @TableField(value = "minsu_content")

    private String minsuContent;


    /**
     * 创建时间     homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }
    /**
	 * 设置：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 获取：房间名称
	 */
    public String getMinsuName() {
        return minsuName;
    }
    /**
	 * 设置：房间名称
	 */

    public void setMinsuName(String minsuName) {
        this.minsuName = minsuName;
    }
    /**
	 * 获取：房间照片
	 */
    public String getMinsuPhoto() {
        return minsuPhoto;
    }
    /**
	 * 设置：房间照片
	 */

    public void setMinsuPhoto(String minsuPhoto) {
        this.minsuPhoto = minsuPhoto;
    }
    /**
	 * 获取：房间类型
	 */
    public Integer getMinsuTypes() {
        return minsuTypes;
    }
    /**
	 * 设置：房间类型
	 */

    public void setMinsuTypes(Integer minsuTypes) {
        this.minsuTypes = minsuTypes;
    }
    /**
	 * 获取：价格
	 */
    public Double getMinsuNewMoney() {
        return minsuNewMoney;
    }
    /**
	 * 设置：价格
	 */

    public void setMinsuNewMoney(Double minsuNewMoney) {
        this.minsuNewMoney = minsuNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getMinsuClicknum() {
        return minsuClicknum;
    }
    /**
	 * 设置：点击次数
	 */

    public void setMinsuClicknum(Integer minsuClicknum) {
        this.minsuClicknum = minsuClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getMinsuDelete() {
        return minsuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setMinsuDelete(Integer minsuDelete) {
        this.minsuDelete = minsuDelete;
    }
    /**
	 * 获取：民宿简介
	 */
    public String getMinsuContent() {
        return minsuContent;
    }
    /**
	 * 设置：民宿简介
	 */

    public void setMinsuContent(String minsuContent) {
        this.minsuContent = minsuContent;
    }
    /**
	 * 获取：创建时间     homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间     homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Minsu{" +
            ", id=" + id +
            ", shangjiaId=" + shangjiaId +
            ", minsuName=" + minsuName +
            ", minsuPhoto=" + minsuPhoto +
            ", minsuTypes=" + minsuTypes +
            ", minsuNewMoney=" + minsuNewMoney +
            ", minsuClicknum=" + minsuClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", minsuDelete=" + minsuDelete +
            ", minsuContent=" + minsuContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
