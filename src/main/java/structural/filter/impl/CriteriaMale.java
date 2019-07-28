package structural.filter.impl;

import com.google.common.collect.Lists;
import structural.filter.Criteria;
import structural.filter.entity.Person;


import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/28 8:08
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = Lists.newArrayList();
        for (Person person : persons) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
