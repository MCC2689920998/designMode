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
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = Lists.newArrayList();
        for (Person person : persons) {
            if ("SINGLE".equalsIgnoreCase(person.getGender())) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
