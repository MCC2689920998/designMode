package structural.filter;

import structural.filter.entity.Person;

import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/28 8:08
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
