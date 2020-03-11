package com.kxg.suyoushop.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 17:14
 **/
@Data
public class DeleteGoodRequest implements Serializable {
    private static final long serialVersionUID = -4480844432967892101L;
    private Long goodsId;
}
