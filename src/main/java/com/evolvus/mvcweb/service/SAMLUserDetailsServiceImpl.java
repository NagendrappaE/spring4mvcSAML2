package com.evolvus.mvcweb.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.security.saml.userdetails.SAMLUserDetailsService;

public class SAMLUserDetailsServiceImpl implements SAMLUserDetailsService{

	@Override
	public Object loadUserBySAML(SAMLCredential credential) throws UsernameNotFoundException {

		System.out.println("loooooooo"+credential);
		
		return credential;
	} 

}
