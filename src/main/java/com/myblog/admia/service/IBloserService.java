package com.myblog.admia.service;

import com.myblog.admia.mode.Bloger;

public interface IBloserService {
	/**
	 * 获取用户密码
	 * @param bloger_id
	 * @return Bloger
	 */
	Bloger getBlogerPas(int bloger_id);
}
