package com.great.mapper;

import com.great.pojo.Admininfo;
import com.great.pojo.Menuinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author su
 * @date 2020/5/15-5:48
 */
@Mapper
//@Repository
public interface AdminMapper
{
	//	登录
	Admininfo login(Admininfo admininfo);
//
//	public void test();

//	//	查询记录数
//	int queryCount(Admininfo admininfo);
//
//	//	查询管理员
//	List<Admininfo> queryAdmin(@Param("admininfo") Admininfo admininfo, @Param("start") int start, @Param("pageSize") int pageSize);
//
//	//	添加管理员
//	int addAdmin(Admininfo admininfo);
//
//	//	添加管理员角色关系
//	int addAdminRole(Admininfo admininfo);
//
//	//	删除管理员
//	int deleteAdmin(int[] array);
//
//	//	更新管理员信息
//	int updateAdmin(Admininfo admininfo);
//
//	//	更新管理员角色
//	int updateAdminRole(Admininfo admininfo);
//
//	//	获取角色id
//	int queryRoleId(int adminId);
//
//	//	获取角色菜单id
//	List<Integer> queryMenuId(int roleId);
//
//	//	获取角色菜单
//	List<Menuinfo> queryMenu(List<Integer> list);

}
