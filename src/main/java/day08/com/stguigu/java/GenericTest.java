package day08.com.stguigu.java;

import org.junit.Test;

import java.util.*;

/**
 *泛型的使用
 * 1、jdk5.0新增的特性
 * 2.在集合中使用泛型：
 *  总结：
 *  ①集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 *  ②在实例化集合类时。可以指明具体的泛型类型
 *  ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指明为实例化的泛型类型。
 *    比如：add（E e）--->实例化以后：add(Integer e)
 *  ④注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换。
 *  ⑤如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型。
 *
 * 3、如何自定义泛型结构：泛型类、泛型接口、泛型方法.见：GenericTest1.java
 *
 *
 * @author shkstart
 * @create 2022-12-22 20:37
 */
public class GenericTest {
    //在集合中使用泛型之前的情况：以ArrayList为例
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生成绩
        list.add(78);
        list.add(88);
        list.add(89);
        list.add(76);
        //问题一：类型不安全,ClassCastException类型转换异常
//        list.add("Tom");
        //方式一
//        for (Object score:list){
//            int stuScore=(Integer)score;
//            System.out.println(stuScore);
//        }
        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }
    //在集合中使用泛型之前的情况：以HashMap为例
    @Test
    public void test3(){
        //jdk7.0新特性：类型推断
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom",87);
        map.put("Jack",87);
        map.put("Jerry",67);
        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "_____" + value);
        }
    }
    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        //需求：存放学生成绩
        list.add(78);
        list.add(88);
        list.add(89);
        list.add(76);
        //编译时，就会进行类型检查，保证数据安全
        //        list.add("Tom");
        for (Integer score:list){
            //避免了强转操作
            Integer stuScore = score;
            System.out.println(stuScore);
        }

    }

}
