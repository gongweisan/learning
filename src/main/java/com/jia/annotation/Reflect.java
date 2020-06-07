package com.jia.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * Reflect
 *
 * @author sansan
 * @date 2020/6/2
 */
public class Reflect {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.jia.annotation.AnnStudent");
            Annotation[] annotations = clazz.getAnnotations();
            for(Annotation a:annotations){
                System.out.println(a);
            }
            //获取指定的注解
            TableStudent student = (TableStudent) clazz.getAnnotation(TableStudent.class);
            System.out.println(student.value());
            //获取类的属性注解
            Field f = clazz.getDeclaredField("id");
            StudentField studentField = f.getAnnotation(StudentField.class);
            System.out.println(studentField.columnName()+studentField.type()+studentField.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
