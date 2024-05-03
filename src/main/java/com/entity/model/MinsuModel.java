package com.entity.model;

import com.entity.MinsuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 民宿信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MinsuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商家
     */
    private Integer shangjiaId;


    /**
     * 房间名称
     */
    private String minsuName;


    /**
     * 房间照片
     */
    private String minsuPhoto;


    /**
     * 房间类型
     */
    private Integer minsuTypes;


    /**
     * 价格
     */
    private Double minsuNewMoney;


    /**
     * 点击次数
     */
    private Integer minsuClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer minsuDelete;


    /**
     * 民宿简介
     */
    private String minsuContent;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
