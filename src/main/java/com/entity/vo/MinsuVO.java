package com.entity.vo;

import com.entity.MinsuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 民宿信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("minsu")
public class MinsuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商家
     */

    @TableField(value = "shangjia_id")
    private Integer shangjiaId;


    /**
     * 房间名称
     */

    @TableField(value = "minsu_name")
    private String minsuName;


    /**
     * 房间照片
     */

    @TableField(value = "minsu_photo")
    private String minsuPhoto;


    /**
     * 房间类型
     */

    @TableField(value = "minsu_types")
    private Integer minsuTypes;


    /**
     * 价格
     */

    @TableField(value = "minsu_new_money")
    private Double minsuNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "minsu_clicknum")
    private Integer minsuClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "minsu_delete")
    private Integer minsuDelete;


    /**
     * 民宿简介
     */

    @TableField(value = "minsu_content")
    private String minsuContent;


    /**
     * 创建时间  show1 show2 photoShow homeMain
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：房间名称
	 */
    public String getMinsuName() {
        return minsuName;
    }


    /**
	 * 获取：房间名称
	 */

    public void setMinsuName(String minsuName) {
        this.minsuName = minsuName;
    }
    /**
	 * 设置：房间照片
	 */
    public String getMinsuPhoto() {
        return minsuPhoto;
    }


    /**
	 * 获取：房间照片
	 */

    public void setMinsuPhoto(String minsuPhoto) {
        this.minsuPhoto = minsuPhoto;
    }
    /**
	 * 设置：房间类型
	 */
    public Integer getMinsuTypes() {
        return minsuTypes;
    }


    /**
	 * 获取：房间类型
	 */

    public void setMinsuTypes(Integer minsuTypes) {
        this.minsuTypes = minsuTypes;
    }
    /**
	 * 设置：价格
	 */
    public Double getMinsuNewMoney() {
        return minsuNewMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setMinsuNewMoney(Double minsuNewMoney) {
        this.minsuNewMoney = minsuNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMinsuClicknum() {
        return minsuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setMinsuClicknum(Integer minsuClicknum) {
        this.minsuClicknum = minsuClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMinsuDelete() {
        return minsuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setMinsuDelete(Integer minsuDelete) {
        this.minsuDelete = minsuDelete;
    }
    /**
	 * 设置：民宿简介
	 */
    public String getMinsuContent() {
        return minsuContent;
    }


    /**
	 * 获取：民宿简介
	 */

    public void setMinsuContent(String minsuContent) {
        this.minsuContent = minsuContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow homeMain
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow homeMain
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
