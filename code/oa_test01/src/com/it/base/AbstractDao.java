package com.it.base;

import com.it.dao.Idao;
import com.it.dao.impl.IdaoImpl;

public abstract class AbstractDao implements BaseDao {

	private Idao iDao = new IdaoImpl();
	public void save() {
		iDao.save();
	}

}
