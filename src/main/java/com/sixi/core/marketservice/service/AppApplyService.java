package com.sixi.core.marketservice.service;

import com.sixi.core.marketservice.domain.form.AppApplyForm;
import com.sixi.core.marketservice.domain.form.AppIdForm;
import com.sixi.core.marketservice.domain.vo.AppApplyVo;
import com.sixi.core.marketservice.domain.vo.AppPublicKeyVo;

/**
 * @Author: ZY
 * @Date: 2019/8/6 15:10
 * @Version 1.0
 * @Description:
 */
public interface AppApplyService {

    AppApplyVo apply(AppApplyForm applyForm);

    AppPublicKeyVo selectPublicKey(AppIdForm appPublicKeyForm);
}
