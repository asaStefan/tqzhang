package com.tq.tqzhang.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tq.tqzhang.bean.Banner;
import com.tq.tqzhang.dao.mapper.BannerMapper;

/**
 * 用户服务接口
 *
 */
@Service
public class BannerService {
    private static final Logger logger = LoggerFactory.getLogger(BannerService.class);
    
   @Autowired
   private BannerMapper bannerMapper;


    @Transactional
    public Banner loadAllBannerByName(String bannerName) {
        return bannerMapper.loadAllBannerByName(bannerName);
    }

    @Transactional
    public List<Banner> loadAllBaner() {
        return bannerMapper.loadAllBanner();
    }
  
    private void getError() {
        int i = 1 / 0;
        logger.info("i:{}" , i);
    }
}
