package com.gym.oracleGym.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.gym.oracleGym.repository.UserRepository;


@Service("userService")
public class UserService implements UserDetailsService{

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.gym.oracleGym.entity.User user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = buildAuthorities(user.getUserRole());
		return buildUser(user, authorities);
	}
	
	private org.springframework.security.core.userdetails.User buildUser(com.gym.oracleGym.entity.User user, List<GrantedAuthority> authorities) {
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), 
				 	    user.getPassword(),
				 		user.isEnabled(), 
				 		true, true, true, authorities);
		
		/*return new User(user.getUsername(), 
				 	    user.getPassword(),
				 		user.isEnabled(), 
				 		true, true, true, authorities);*/
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<com.gym.oracleGym.entity.UserRole> userRoles){
        
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		for (com.gym.oracleGym.entity.UserRole userRole : userRoles) {
			
			auths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return new ArrayList<GrantedAuthority>(auths);		
		
	}
}


