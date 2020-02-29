package com.futao.imooc.service.solo;

import com.futao.imooc.entity.bo.ShopCategory;
import com.futao.imooc.entity.dto.Result;

import java.util.List;

/**
 * @author futao
 * @date 2020/2/27.
 */
public interface ShopCategoryService {

    Result<Boolean> addShopCategory(ShopCategory headLine);

    Result<Boolean> removeShopCategory(int headLineId);

    Result<Boolean> modifyShopCategory(ShopCategory headLine);

    Result<ShopCategory> queryShopCategoryById(int headLineId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory headLine, int pageIndex, int pageSize);
}
