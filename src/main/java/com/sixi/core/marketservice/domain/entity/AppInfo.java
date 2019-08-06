package com.sixi.core.marketservice.domain.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with Mybatis Generator Plugin
 *
 * @author MiaoWoo
 * Created on 2019/08/06 03:02.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppInfo {
    private Integer id;

    private String appId;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * app申请私钥
     */
    private String appPrivateKey;

    /**
     * app申请公钥
     */
    private String appPublicKey;

    /**
     * 应用服务开始时间
     */
    private Date appStartTime;

    /**
     * 应用服务结束时间
     */
    private Date appEndTime;

    /**
     * 应用对应的公司名称
     */
    private String companyName;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}