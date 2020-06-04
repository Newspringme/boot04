package com.great.pojo;

/**
 * @author su
 * @date 2020/5/17-22:09
 */
public class Docinfo
{
	private int docId;
	private String docName;
	private String docType;
	private String docSize;
	private String upName;
	private String upTime;//上传时间
	private int downPoint;
	private String docState;
	private String docIntro;
	private String downTime;//下载次数
	private String docPath;
	private String startTime;
	private String endTime;
	private String fileName;

	public Docinfo()
	{
	}


	public Docinfo(int docId, String docName, String docType, String docSize, String upName, String upTime, int downPoint, String docState, String docIntro, String downTime, String docPath, String startTime, String endTime)
	{
		this.docId = docId;
		this.docName = docName;
		this.docType = docType;
		this.docSize = docSize;
		this.upName = upName;
		this.upTime = upTime;
		this.downPoint = downPoint;
		this.docState = docState;
		this.docIntro = docIntro;
		this.downTime = downTime;
		this.docPath = docPath;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Docinfo(int docId, String docName, String docType, String docSize, String upName, String upTime, int downPoint, String docState, String docIntro, String downTime, String docPath, String startTime, String endTime, String fileName)
	{
		this.docId = docId;
		this.docName = docName;
		this.docType = docType;
		this.docSize = docSize;
		this.upName = upName;
		this.upTime = upTime;
		this.downPoint = downPoint;
		this.docState = docState;
		this.docIntro = docIntro;
		this.downTime = downTime;
		this.docPath = docPath;
		this.startTime = startTime;
		this.endTime = endTime;
		this.fileName = fileName;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
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

	public int getDocId()
	{
		return docId;
	}

	public void setDocId(int docId)
	{
		this.docId = docId;
	}

	public String getDocName()
	{
		return docName;
	}

	public void setDocName(String docName)
	{
		this.docName = docName;
	}

	public String getDocType()
	{
		return docType;
	}

	public void setDocType(String docType)
	{
		this.docType = docType;
	}

	public String getDocSize()
	{
		return docSize;
	}

	public void setDocSize(String docSize)
	{
		this.docSize = docSize;
	}

	public String getUpName()
	{
		return upName;
	}

	public void setUpName(String upName)
	{
		this.upName = upName;
	}

	public String getUpTime()
	{
		return upTime;
	}

	public void setUpTime(String upTime)
	{
		this.upTime = upTime;
	}

	public int getDownPoint()
	{
		return downPoint;
	}

	public void setDownPoint(int downPoint)
	{
		this.downPoint = downPoint;
	}

	public String getDocState()
	{
		return docState;
	}

	public void setDocState(String docState)
	{
		this.docState = docState;
	}

	public String getDocIntro()
	{
		return docIntro;
	}

	public void setDocIntro(String docIntro)
	{
		this.docIntro = docIntro;
	}

	public String getDownTime()
	{
		return downTime;
	}

	public void setDownTime(String downTime)
	{
		this.downTime = downTime;
	}

	public String getDocPath()
	{
		return docPath;
	}

	public void setDocPath(String docPath)
	{
		this.docPath = docPath;
	}

	@Override
	public String toString()
	{
		return "Docinfo{" + "docId=" + docId + ", docName='" + docName + '\'' + ", docType='" + docType + '\'' + ", docSize='" + docSize + '\'' + ", upName='" + upName + '\'' + ", upTime='" + upTime + '\'' + ", downPoint='" + downPoint + '\'' + ", docState='" + docState + '\'' + ", docIntro='" + docIntro + '\'' + ", downTime='" + downTime + '\'' + ", docPath='" + docPath + '\'' + '}';
	}
}
