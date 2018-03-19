package com.meifan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meifan.entity.Link;

/**
 * 友情链接Repository接口
 * @author Administrator
 *
 */
public interface LinkRepository extends JpaRepository<Link, Integer>{

}
