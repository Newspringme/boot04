package com.great.controller;

import com.great.mapper.AdminMapper;
import com.great.pojo.Admininfo;
import com.great.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author su
 * @date 2020/5/31-7:26
 */
@RestController
public class AdminController
{
	@Autowired
	private AdminService adminService;
	@ResponseBody
	@RequestMapping("login")
	public Admininfo login(){
		Admininfo admininfo=new Admininfo();
		admininfo.setAdminName("admin1");
		admininfo.setAdminPass("qaz123");
		Admininfo admininfo1=adminService.login(admininfo);
		System.out.println("admininfo1 = " + admininfo1);
		return admininfo1;
	}
}
