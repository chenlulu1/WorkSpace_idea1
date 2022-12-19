package day06.com.stguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-19 19:56
 */
public class ListExer {
    /*
    区分List中remove(int index)和remove(Object obj)

     */
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }
    private static void updateList(List list) {
        list.remove(2);
    }
}
