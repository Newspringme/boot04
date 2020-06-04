package com.great.service;

import com.great.mapper.AdminMapper;
import com.great.pojo.Admininfo;
import com.great.pojo.Menuinfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author su
 * @date 2020/5/20-20:53
 */
@Service()
public class AdminServiceImpl implements AdminService
{
	@Resource
	private AdminMapper adminMapper;

//	public void setAdminMapper(AdminMapper adminMapper)
//	{
//		this.adminMapper = adminMapper;
//	}

	//	登录
	@Override
//	@Transactional()//开启事务注解
	public Admininfo login(Admininfo admininfo)
	{
		return adminMapper.login(admininfo);
	}

//
//动态菜单
//	@Override
//	public Map<String, ArrayList<Menuinfo>> queryMenu()
//	{
////		获取角色id
//		int roleId = adminMapper.queryRoleId(1);
////		获取角色菜单id
//		List<Integer> list = adminMapper.queryMenuId(roleId);
////		获取角色菜单
//		List<Menuinfo> menulist = adminMapper.queryMenu(list);
//		List<Menuinfo> plist = new ArrayList<>();
//		for (Menuinfo menu : menulist)
//		{
//			if (menu.getMenuPid() == 0)
//			{
//				plist.add(menu);
//			}
//		}
//		Map<String, ArrayList<Menuinfo>> menuMap = new LinkedHashMap<>();
//		for (Menuinfo menuinfo : plist)
//		{
//			ArrayList<Menuinfo> mlist = new ArrayList<>();
//			for (Menuinfo menuinfo1 : menulist)
//			{
//				if (menuinfo.getMenuId() == menuinfo1.getMenuPid())
//				{
//					mlist.add(menuinfo1);
//				}
//			}
//			menuMap.put(menuinfo.getMenuName(), mlist);
//
//		}
//		return menuMap;
//	}
//
//	//获取管理员列表记录数
//	@Override
//	public int queryCount(Admininfo admininfo)
//	{
//		int count = adminMapper.queryCount(admininfo);
//		return count;
//	}
//
//	//获取管理员列表及分页条件查询
//	@Override
//	public List<Admininfo> queryAdmin(Admininfo admininfo, int start, int pageSize)
//	{
//		List<Admininfo> list = adminMapper.queryAdmin(admininfo, start, pageSize);
//		return list;
//	}
//
//	//添加管理员
//	@Override
//	public int addAdmin(Admininfo admininfo)
//	{
//		int num1 = adminMapper.addAdmin(admininfo);
//		int num = 0;
//		if (num1 > 0)
//		{
//			int num2 = adminMapper.addAdminRole(admininfo);
//			if (num2 > 0)
//			{
//				num = 1;
//			}
//		}
//		return num;
//	}
//
//	//删除管理员
//	@Override
//	public int deleteAdmin(int[] array)
//	{
//		int num = adminMapper.deleteAdmin(array);
//		return num;
//	}
//
//	//更新管理员信息
//	@Override
//	public int updateAdmin(Admininfo admininfo)
//	{
//		int num1 = adminMapper.updateAdmin(admininfo);
//		int num2 = adminMapper.updateAdminRole(admininfo);
//		return num1;
//	}
}
