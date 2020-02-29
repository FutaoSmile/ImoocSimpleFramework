package com.futao.imooc.service.solo.combine;

import com.futao.imooc.entity.dto.MainPageInfoDTO;
import com.futao.imooc.entity.dto.Result;

/**
 * @author futao
 * @date 2020/2/27.
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
