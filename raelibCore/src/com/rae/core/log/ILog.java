package com.rae.core.log;

/**
 * 日志记录
 * 
 * @author Chenrui
 * 
 */
public abstract class ILog
{
	public static boolean	ENABLE_DBUG	= true;
	
	/**
	 * 记录异常，默认的tag为SystemRuntime
	 * 
	 * @param e
	 *            异常
	 */
	public abstract void log(Exception e);
	
	/**
	 * 记录错误
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
	 */
	public abstract void e(String tag, Object msg);
	
	/**
	 * 记录警告
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
	 */
	public abstract void w(String tag, Object msg);
	
	/**
	 * 记录提示
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
	 */
	public abstract void i(String tag, Object msg);
	
	/**
	 * 记录
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
	 */
	public abstract void v(String tag, Object msg);
	
	/**
	 * 记录调试
	 * 
	 * @param tag
	 *            标签
	 * @param msg
	 *            信息
	 */
	public abstract void d(String tag, Object msg);
	
	/*
	 * 记录会自动获取异常出错类作为tag
	 */
	public abstract void e(Object msg);
	
	public abstract void w(Object msg);
	
	public abstract void i(Object msg);
	
	public abstract void v(Object msg);
	
	public abstract void d(Object msg);
	
}
