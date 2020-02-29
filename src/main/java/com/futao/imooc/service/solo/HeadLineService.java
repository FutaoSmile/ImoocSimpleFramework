package com.futao.imooc.service.solo;

import com.futao.imooc.entity.bo.HeadLine;
import com.futao.imooc.entity.dto.Result;

import java.util.List;

/**
 * 头条
 *
 * @author futao
 * @date 2020/2/27.
 */
public interface HeadLineService {

    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLine, int pageIndex, int pageSize);
}
