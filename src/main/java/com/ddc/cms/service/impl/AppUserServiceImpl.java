package com.ddc.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ddc.cms.dao.cluster.AppUserDao;
import com.ddc.cms.dao.master.SysLanguageDao;
import com.ddc.cms.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserDao appUserDao;
	
	@Autowired
	private SysLanguageDao sysLanguageDao;
	
	
	@Cacheable(value="appuserCache",key="10000")
	public Integer findUser(String username) {
		System.out.println("hhhhh : " + username);
		Integer str = appUserDao.findUser(username);
		System.out.println("str:" +str);		
		
		sysLanguageDao.save();
		
		return str;
	}

}
