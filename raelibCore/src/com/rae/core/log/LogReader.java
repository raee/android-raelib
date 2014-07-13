package com.rae.core.log;

/**
 * 读取日志接口
 * 
 * @author Chenrui
 * 
 */
public interface LogReader<T>
{
	public T getLogs();
}
