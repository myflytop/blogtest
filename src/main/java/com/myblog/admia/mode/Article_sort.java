package com.myblog.admia.mode;

import java.sql.Timestamp;

public class Article_sort {
	private Integer sort_article_id;
	private String sort_article_name;
	private Timestamp sort_article_time;
	public Article_sort() {
		
		super();
		
	}
	
	
	public Article_sort(Integer sort_article_id, String sort_article_name, Timestamp sort_article_time) {
		super();
		this.sort_article_id = sort_article_id;
		this.sort_article_name = sort_article_name;
		this.sort_article_time = sort_article_time;
	}




	public Integer getSort_article_id() {
		return sort_article_id;
	}


	public void setSort_article_id(Integer sort_article_id) {
		this.sort_article_id = sort_article_id;
	}


	public String getSort_article_name() {
		return sort_article_name;
	}


	public void setSort_article_name(String sort_article_name) {
		this.sort_article_name = sort_article_name;
	}


	public Timestamp getSort_article_time() {
		return sort_article_time;
	}


	public void setSort_article_time(Timestamp sort_article_time) {
		this.sort_article_time = sort_article_time;
	}


	@Override
	public String toString() {
		return "Article_sort [sort_article_id=" + sort_article_id + ", sort_article_name=" + sort_article_name
				+ ", sort_article_time=" + sort_article_time + "]";
	}
	
 
}
