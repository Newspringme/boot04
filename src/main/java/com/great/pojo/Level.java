package com.great.pojo;


/**
 * @author su
 * @date 2020/5/15-10:44
 */
public class Level
{
	private int levelId;
	private String levelName;
	private Float downRatio;

	public Level()
	{
	}

	public Level(int levelId, String levelName)
	{
		this.levelId = levelId;
		this.levelName = levelName;
	}

	public Level(int levelId, String levelName, Float downRatio)
	{
		this.levelId = levelId;
		this.levelName = levelName;
		this.downRatio = downRatio;
	}

	public Float getDownRatio()
	{
		return downRatio;
	}

	public void setDownRatio(Float downRatio)
	{
		this.downRatio = downRatio;
	}

	public int getLevelId()
	{
		return levelId;
	}

	public void setLevelId(int levelId)
	{
		this.levelId = levelId;
	}

	public String getLevelName()
	{
		return levelName;
	}

	public void setLevelName(String levelName)
	{
		this.levelName = levelName;
	}
}
