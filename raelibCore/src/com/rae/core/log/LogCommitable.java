package com.rae.core.log;

/**
 * 用于将本地日志提交到服务中
 * 
 * @author Chenrui
 * 
 */
public interface LogCommitable
{
	/**
	 * 提交日志，调用log.getLogs();接口获取所有的日志
	 * 
	 * @param <T>
	 * 
	 * @param reader
	 *            日志读取接口
	 */
	<T> void commit(LogReader<T> reader);
}
