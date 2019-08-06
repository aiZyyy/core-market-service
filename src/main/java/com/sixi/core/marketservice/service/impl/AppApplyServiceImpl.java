package com.sixi.core.marketservice.service.impl;

import com.sixi.common.snowflakeservice.api.SnowFlakeServiceApi;
import com.sixi.common.snowflakeservice.domain.form.SnowFlakeForm;
import com.sixi.core.marketservice.domain.entity.AppInfo;
import com.sixi.core.marketservice.domain.form.AppApplyForm;
import com.sixi.core.marketservice.domain.vo.AppApplyVo;
import com.sixi.core.marketservice.mapper.AppInfoMapper;
import com.sixi.core.marketservice.service.AppApplyService;
import com.sixi.core.marketservice.utils.RSAUtils;
import com.sixi.micro.common.utils.Assert;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Objects;

/**
 * @Author: ZY
 * @Date: 2019/8/6 15:10
 * @Version 1.0
 * @Description:
 */

@Service
@Slf4j
public class AppApplyServiceImpl implements AppApplyService {

    @Autowired
    private AppInfoMapper appInfoMapper;

    @Resource
    private SnowFlakeServiceApi snowFlakeServiceApi;

    @Override
    public AppApplyVo apply(AppApplyForm appApplyForm) {

        Assert.requireNonNull(appApplyForm, "appApplyForm对象为空");
        //雪花算法生成唯一appId
        String appId = snowFlakeServiceApi.getIdEntifier(SnowFlakeForm.builder().prefix("app").build());

        RSAUtils.RSAKeyPair rsaKeyPair = null;
        try {
            //生成唯一的公钥,私钥
            rsaKeyPair = RSAUtils.generateKeyPair();
            Assert.requireNonNull(rsaKeyPair, "秘钥生成失败");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        AppInfo appInfo = AppInfo.builder().appId(appId).appName(appApplyForm.getAppName())
                .appPrivateKey(rsaKeyPair.getPrivateKey())
                .appPublicKey(rsaKeyPair.getPublicKey())
                .appStartTime(new Date())
                .companyName(appApplyForm.getCompanyName()).build();

        //app基本信息入库
        appInfoMapper.insertSelective(appInfo);
        AppApplyVo appApplyVo = AppApplyVo.builder().appId(appId).appPrivateKey(rsaKeyPair.getPrivateKey())
                .appPublicKey(rsaKeyPair.getPublicKey()).build();
        return appApplyVo;
    }
}
