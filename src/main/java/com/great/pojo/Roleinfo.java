package com.great.pojo;

import java.util.List;

/**
 * @author su
 * @date 2020/5/15-11:33
 */
public class Roleinfo
{
	private int roleId;
	private String roleName;
	private List<Menuinfo> list;
	private Menuinfo menuinfo;

	public Roleinfo()
	{
	}

	public Roleinfo(int roleId, String roleName, List<Menuinfo> list)
	{
		this.roleId = roleId;
		this.roleName = roleName;
		this.list = list;
	}

	public Roleinfo(int roleId, String roleName, List<Menuinfo> list, Menuinfo menuinfo)
	{
		this.roleId = roleId;
		this.roleName = roleName;
		this.list = list;
		this.menuinfo = menuinfo;
	}

	public Menuinfo getMenuinfo()
	{
		return menuinfo;
	}

	public void setMenuinfo(Menuinfo menuinfo)
	{
		this.menuinfo = menuinfo;
	}

	public int getRoleId()
	{
		return roleId;
	}

	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	public List<Menuinfo> getList()
	{
		return list;
	}

	public void setList(List<Menuinfo> list)
	{
		this.list = list;
	}

	@Override
	public String toString()
	{
		return "Roleinfo{" + "roleId=" + roleId + ", roleName='" + roleName + '\'' + ", list=" + list + '}';
	}
}
