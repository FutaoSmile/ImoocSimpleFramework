package com.futao.imooc.controller.frontend;

import com.futao.imooc.entity.dto.MainPageInfoDTO;
import com.futao.imooc.entity.dto.Result;
import com.futao.imooc.service.solo.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class MainPageInfoController {

    public static final String PATH = "front-end/main-page-info";

    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp) {
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
