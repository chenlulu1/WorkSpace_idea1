package day04.com.stguigu.java;

import org.junit.Test;

/**
 * @author shkstart
 * @create 2022-12-13 10:37
 */
public class IDEADebug {
    @Test
    public void test3() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);//抛异常NullPointerException
        System.out.println(sb1);//

    }
}

