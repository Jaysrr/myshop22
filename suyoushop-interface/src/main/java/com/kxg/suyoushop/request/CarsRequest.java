package com.kxg.suyoushop.request;

import com.kxg.suyoushop.dto.CarsDto;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: suyoushop
 * @description:
 * @author: Jaysrr
 * @create: 2020-03-11 16:33
 **/
@Data
public class CarsRequest extends CarsDto implements Serializable {
    private static final long serialVersionUID = -2540041280787926524L;
}
