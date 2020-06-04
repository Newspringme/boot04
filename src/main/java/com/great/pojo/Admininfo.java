package com.great.pojo;

import java.util.List;

/**
 * @author su
 * @date 2020/5/12-11:03
 */
public class Admininfo
{
	private int adminId;
	private int roleId;
	private String adminName;
	private String adminPass;
	private String roleName;
	private String regTime;
	private String startTime;
	private String endTime;
	private Roleinfo role;
	private List<String>list;

	public Roleinfo getRole()
	{
		return role;
	}

	public void setRole(Roleinfo role)
	{
		this.role = role;
	}

	public List<String> getList()
	{
		return list;
	}

	public void setList(List<String> list)
	{
		this.list = list;
	}

	public Admininfo()
	{
	}

//	public Admininfo(String adminName, String adminPass)
//	{
//		this.adminName = adminName;
//		this.adminPass = adminPass;
//	}
//	public Admininfo(int adminId, String adminName)
//	{
//		this.adminId = adminId;
//		this.adminPass = adminPass;
//	}

//	public Admininfo(int adminId, String adminName, String adminPass, String roleName, int roleId, String regTime, String startTime, String endTime)
//	{
//		this.adminId = adminId;
//		this.adminName = adminName;
//		this.adminPass = adminPass;
//		this.roleName = roleName;
//		this.roleId = roleId;
//		this.regTime = regTime;
//		this.startTime = startTime;
//		this.endTime = endTime;
//	}



	public Admininfo(int adminId, int roleId, String adminName, String adminPass, String roleName, String regTime, String startTime, String endTime, Roleinfo role, List<String> list)
	{
		this.adminId = adminId;
		this.roleId = roleId;
		this.adminName = adminName;
		this.adminPass = adminPass;
		this.roleName = roleName;
		this.regTime = regTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.role = role;
		this.list = list;
	}

	public String getRegTime()
	{
		return regTime;
	}

	public void setRegTime(String regTime)
	{
		this.regTime = regTime;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getEndTime()
	{
		return endTime;
	}

	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
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

	public int getAdminId()
	{
		return adminId;
	}

	public void setAdminId(int adminId)
	{
		this.adminId = adminId;
	}

	public String getAdminName()
	{
		return adminName;
	}

	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}

	public String getAdminPass()
	{
		return adminPass;
	}

	public void setAdminPass(String adminPass)
	{
		this.adminPass = adminPass;
	}

	@Override
	public String toString()
	{
		return "Admininfo{" + "adminId=" + adminId + ", roleId=" + roleId + ", adminName='" + adminName + '\'' + ", adminPass='" + adminPass + '\'' + ", roleName='" + roleName + '\'' + ", regTime='" + regTime + '\'' + ", startTime='" + startTime + '\'' + ", endTime='" + endTime + '\'' + ", role=" + role + ", list=" + list + '}';
	}
}
