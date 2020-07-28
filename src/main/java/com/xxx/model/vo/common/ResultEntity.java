package com.xxx.model.vo.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultEntity implements Serializable {

    public static final long serialVersionUID = 1L;

    protected Integer status;
    protected Object msg;
    protected Object data;
}