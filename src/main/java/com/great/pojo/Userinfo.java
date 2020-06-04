package com.great.pojo;

/**
 * @author su
 * @time 2020/5/12-15:58
 */
public class Userinfo
{
	private int userId;
	private String userName;
	private String userPass;
	private String userSex;
	private String userTel;
	private String userPoint;
	private String userState;
	private String userEmile;
	private String userJob;
	private String levelName;
	private String regTime;
	private String startTime;
	private String endTime;
	private Level level;
	private int levelId;

	public Userinfo()
	{
	}

	public Userinfo(int userId, String userName, String userPass, String userSex, String userTel, String userPoint, String userState, String userEmile, String userJob, String levelName, String regTime)
	{
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userSex = userSex;
		this.userTel = userTel;
		this.userPoint = userPoint;
		this.userState = userState;
		this.userEmile = userEmile;
		this.userJob = userJob;
		this.levelName = levelName;
		this.regTime = regTime;
	}

	public Userinfo(int userId, String userName, String userPass, String userSex, String userTel, String userPoint, String userState, String userEmile, String userJob, String levelName, String regTime, String startTime, String endTime, Level level, int levelId)
	{
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userSex = userSex;
		this.userTel = userTel;
		this.userPoint = userPoint;
		this.userState = userState;
		this.userEmile = userEmile;
		this.userJob = userJob;
		this.levelName = levelName;
		this.regTime = regTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.level = level;
		this.levelId = levelId;
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

	public int getLevelId()
	{
		return levelId;
	}

	public void setLevelId(int levelId)
	{
		this.levelId = levelId;
	}

	public Level getLevel()
	{
		return level;
	}

	public void setLevel(Level level)
	{
		this.level = level;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserPass()
	{
		return userPass;
	}

	public void setUserPass(String userPass)
	{
		this.userPass = userPass;
	}

	public String getUserSex()
	{
		return userSex;
	}

	public void setUserSex(String userSex)
	{
		this.userSex = userSex;
	}

	public String getUserTel()
	{
		return userTel;
	}

	public void setUserTel(String userTel)
	{
		this.userTel = userTel;
	}

	public String getUserPoint()
	{
		return userPoint;
	}

	public void setUserPoint(String userPoint)
	{
		this.userPoint = userPoint;
	}

	public String getUserState()
	{
		return userState;
	}

	public void setUserState(String userState)
	{
		this.userState = userState;
	}

	public String getUserEmile()
	{
		return userEmile;
	}

	public void setUserEmile(String userEmile)
	{
		this.userEmile = userEmile;
	}

	public String getUserJob()
	{
		return userJob;
	}

	public void setUserJob(String userJob)
	{
		this.userJob = userJob;
	}

	public String getLevelName()
	{
		return levelName;
	}

	public void setLevelName(String levelName)
	{
		this.levelName = levelName;
	}

	public String getRegTime()
	{
		return regTime;
	}

	public void setRegTime(String regTime)
	{
		this.regTime = regTime;
	}

	@Override
	public String toString()
	{
		return "Userinfo{" + "userId=" + userId + ", userName='" + userName + '\'' + ", userPass='" + userPass + '\'' + ", userSex='" + userSex + '\'' + ", userTel='" + userTel + '\'' + ", userPoint='" + userPoint + '\'' + ", userState='" + userState + '\'' + ", userEmile='" + userEmile + '\'' + ", userJob='" + userJob + '\'' + ", levelName='" + levelName + '\'' + ", regTime='" + regTime + '\'' + '}';
	}
}
