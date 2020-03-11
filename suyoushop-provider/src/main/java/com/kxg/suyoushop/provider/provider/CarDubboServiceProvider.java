package com.kxg.suyoushop.provider.provider;

import com.kxg.suyoushop.provider.pojo.Cars;
import com.kxg.suyoushop.provider.service.CarService;
import com.kxg.suyoushop.request.AddGoodsToCarRequest;
import com.kxg.suyoushop.request.CarsRequest;
import com.kxg.suyoushop.request.DeleteGoodRequest;
import com.kxg.suyoushop.request.FindCarByIdRequest;
import com.kxg.suyoushop.response.AddGoodsToCarResponse;
import com.kxg.suyoushop.response.DeleteGoodsResponse;
import com.kxg.suyoushop.response.FindCarByIdResponse;
import com.kxg.suyoushop.response.UpdateCarResponse;
import com.kxg.suyoushop.service.CarDubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: suyoushop
 * @description: 购物车dubbo接口的实现类
 * @author: Jaysrr
 * @create: 2020-03-10 23:00
 **/
@Service(version = "1.0.0")
public class CarDubboServiceProvider implements CarDubboService {
    @Autowired
    private CarService carService;

    @Override
    public AddGoodsToCarResponse addGoodsToCar(AddGoodsToCarRequest request) {
        //先处理request数据 封装成要给本地service传的car
        Cars cars = new Cars();
        BeanUtils.copyProperties(request, cars);
        //1.数据在dubbo的provider那边应该从request里都保存到car里面差不多了?
        // 但是相比car的pojo 还差了ctime uptime等字段 所以得在这层处理
        cars.setCreateTime(new Date());
        cars.setUpdateTime(new Date());
//        Integer result = carService.addGoodsToCar(cars);//为了避免Integer占内存
//        addGoodsToCarResponse.setEnd(result);//为了避免Integer占内存
        AddGoodsToCarResponse addGoodsToCarResponse = new AddGoodsToCarResponse();
        //为了避免Integer占内存 直接把返回的写到下面这了 实际和上面注释的那两句效果一样
        addGoodsToCarResponse.setEnd(carService.addGoodsToCar(cars));
        return addGoodsToCarResponse;
    }

    @Override
    public UpdateCarResponse updateCar(CarsRequest request) {
        Cars cars = new Cars();
        BeanUtils.copyProperties(request, cars);
        cars.setCreateTime(new Date());
        cars.setUpdateTime(new Date());
        UpdateCarResponse updateCarResponse = new UpdateCarResponse();
        updateCarResponse.setEnd(carService.updateCar(cars));
        return updateCarResponse;
    }

    @Override
    public DeleteGoodsResponse deleteGoodsById(DeleteGoodRequest request) {
        DeleteGoodsResponse deleteGoodsResponse = new DeleteGoodsResponse();
        deleteGoodsResponse.setEnd(carService.deleteGoodsById(request.getGoodsId()));
        return deleteGoodsResponse;
    }

    @Override
    public FindCarByIdResponse findCarByUserId(FindCarByIdRequest request) {
        return null;
    }


}
