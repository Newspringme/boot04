package com.great.pojo;

/**
 * @author su
 * @date 2020/5/22-6:12
 */
public class Loginfo
{
	private Integer logId;
	private String logType;
	private String operatorName;
	private String logDate;
	private String logSpare;
	private String startTime;
	private String endTime;

	public Loginfo()
	{
	}

	public Loginfo(Integer logId, String logType, String operatorName, String logDate)
	{
		this.logId = logId;
		this.logType = logType;
		this.operatorName = operatorName;
		this.logDate = logDate;
	}

	public Loginfo(Integer logId, String logType, String operatorName, String logDate, String logSpare)
	{
		this.logId = logId;
		this.logType = logType;
		this.operatorName = operatorName;
		this.logDate = logDate;
		this.logSpare = logSpare;
	}

	public Loginfo(Integer logId, String logType, String operatorName, String logDate, String logSpare, String startTime, String endTime)
	{
		this.logId = logId;
		this.logType = logType;
		this.operatorName = operatorName;
		this.logDate = logDate;
		this.logSpare = logSpare;
		this.startTime = startTime;
		this.endTime = endTime;
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

	public String getLogSpare()
	{
		return logSpare;
	}

	public void setLogSpare(String logSpare)
	{
		this.logSpare = logSpare;
	}

	public Integer getLogId()
	{
		return logId;
	}

	public void setLogId(Integer logId)
	{
		this.logId = logId;
	}

	public String getLogType()
	{
		return logType;
	}

	public void setLogType(String logType)
	{
		this.logType = logType;
	}

	public String getOperatorName()
	{
		return operatorName;
	}

	public void setOperatorName(String operatorName)
	{
		this.operatorName = operatorName;
	}

	public String getLogDate()
	{
		return logDate;
	}

	public void setLogDate(String logDate)
	{
		this.logDate = logDate;
	}

	@Override
	public String toString()
	{
		return "Loginfo{" + "logId=" + logId + ", logType='" + logType + '\'' + ", operatorName='" + operatorName + '\'' + ", logDate='" + logDate + '\'' + '}';
	}
}

