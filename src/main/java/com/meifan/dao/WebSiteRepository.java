package com.meifan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.meifan.entity.WebSite;

/**
 * 电影Repository接口
 * @author Administrator
 *
 */
public interface WebSiteRepository extends JpaRepository<WebSite, Integer>,JpaSpecificationExecutor<WebSite>{


}
