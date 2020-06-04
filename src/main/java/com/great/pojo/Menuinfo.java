package com.great.pojo;

/**
 * @author su
 * @date 2020/5/11-22:01
 */
public class Menuinfo
{
	private Integer menuId;
	private Integer menuPid;
	private String menuName;
	private String menuPath;

	public Menuinfo()
	{
	}

	public Menuinfo(Integer menuId, Integer menuPid, String menuName, String menuPath)
	{
		this.menuId = menuId;
		this.menuPid = menuPid;
		this.menuName = menuName;
		this.menuPath = menuPath;
	}

	public Integer getMenuId()
	{
		return menuId;
	}

	public void setMenuId(Integer menuId)
	{
		this.menuId = menuId;
	}

	public Integer getMenuPid()
	{
		return menuPid;
	}

	public void setMenuPid(Integer menuPid)
	{
		this.menuPid = menuPid;
	}

	public String getMenuName()
	{
		return menuName;
	}

	public void setMenuName(String menuName)
	{
		this.menuName = menuName;
	}

	public String getMenuPath()
	{
		return menuPath;
	}

	public void setMenuPath(String menuPath)
	{
		this.menuPath = menuPath;
	}
}
