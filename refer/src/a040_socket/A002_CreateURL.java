package a040_socket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 创建一个URL的实例和操作
 * @author Administrator
 *
 */
public class A002_CreateURL {
	public static void main(String[] args) throws MalformedURLException {
		//创建一个URL的实例
		URL baidu =new URL("http://www.baidu.com");
		URL url =new URL(baidu,"/index.html?username=tom#test");//？表示参数，#表示锚点
		url.getProtocol();//获取协议
		url.getHost();//获取主机
		url.getPort();//如果没有指定端口号，根据协议不同使用默认端口。此时getPort()方法的返回值为 -1
		url.getPath();//获取文件路径
		url.getFile();//文件名，包括文件路径+参数
		url.getRef();//相对路径，就是锚点，即#号后面的内容
		url.getQuery();//查询字符串，即参数
		
		System.out.println("协议："+url.getProtocol()+"  主机："+url.getHost()+"  端口号："+url.getPort());
	}
}
