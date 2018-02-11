package com.ngdsoft.sdk.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private static final long serialVersionUID = -6520395892343657949L;

    private Boolean success;
    private String code;
    private String msg;
    private Object data;


}
