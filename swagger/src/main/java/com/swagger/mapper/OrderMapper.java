package com.swagger.mapper;

import com.swagger.entity.Order;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer o_id);

    int insert(Order record);

    Order selectByPrimaryKey(Integer o_id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}