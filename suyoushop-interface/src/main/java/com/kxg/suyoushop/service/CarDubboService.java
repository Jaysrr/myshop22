package com.kxg.suyoushop.service;

import com.kxg.suyoushop.request.AddGoodsToCarRequest;
import com.kxg.suyoushop.request.CarsRequest;
import com.kxg.suyoushop.request.DeleteGoodRequest;
import com.kxg.suyoushop.request.FindCarByIdRequest;
import com.kxg.suyoushop.response.AddGoodsToCarResponse;
import com.kxg.suyoushop.response.DeleteGoodsResponse;
import com.kxg.suyoushop.response.FindCarByIdResponse;
import com.kxg.suyoushop.response.UpdateCarResponse;

import java.util.List;

/**
 * @Description: 购物车dubboService接口
 */
public interface CarDubboService {
    AddGoodsToCarResponse addGoodsToCar(AddGoodsToCarRequest request);

    UpdateCarResponse updateCar(CarsRequest request);

    DeleteGoodsResponse deleteGoodsById(DeleteGoodRequest request);


    FindCarByIdResponse findCarByUserId(FindCarByIdRequest request);
}
