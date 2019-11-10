package com.it.service.impl;

import com.it.dao.Idao;
import com.it.dao.impl.IdaoImpl;
import com.it.po.User;
import com.it.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private Idao iDao = new IdaoImpl();
	public void save(User user) {
		iDao.save();
	}
}
