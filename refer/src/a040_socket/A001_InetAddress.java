package a040_socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * ��ȡ������InetAddress��������ز���
 * @author Administrator
 *
 */
public class A001_InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		//��ȡ������InetAddressʵ��
		InetAddress address =InetAddress.getLocalHost();
		address.getHostName();//��ȡ�������
		address.getHostAddress();//��ȡIP��ַ
		byte[] bytes = address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ,�Ե�ָ����Ĳ���
		System.out.println("�������:"+address.getHostName()+"  IP��ַ:"+address.getHostAddress()+"   ��ȡ�ֽ�������ʽ��IP��ַ��"+address.getAddress());
		
		//��ȡ����������InetAddressʵ��
		/*InetAddress address2 =InetAddress.getByName("����������");
		InetAddress address3 =InetAddress.getByName("IP��ַ");*/
	}
}
