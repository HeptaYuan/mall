package com.scoprion.mall.littlesoft.mapper;

import com.github.pagehelper.Page;
import com.scoprion.mall.domain.Delivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * Created by admin1 on 2017/11/1.
 */
@Mapper
public interface DeliveryLittleSoftMapper {

    /**
     * 分页查询用户收获地址
     *
     * @param userId
     * @return
     */
    Page<Delivery> deliveryList(@Param("userId") Long userId);
}
