package com.kxg.suyoushop.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 8778278142645506968L;

    private Long id;

    private String phoneNumber;

    private String password;

    private String imgUrl;

    private Date createTime;

    private Date updateTime;

    private String nickName;

    private Double existMoney;
}
