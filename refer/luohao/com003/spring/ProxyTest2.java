package com003.spring;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 从JDK 1.3开始，Java提供了动态代理技术，允许开发者在运行时创建接口的代理实例，主要包括Proxy类和InvocationHandler接口。下面的例子使用动态代理为ArrayList编写一个代理，在添加和删除元素时，在控制台打印添加或删除的元素以及ArrayList的大小：
 * 
 * 说明：使用Java的动态代理有一个局限性就是代理的类必须要实现接口，虽然面向接口编程是每个优秀的Java程序都知道的规则，但现实往往不尽如人意，对于没有实现接口的类如何为其生成代理呢？继承！继承是最经典的扩展已有代码能力的手段，虽然继承常常被初学者滥用，但继承也常常被进阶的程序员忽视。CGLib采用非常底层的字节码生成技术，通过为一个类创建子类来生成代理，它弥补了Java动态代理的不足，因此Spring中动态代理和CGLib都是创建代理的重要手段，对于实现了接口的类就用动态代理为其生成代理类，而没有实现接口的类就用CGLib通过继承的方式为其创建代理。
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
