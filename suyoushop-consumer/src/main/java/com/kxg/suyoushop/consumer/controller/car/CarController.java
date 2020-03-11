package com.kxg.suyoushop.consumer.controller.car;

import com.kxg.suyoushop.constant.MyShopConstants;
import com.kxg.suyoushop.consumer.common.SzpJsonResult;
import com.kxg.suyoushop.consumer.handler.CheckHandler;
import com.kxg.suyoushop.request.AddGoodsToCarRequest;
import com.kxg.suyoushop.response.AddGoodsToCarResponse;
import com.kxg.suyoushop.service.CarDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: suyoushop
 * @description: 修改购物车中的信息
 * @author: Jaysrr
 * @create: 2020-03-09 19:42
 **/
@RestController
@RequestMapping("car")
public class CarController {
    @Reference(version = "1.0.0")
    private CarDubboService carDubboService;

    @Autowired
    private CheckHandler checkHandler;

    // 添加商品到购物车
    @PostMapping("add")
    public SzpJsonResult<AddGoodsToCarResponse> addGoodsToCar(@RequestHeader("token") String token, @Validated @RequestBody AddGoodsToCarRequest request) {
        //1.1.取token 验证用户
        if (checkHandler.checkSSOToken(token)) {
            //1.2.拿着前端传来的商品信息 向下调用dubbo的service在一步步向下落库
            return SzpJsonResult.ok(carDubboService.addGoodsToCar(request));
        }
        //2. 若不存在 则返回token错误信息
        return SzpJsonResult.errorTokenMsg(MyShopConstants.TOKEN_IS_NOT_RIGHT);
    }


    // 更新购物车
    // 删除购物车中的内容
}
