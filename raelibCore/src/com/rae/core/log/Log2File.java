package com.rae.core.log;

import java.io.File;
import java.io.IOException;

import android.os.Environment;

public class Log2File extends Log2String
{
	/**
	 * 写入文件
	 * 
	 * @param path
	 * @param str
	 */
	public void writeToFile(String path, String str)
	{
		File file = isFileAvailable(path);
		
		// 检查路径是否正确
		if (file == null)
		{
			e("Log2File", "文件路径不可用：" + path);
			return;
		}
		
		// TODO：写文件
		
	}
	
	public File isFileAvailable(String path)
	{
		try
		{
			File file = new File(path);
			boolean result = file.exists();
			if (result) return file; // 已经存在
			result = file.mkdirs(); // 第一步创建文件夹
			if (result) result = file.createNewFile(); // 第二步创建文件
			if (result) return file;
			// 都创建不成功，从临时目录下创建
			file = Environment.getDownloadCacheDirectory();
			if (file != null)
			{
				file = new File(file.getPath()
						+ path.substring(path.lastIndexOf("/")));
				result = file.createNewFile();
				if (result) return file;
			}
			return file;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
