package com.futao.imooc.controller;

import com.futao.imooc.controller.frontend.MainPageInfoController;
import com.futao.imooc.controller.superadmin.HeadLineOperationController;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 【注意：】当为'/'时不会拦截jsp请求
 * 当为'/*'会拦截jsp请求，会造成请求的递归
 *
 * @author futao
 * @date 2020/2/27.
 */
@Slf4j
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求地址
        String servletPath = req.getServletPath();
        log.info("request path is :" + servletPath);
        //请求方式
        String method = req.getMethod();
        log.info("request method is :" + method);

        if (MainPageInfoController.PATH.equals(servletPath) && "get".equalsIgnoreCase(method)) {
            new MainPageInfoController().getMainPageInfo(req, resp);
        } else if (HeadLineOperationController.PATH.equals(servletPath) && "post".equalsIgnoreCase(method)) {
            new HeadLineOperationController().addHeadLine(req, resp);
        }


    }
}
