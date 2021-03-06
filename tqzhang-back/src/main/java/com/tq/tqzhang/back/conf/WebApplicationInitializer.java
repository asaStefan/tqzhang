package com.tq.tqzhang.back.conf;

//import com.tq.tqzhang.cache.conf.CacheConfig;
import com.tq.tqzhang.dao.conf.DatabaseConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;


/**
              这是整个项目的核心。Servlet3.0规范，支持将web.xml相关配置也硬编码到代码中[servlet，filter，listener,等等]，并由
 javax.servlet.ServletContainerInitializer的实现类负责在容器启动时进行加载，

    spring提供了一个实现类SpringServletContainerInitializer（在spring-web包中的org.springframework.web目录）,
  该类会调用所有org.springframework.web.WebApplicationInitializer实现类的onStartup方法，将相关的组件注册到服务器；而我们
  的WebApplicationInitializer继承自AbstractAnnotationConfigDispatcherServletInitializer，而
  AbstractAnnotationConfigDispatcherServletInitializer就实现了org.springframework.web.
  WebApplicationInitializer的onStartup方法，所以WebApplicationInitializer就是整个项目的关键，我们的整个项目就是通过它来启动。
 */
/**
 * 项目启动基类
 * -- 整个项目的入口
 */
public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * 获取配置信息
	 * @return
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { BackConfig.class, DatabaseConfig.class, SecurityConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		return null;
	}
}