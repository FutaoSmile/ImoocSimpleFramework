package com.futao.imooc.controller.superadmin;

import com.futao.imooc.entity.bo.HeadLine;
import com.futao.imooc.entity.dto.Result;
import com.futao.imooc.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author futao
 * @date 2020/2/27.
 */
public class HeadLineOperationController {

    public static final String PATH = "/super-admin/head-line-operation";

    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        return headLineService.addHeadLine(HeadLine.builder().build());
    }

    public Result<Boolean> removeHeadLine(int headLineId) {
        return headLineService.removeHeadLine(headLineId);
    }

    public Result<Boolean> modifyHeadLine(HeadLine headLine) {
        return headLineService.modifyHeadLine(null);
    }

    public Result<HeadLine> queryHeadLineById(int headLineId) {
        return headLineService.queryHeadLineById(headLineId);
    }

    public Result<List<HeadLine>> queryHeadLine(HeadLine headLine, int pageIndex, int pageSize) {
        return headLineService.queryHeadLine(headLine, pageIndex, pageSize);
    }
}
