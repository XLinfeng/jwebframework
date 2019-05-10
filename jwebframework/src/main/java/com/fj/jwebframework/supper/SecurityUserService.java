package com.fj.jwebframework.supper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.fj.jwebframework.sys.mapper.SysUserMapper;

public class SecurityUserService implements UserDetailsService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		return null;
	}

}
