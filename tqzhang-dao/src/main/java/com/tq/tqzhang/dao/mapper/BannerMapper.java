package com.tq.tqzhang.dao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tq.tqzhang.bean.Banner;

/**
 * 用户数据映射
 * Created by admin on 16/8/8.
 */
public interface BannerMapper {

    @Select(value="SELECT banner_id , banner_name, sequence,field1,field2,role_id from banner  where banner_name = #{banner_name}" )
    Banner loadAllBannerByName(@Param("banner_name") String banner_name);
    
     @Select(value="SELECT banner_id, banner_name, sequence,field1,field2,role_id from banner " )
     List<Banner> loadAllBanner(); 
     
}
