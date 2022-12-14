package com.stguigu.java;

/**
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 *
 * @author shkstart
 * @create 2022-12-13 20:37
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println(Season1.class.getSuperclass());
        System.out.println("*********************************");
        //values();
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
        //valueOf(String str):返回枚举类中对象是str的对象

        //如果没有str的枚举类对象，则抛异常：IllegalArgumentException
//        Season1 winter = Season1.valueOf("WINTER1");

        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();

    }
}
interface Info{
    void show();
}


//使用enum关键字枚举类
enum Season1 implements Info{
    //提供当前枚举类的对象，多个对象之间用","隔开，末尾用";"结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");

        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");

        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };
    //声明Season对象    的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //私有化类的构造器，并给对象属性赋值
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类对象的属性


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.其他诉求2：toString()


//    @Override
//    public java.lang.String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
//@Override
//public void show() {
//    System.out.println("这是一个季节");
//}
}

