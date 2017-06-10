package a040_socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * 获取本机的InetAddress和其它相关操作
 * @author Administrator
 *
 */
public class A001_InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		//获取本机的InetAddress实例
		InetAddress address =InetAddress.getLocalHost();
		address.getHostName();//获取计算机名
		address.getHostAddress();//获取IP地址
		byte[] bytes = address.getAddress();//获取字节数组形式的IP地址,以点分隔的四部分
		System.out.println("计算机名:"+address.getHostName()+"  IP地址:"+address.getHostAddress()+"   获取字节数组形式的IP地址："+address.getAddress());
		
		//获取其他主机的InetAddress实例
		/*InetAddress address2 =InetAddress.getByName("其他主机名");
		InetAddress address3 =InetAddress.getByName("IP地址");*/
	}
}
