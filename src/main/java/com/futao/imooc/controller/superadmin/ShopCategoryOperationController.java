package com.futao.imooc.controller.superadmin;

import com.futao.imooc.entity.bo.ShopCategory;
import com.futao.imooc.entity.dto.Result;
import com.futao.imooc.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class ShopCategoryOperationController {
    private ShopCategoryService shopCategoryService;

    Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.addShopCategory(shopCategory);
    }

    Result<Boolean> removeShopCategory(int shopCategoryId) {
        return shopCategoryService.removeShopCategory(shopCategoryId);
    }

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.modifyShopCategory(shopCategory);
    }

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return shopCategoryService.queryShopCategoryById(shopCategoryId);
    }

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, int pageIndex, int pageSize) {
        return shopCategoryService.queryShopCategory(shopCategory, pageIndex, pageSize);
    }
}
