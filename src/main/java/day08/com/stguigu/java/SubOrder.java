package day08.com.stguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-22 21:40
 */
//异常类不能声明为泛型类
public class SubOrder extends Order<Integer> {//继承父类泛型
    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的类是不是泛型类都没有关系。
    public static <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list=new ArrayList<>();
        for(E e:list){
            list.add(e);
        }
        return list;
    }
}
