package com003.spring;

import com003.spring.interfaces.Candidate;

public class ProxyTest1 {
	public static void main(String[] args) {
        Candidate c = new Gunman(new LazyStudent("王小二"));
        c.answerTheQuestions();
    }
}
/**
 * 枪手
 * @author 骆昊
 *
 */
class Gunman implements Candidate {
    private Candidate target;   // 被代理对象

    public Gunman(Candidate target) {
        this.target = target;
    }

    @Override
    public void answerTheQuestions() {
        // 枪手要写上代考的学生的姓名
        target.answerTheQuestions();
        // 枪手要帮助懒学生答题并交卷
        System.out.println("奋笔疾书正确答案");
        System.out.println("交卷");
    }

}

/**
 * 懒学生
 * @author 骆昊
 *
 */
class LazyStudent implements Candidate {
    private String name;        // 姓名

    public LazyStudent(String name) {
        this.name = name;
    }

    @Override
    public void answerTheQuestions() {
        // 懒学生只能写出自己的名字不会答题
        System.out.println("姓名: " + name);
    }

}