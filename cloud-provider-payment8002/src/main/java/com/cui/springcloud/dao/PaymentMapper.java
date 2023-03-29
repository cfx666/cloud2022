package com.cui.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cui.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment>{
}
