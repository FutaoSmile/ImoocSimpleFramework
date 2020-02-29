package com.futao.imooc.entity.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 头条
 *
 * @author futao
 * @date 2020/2/27.
 */
@Getter
@Setter
@Builder
public class HeadLine {
    private String lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}
