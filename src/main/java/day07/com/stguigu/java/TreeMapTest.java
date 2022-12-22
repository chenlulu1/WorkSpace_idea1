package day07.com.stguigu.java;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-12-22 11:16
 */
public class TreeMapTest {
    //想TreeMap中添加key-value，要求可以必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    //自然排序
    @org.junit.Test
    public void test1() {
        TreeMap map = new TreeMap();
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 33);
        Person p3 = new Person("Jack", 10);
        Person p4 = new Person("Rose", 18);
        map.put(p1, 98);
        map.put(p2, 56);
        map.put(p3, 79);
        map.put(p4, 100);
        Set set = map.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
    //定制排序
    @org.junit.Test
    public void test2() {
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person&&o2 instanceof Person){
                    Person person1=(Person)o1;
                    Person person2=(Person)o2;
                    return Integer.compare(person1.getAge(),person2.getAge());
                }
                throw new RuntimeException("传入的类型不匹配！");
            }
        });
        Person p1 = new Person("Tom", 23);
        Person p2 = new Person("Jerry", 33);
        Person p3 = new Person("Jack", 10);
        Person p4 = new Person("Rose", 18);
        map.put(p1, 98);
        map.put(p2, 56);
        map.put(p3, 79);
        map.put(p4, 100);
        Set set = map.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
