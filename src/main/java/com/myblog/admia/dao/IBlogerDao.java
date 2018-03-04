package com.myblog.admia.dao;

import com.myblog.admia.mode.Bloger;

public interface IBlogerDao {	
	/**
	 * 获取bloger密吗
	 * @param bloger_id
	 * @return Bloger
	 */
	Bloger getBlogerPas(int bloger_id);
}
