package com.futao.imooc.entity.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 店铺类别
 *
 * @author futao
 * @date 2020/2/27.
 */
@Getter
@Setter
@Builder
public class ShopCategory {
    private String shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
