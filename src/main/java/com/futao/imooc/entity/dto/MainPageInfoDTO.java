package com.futao.imooc.entity.dto;

import com.futao.imooc.entity.bo.HeadLine;
import com.futao.imooc.entity.bo.ShopCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author futao
 * @date 2020/2/27.
 */
@Getter
@Setter
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
