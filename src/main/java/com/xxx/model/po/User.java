package com.xxx.model.po;

import com.xxx.model.po.common.BaseEntity;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString(callSuper = true)
public class User extends BaseEntity implements Serializable {

    public static final long serialVersionUID = 1L;
    private String name;
    private String password;
    private Integer age;
}
