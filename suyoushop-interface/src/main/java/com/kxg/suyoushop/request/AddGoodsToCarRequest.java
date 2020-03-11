package com.kxg.suyoushop.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-09 19:52
 **/
@Data
public class AddGoodsToCarRequest implements Serializable {

    private static final long serialVersionUID = 5909010569738849132L;
    @NotNull
    private Long userId;

    @NotNull
    private Long goodsId;

    @NotNull
    private Long shopId;

    @NotEmpty(message = "商品名称缺失")
    private String goodName;

    @NotNull
    private Long numbers;

    @NotNull
    private Double totalPrice;
}
