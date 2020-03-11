package com.kxg.suyoushop.provider.dao;

import com.kxg.suyoushop.provider.mapper.CarsMapper;
import com.kxg.suyoushop.provider.pojo.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 11:54
 **/
@Repository
public class CarDao {
    @Autowired
    private CarsMapper carsMapper;

    public Integer addGoodsToCar(Cars cars) {
        return carsMapper.insert(cars);
    }

    //因为这是所有的car的信息都传过来了 那么可以根据主键id更新
    public Integer updateCar(Cars cars) {
        return carsMapper.updateByPrimaryKeySelective(cars);
    }

    public Integer deleteGoodsById(Long goodsId) {
        Example example = new Example(Cars.class);
        example.createCriteria()
                .andEqualTo("goodsId", goodsId);
        return carsMapper.deleteByExample(example);
    }
}
