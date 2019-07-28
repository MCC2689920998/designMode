package structural.filter.entity;

import lombok.Data;

/**
 * @Author MCC
 * @Create 2019/7/28 8:07
 */
@Data
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
