package a040_socket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ����һ��URL��ʵ���Ͳ���
 * @author Administrator
 *
 */
public class A002_CreateURL {
	public static void main(String[] args) throws MalformedURLException {
		//����һ��URL��ʵ��
		URL baidu =new URL("http://www.baidu.com");
		URL url =new URL(baidu,"/index.html?username=tom#test");//����ʾ������#��ʾê��
		url.getProtocol();//��ȡЭ��
		url.getHost();//��ȡ����
		url.getPort();//���û��ָ���˿ںţ�����Э�鲻ͬʹ��Ĭ�϶˿ڡ���ʱgetPort()�����ķ���ֵΪ -1
		url.getPath();//��ȡ�ļ�·��
		url.getFile();//�ļ����������ļ�·��+����
		url.getRef();//���·��������ê�㣬��#�ź��������
		url.getQuery();//��ѯ�ַ�����������
		
		System.out.println("Э�飺"+url.getProtocol()+"  ������"+url.getHost()+"  �˿ںţ�"+url.getPort());
	}
}
