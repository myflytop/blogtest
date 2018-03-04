package com.myblog.admia.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myblog.admia.dao.IBlogerDao;
import com.myblog.admia.mode.Bloger;
@Service("blogerService")
public class BlogerServiceimpl implements IBloserService{
	@Resource(name="IBlogerDao")
	private IBlogerDao blogerdao;
	public void setBlogerdao(IBlogerDao blogerdao) {
		this.blogerdao = blogerdao;
	}
	public IBlogerDao getBlogerdao() {
		return blogerdao;
	}

	@Override
	@Transactional
	public Bloger getBlogerPas(int bloger_id) {
		// TODO Auto-generated method stub
		return blogerdao.getBlogerPas(bloger_id);
	}

	

}
