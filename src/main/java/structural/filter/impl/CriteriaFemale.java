package structural.filter.impl;

import com.google.common.collect.Lists;
import structural.filter.Criteria;
import structural.filter.entity.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/28 8:08
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = Lists.newArrayList();
        for (Person person : persons) {
            if ("FEMALE".equalsIgnoreCase(person.getGender())) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
