package a100_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE,ElementType.METHOD }) //��ǰ�涨���ע�ⲻͬ�ĵط�������ʹ����Ԫע��Target
public @interface A000_Annotation {
//���ﶨ����һ���յ�ע�⣬���ܸ�ʲô�ء���Ҳ��֪�����������á�
}
