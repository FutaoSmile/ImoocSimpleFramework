package com.futao.imooc.entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author futao
 * @date 2020/2/27.
 */
@Getter
@Setter
@Builder
public class Result<T> {
    /**
     * 状态码，200=成功
     */
    private int code;
    /**
     * 详情
     */
    private String msg;
    /**
     * 结果集
     */
    private T data;

}
