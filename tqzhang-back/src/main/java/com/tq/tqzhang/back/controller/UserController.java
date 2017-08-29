package com.tq.tqzhang.back.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tq.tqzhang.service.UserService;

/**
 * 用户请求处理器
 * Created by admin on 16/8/6.
 */
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
   /* @Autowired
    private BannerService bannerService;*/

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated()")// isAuthenticated 如果用户不是匿名用户就返回true
    public String showHomePage() {
    	logger.info("00000000000");
        try {
            userService.loadUserByUsername("admin");
           /* List<Banner> banners = bannerService.loadAllBaner();
            logger.info(""+banners.size());
            Banner banner = bannerService.loadAllBannerByName("首页");
            logger.info(""+banner.getBannerId()+","+banner.getBannerName());*/
            logger.info("load user ");
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(), e);
        }

        return "/pages/index";
    }
}