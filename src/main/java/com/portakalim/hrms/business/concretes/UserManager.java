package com.portakalim.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portakalim.hrms.business.abstracts.UserService;
import com.portakalim.hrms.business.constants.Messages;
import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.core.utilities.results.SuccessDataResult;
import com.portakalim.hrms.core.utilities.results.SuccessResult;
import com.portakalim.hrms.dataAccess.abstracts.UserDao;
import com.portakalim.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult(Messages.added("Kullanıcılar"));
	}

	@Override
	public DataResult<List<User>> getAll() {
		var result = this.userDao.findAll();
		return new SuccessDataResult<List<User>>(result,Messages.listed("Kullanıcılar"));
	}


}
