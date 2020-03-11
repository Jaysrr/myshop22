package com.kxg.suyoushop.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 17:18
 **/
@Data
public class FindCarByIdRequest implements Serializable {

    private static final long serialVersionUID = -8574054270677448089L;

    private Long userId;
    private Integer pageSize;
    private Integer pageNum;

}
