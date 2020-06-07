package com.jia.annotation;

/**
 * AnnStudent
 *
 * @author sansan
 * @date 2020/6/2
 */
@TableStudent("tb_student")
public class AnnStudent {

    @StudentField(columnName = "id",type = "int" ,length = 10)
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
