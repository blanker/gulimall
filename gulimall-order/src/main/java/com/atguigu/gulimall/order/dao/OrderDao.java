package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author blank
 * @email wangzhiyun@gmail.com
 * @date 2020-08-18 22:07:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
