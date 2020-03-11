package com.kxg.suyoushop.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 17:21
 **/
@Data
public class FindCarByUserIdDto implements Serializable {

    private static final long serialVersionUID = 3178529780868483903L;
    private List<CarsDto> carsDtoList;
    private Long total;
}
