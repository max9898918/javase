package a070_annotation;
public @interface Table {
    /**
     * ���ݱ�����ע�⣬Ĭ��ֵΪ������
     * @return
     */
    public String tableName() default "className";
}
