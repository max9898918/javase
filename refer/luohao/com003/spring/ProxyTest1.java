package com003.spring;

import com003.spring.interfaces.Candidate;

public class ProxyTest1 {
	public static void main(String[] args) {
        Candidate c = new Gunman(new LazyStudent("��С��"));
        c.answerTheQuestions();
    }
}
/**
 * ǹ��
 * @author ���
 *
 */
class Gunman implements Candidate {
    private Candidate target;   // ���������

    public Gunman(Candidate target) {
        this.target = target;
    }

    @Override
    public void answerTheQuestions() {
        // ǹ��Ҫд�ϴ�����ѧ��������
        target.answerTheQuestions();
        // ǹ��Ҫ������ѧ�����Ⲣ����
        System.out.println("�ܱʼ�����ȷ��");
        System.out.println("����");
    }

}

/**
 * ��ѧ��
 * @author ���
 *
 */
class LazyStudent implements Candidate {
    private String name;        // ����

    public LazyStudent(String name) {
        this.name = name;
    }

    @Override
    public void answerTheQuestions() {
        // ��ѧ��ֻ��д���Լ������ֲ������
        System.out.println("����: " + name);
    }

}