package com.futao.imooc.service.solo.combine.impl;

import com.futao.imooc.entity.bo.HeadLine;
import com.futao.imooc.entity.bo.ShopCategory;
import com.futao.imooc.entity.dto.MainPageInfoDTO;
import com.futao.imooc.entity.dto.Result;
import com.futao.imooc.service.solo.HeadLineService;
import com.futao.imooc.service.solo.ShopCategoryService;
import com.futao.imooc.service.solo.combine.HeadLineShopCategoryCombineService;

import java.util.List;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;


    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        HeadLine headLine = HeadLine
                .builder()
                .enableStatus(1)
                .build();
        Result<List<HeadLine>> queryHeadLine = headLineService.queryHeadLine(headLine, 1, 4);

        ShopCategory shopCategory = ShopCategory
                .builder()
                .build();
        Result<List<ShopCategory>> queryShopCategory = shopCategoryService.queryShopCategory(shopCategory, 1, 100);

        MainPageInfoDTO mainPageInfoDTO = new MainPageInfoDTO();
        mainPageInfoDTO.setHeadLineList(queryHeadLine.getData());
        mainPageInfoDTO.setShopCategoryList(queryShopCategory.getData());


        Result<MainPageInfoDTO> mainPageInfoDTOResult = Result
                .<MainPageInfoDTO>builder()
                .code(200)
                .data(mainPageInfoDTO)
                .build();
        return mainPageInfoDTOResult;
    }
}
