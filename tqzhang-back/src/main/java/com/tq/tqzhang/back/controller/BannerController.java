package com.tq.tqzhang.back.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tq.tqzhang.bean.Banner;
import com.tq.tqzhang.service.BannerService;

/**
 * 用户请求处理器
 * Created by admin on 16/8/6.
 */
@Controller
public class BannerController {
    private static final Logger logger = LoggerFactory.getLogger(BannerController.class);

    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/home2", method = RequestMethod.GET)
  /*  @PreAuthorize("isAuthenticated()")// isAuthenticated 如果用户不是匿名用户就返回true
*/    public String showHomePage() {
    	logger.info("00000000000");
        try {
            List<Banner> banners = bannerService.loadAllBaner();
            logger.info(""+banners.size());
         /*   Banner banner = bannerService.loadAllBannerByName("sy");
            logger.info(""+banner.getBanner_id()+","+banner.getBanner_name());*/
            logger.info("load banner ");
        }catch (Exception e){
            logger.error(e.getLocalizedMessage(), e);
        }

        return "/index/index1";
    }
}