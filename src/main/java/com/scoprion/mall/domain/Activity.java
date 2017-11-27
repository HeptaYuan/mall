package com.scoprion.mall.domain;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;
import java.util.List;

/**
 * @author by kunlun
 * @created on 2017/10/10.
 */
public class Activity {

    /**
     * 主键
     */
    private Long id;

    /**
     * 活动名称
     */
    private String name;


    /**
     * 活动类型
     * 0秒杀
     * 1拼团
     * 2优选
     */
    @JSONField(name = "activity_type")
    private String activityType;

    /**
     * 状态
     * 0正常
     * 1删除
     */
    private String status;

    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "update_date")
    private Date updateDate;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "create_date")
    private Date createDate;

    /**
     * 目标
     * 0 小程序
     * 1 app
     * 2 网站
     * 3 全部
     */
    private String target;


    /**
     * 参加活动人数
     */
    private Integer num;


    /**
     * 活动开始时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "start_date")
    private Date startDate;

    /**
     * 活动结束时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",name = "end_date")
    private Date endDate;

    /**
     * 折扣价  80表示80%
     */
    private Integer discount;

    /**
     * 活动描述
     */
    private String describes;

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", activityType='" + activityType + '\'' +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                ", createDate=" + createDate +
                ", target='" + target + '\'' +
                ", num=" + num +
                ", startDate=" + startDate +
                ", describes=" + describes +
                ", discount=" + discount +
                ", endDate=" + endDate +
                '}';
    }
}
