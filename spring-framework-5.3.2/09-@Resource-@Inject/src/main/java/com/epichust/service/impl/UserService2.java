package com.epichust.service.impl;

import com.epichust.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserService2 implements UserService
{
	public void print(String msg)
	{
		System.out.println("UserService 222222222222222222222");
	}
}
