package com.myblog.admia.dao;

import com.myblog.admia.mode.Article_sort;

/*分类操作*/
public interface ISortDao {
	
	/***
	 * 
	 * @param sort_article_name 分类名
	 * @return 插入成功的ID 
	 */
	int addsort(String sort_article_name);
    void resort(int sort_article_id,String sort_article_name);
    void delsort(int sort_article_id);
    String getsortname();
    Article_sort getsort(int sort_article_id);
}
