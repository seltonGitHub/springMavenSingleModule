package com.xxx.model.po.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long id;
    protected Date createTime;
    protected Date updateTime;
}