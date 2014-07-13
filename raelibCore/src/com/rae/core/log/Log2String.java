package com.rae.core.log;

/**
 * 默认的日志记录
 * 
 * @author Chenrui
 * 
 */
public class Log2String extends ILog
{
	private String	tag;
	
	public Log2String()
	{
		tag = "RaeLog2String";
	}
	
	public Log2String(Class<?> cls)
	{
		tag = cls.getName();
	}
	
	@Override
	public void log(Exception e)
	{
		// 
		this.e("SystemRuntime", android.util.Log.getStackTraceString(e));
	}
	
	@Override
	public void e(String tag, Object msg)
	{
		// 错误是必须输出的
		android.util.Log.e(tag, convert(msg));
	}
	
	@Override
	public void w(String tag, Object msg)
	{
		// 警告是必须输出的
		android.util.Log.w(tag, convert(msg));
	}
	
	@Override
	public void i(String tag, Object msg)
	{
		if (!ENABLE_DBUG) return;
		android.util.Log.i(tag, convert(msg));
	}
	
	@Override
	public void v(String tag, Object msg)
	{
		if (!ENABLE_DBUG) return;
		android.util.Log.v(tag, convert(msg));
	}
	
	@Override
	public void d(String tag, Object msg)
	{
		if (!ENABLE_DBUG) return;
		android.util.Log.d(tag, convert(msg));
	}
	
	@Override
	public void e(Object msg)
	{
		this.e(tag, msg);
	}
	
	@Override
	public void w(Object msg)
	{
		this.w(tag, msg);
	}
	
	@Override
	public void i(Object msg)
	{
		this.i(tag, msg);
	}
	
	@Override
	public void v(Object msg)
	{
		this.v(tag, msg);
	}
	
	@Override
	public void d(Object msg)
	{
		this.d(tag, msg);
	}
	
	private String convert(Object msg)
	{
		return msg == null ? "" : msg.toString();
	}
}
