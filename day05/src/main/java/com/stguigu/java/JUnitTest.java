package com.stguigu.java;

import org.junit.*;

/**
 * @author shkstart
 * @create 2022-12-14 20:15
 */
public class JUnitTest {
    private static Object[] array;
    private static int total;
    @BeforeClass
    public static void init(){
        System.out.println("初始化数组");
        array=new Object[5];
    }
    @Before
    public void before(){
        System.out.println("调用之前total=" + total);
    }
    @Test
    public void add(){
        //往数组中存储一个元素
        System.out.println("add");
        array[total++]="hello";
    }
    @After
    public void after(){
        System.out.println("调用之前total=" + total);
    }
    @AfterClass
    public static void destroy(){
        array=null;
        System.out.println("销毁数组");
    }

}
