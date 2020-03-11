package com.kxg.suyoushop.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CarsDto implements Serializable {

    private static final long serialVersionUID = 8832246880676269965L;
    private Long id;

    private Long userId;

    private Long goodsId;

    private Long shopId;

    private String goodName;

    private Date createTime;

    private Date updateTime;

    private Long numbers;

    private Double totalPrice;

}