package com.kxg.suyoushop.provider.service;

import com.kxg.suyoushop.dto.FindCarByUserIdDto;
import com.kxg.suyoushop.provider.pojo.Cars;

import java.util.List;

/**
 * @program: suyoushop
 * @description:购物车的本地service接口
 * @author: Jaysrr
 * @create: 2020-03-11 00:01
 **/

public interface CarService {
    Integer addGoodsToCar(Cars cars);

    Integer updateCar(Cars cars);

    Integer deleteGoodsById(Long id);

    FindCarByUserIdDto findCarByUserId(Long id, Integer pageSize, Integer pageNumber);
}
