package com.rae.core.log;

/**
 * 日志记录尸体
 * 
 * @author Chenrui
 * 
 */
public class LogModel
{
	private String		level, tag, message, className, lineNumber;
	
	private Exception	exception;
	
	public String getLevel()
	{
		return level;
	}
	
	public void setLevel(String level)
	{
		this.level = level;
	}
	
	public String getTag()
	{
		return tag;
	}
	
	public void setTag(String tag)
	{
		this.tag = tag;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public Exception getException()
	{
		return exception;
	}
	
	public void setException(Exception exception)
	{
		this.exception = exception;
	}
	
	public String getClassName()
	{
		return className;
	}
	
	public void setClassName(String className)
	{
		this.className = className;
	}
	
	public String getLineNumber()
	{
		return lineNumber;
	}
	
	public void setLineNumber(String lineNumber)
	{
		this.lineNumber = lineNumber;
	}
}
