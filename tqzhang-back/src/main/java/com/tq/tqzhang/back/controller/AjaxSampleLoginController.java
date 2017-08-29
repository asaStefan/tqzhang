package com.tq.tqzhang.back.controller; 
  
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody; 
  
/** 
 * 登录controller 
 * 
 * @author Administrator 
 * 
 */
@Controller
@RequestMapping("/user2/*") 
public class AjaxSampleLoginController { 
	private static final Logger logger = LoggerFactory.getLogger(AjaxSampleLoginController.class);

 @RequestMapping(value="login.do") 
 public @ResponseBody String login(HttpServletRequest request,HttpServletResponse response) throws IOException{ //Map<String,Object>
	 logger.info(request.getParameter("name")); 
  Map<String,Object> map = new HashMap<String,Object>(); 
    
  if(request.getParameter("name").equals("123")){ 
	  logger.info("城东"); 
   logger.info("dd");
   map.put("msg", "sucess-tqzhang"); 
  }else{ 
	  logger.info("失败"); 
   map.put("msg", "error"); 
  } 

  
  return map.toString(); 
 } 
   
} 