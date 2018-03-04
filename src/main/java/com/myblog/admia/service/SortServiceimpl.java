package com.myblog.admia.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myblog.admia.dao.ISortDao;
@Service("sortService")
public class SortServiceimpl implements ISortService {
	@Resource(name="ISortDao")
	private ISortDao sortdao;

	public ISortDao getSortdao() {
		return sortdao;
	}

	public void setSortdao(ISortDao sortdao) {
		this.sortdao = sortdao;
	}

	@Override
	public int addsort(String sort_article_name) {
		// TODO Auto-generated method stub
		return sortdao.addsort(sort_article_name);
	}

}
