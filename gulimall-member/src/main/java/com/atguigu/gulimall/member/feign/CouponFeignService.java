package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 指定远程服务
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    // 指定远程服务的方法
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
