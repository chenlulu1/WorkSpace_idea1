package day06.com.stguigu.java1;

import day06.com.stguigu.java.Person;
import org.junit.Test;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-12-19 20:55
 */
public class TreeSetTest {
    /*
    1.向TreeSet中添加的数据，要求是相同的对象。
    2.两种排序方式：自然排序（实现Comparable接口）和定制排序（Comparator）
    3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()。
    4.自然排序中，比较两个对象是否相同的标准为：compare()返回0，不再是equals()。
     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        //错误的，不能添加不同类的对象
//        set.add(456);
//        set.add(123);
//        set.add("AA");
//        set.add("CC");
//        set.add(new Person("Tom",12));
//        set.add(129);
        //举例1
//        set.add(123);
//        set.add(-123);
//        set.add(8);
//        set.add(1);
//        set.add(10);
        //举例2
        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",50));
        set.add(new Person("Jim",19));
        set.add(new Person("Mike",2));
        set.add(new Person("Jack",33));
        set.add(new Person("Jack",56));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
    @Test
    public void test2(){
        Comparator com=new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person&&o2 instanceof Person){
                    Person p1=(Person)o1;
                    Person p2=(Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else {
                    throw new RuntimeException("输入的数据不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",50));
        set.add(new Person("Mary",50));
        set.add(new Person("Jim",19));
        set.add(new Person("Mike",2));
        set.add(new Person("Jack",33));
        set.add(new Person("Jack",56));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
