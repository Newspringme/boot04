package com.great.service;

import com.great.pojo.Admininfo;
import com.great.pojo.Menuinfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author su
 * @date 2020/5/20-20:51
 */
public interface AdminService
{
	//	登录
	Admininfo login(Admininfo admininfo);

//	//	获取角色菜单
//	Map<String, ArrayList<Menuinfo>> queryMenu();
//
//	//	查询记录数
//	int queryCount(Admininfo admininfo);
//
//	//	查询管理员
//	List<Admininfo> queryAdmin(@Param("admininfo") Admininfo admininfo, @Param("start") int start, @Param("pageSize") int pageSize);
//
//	//	添加管理员
//	int addAdmin(Admininfo admininfo);
//
//	//	删除管理员
//	int deleteAdmin(int[] array);
//
//	//	更新管理员信息
//	int updateAdmin(Admininfo admininfo);


}
