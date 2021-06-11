package com.portakalim.hrms.business.abstracts;

import java.util.List;

import com.portakalim.hrms.core.utilities.results.DataResult;
import com.portakalim.hrms.core.utilities.results.Result;
import com.portakalim.hrms.entities.concretes.User;

public interface UserService {
	Result add(User user);
	DataResult<List<User>> getAll();

}
