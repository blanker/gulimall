package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author blank
 * @email wangzhiyun@gmail.com
 * @date 2020-08-18 22:21:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
