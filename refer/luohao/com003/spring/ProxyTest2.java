package com003.spring;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * ��JDK 1.3��ʼ��Java�ṩ�˶�̬����������������������ʱ�����ӿڵĴ���ʵ������Ҫ����Proxy���InvocationHandler�ӿڡ����������ʹ�ö�̬����ΪArrayList��дһ����������Ӻ�ɾ��Ԫ��ʱ���ڿ���̨��ӡ��ӻ�ɾ����Ԫ���Լ�ArrayList�Ĵ�С��
 * 
 * ˵����ʹ��Java�Ķ�̬������һ�������Ծ��Ǵ���������Ҫʵ�ֽӿڣ���Ȼ����ӿڱ����ÿ�������Java����֪���Ĺ��򣬵���ʵ�������������⣬����û��ʵ�ֽӿڵ������Ϊ�����ɴ����أ��̳У��̳���������չ���д����������ֶΣ���Ȼ�̳г�������ѧ�����ã����̳�Ҳ���������׵ĳ���Ա���ӡ�CGLib���÷ǳ��ײ���ֽ������ɼ�����ͨ��Ϊһ���ഴ�����������ɴ������ֲ���Java��̬����Ĳ��㣬���Spring�ж�̬�����CGLib���Ǵ����������Ҫ�ֶΣ�����ʵ���˽ӿڵ�����ö�̬����Ϊ�����ɴ����࣬��û��ʵ�ֽӿڵ������CGLibͨ���̳еķ�ʽΪ�䴴������
 * @author Administrator
 *
 */
public class ProxyTest2 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Class<?> clazz = list.getClass();
        ListProxy<String> myProxy = new ListProxy<String>(list);
        List<String> newList = (List<String>)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), myProxy);
        newList.add("apple");
        newList.add("banana");
        newList.add("orange");
        newList.remove("banana");
    }
}
