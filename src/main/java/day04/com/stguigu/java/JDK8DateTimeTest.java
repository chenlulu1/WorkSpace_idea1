package day04.com.stguigu.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * jdk8中日期时间API的测试
 *
 * @author shkstart
 * @create 2022-12-12 19:34
 */
public class JDK8DateTimeTest {
    @Test
    public void testDate(){
        Date date1=new Date(2020-1900,9-1,8);
        System.out.println(date1);
    }
    /*
    LocalDate、LocalTime、LocalDateTime的使用
    说明：
    1、LocalDateTime相较于LocalDate、LocalTime，使用频率要高

     */
    @Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 11, 20, 15, 23);
        System.out.println(localDateTime1);
        //getXxx():获取相关属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());
        //体现不可变性
        //withXxx()：设置相关属性
        LocalDate localDate1 = localDate.withDayOfMonth(23);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        ////体现不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);

    }
    /*
    Instant的使用
    类似于java.util.Date
     */
    @Test
    public void test2(){
        //new()获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-12-12T12:02:48.574087800Z
        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //获取示自1970年1月1日0时0分0秒（UTC）开始的毫秒数--->Date类的getTime（）
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        //ofEpochMilli（）:通过给定的毫秒数，获取Instant实例 --->Date（long millis）
        Instant instant1 = Instant.ofEpochMilli(155555555555L);
        System.out.println(instant1);



    }
    /*
    DateTimeFormatter:格式化或解析日期、时间
    类似于SimpleDateFormat
     */
    @Test
    public void test3(){
        //预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);//2022-12-12T20:19:24.7103972

        //解析：字符串-->日期
        TemporalAccessor parse = formatter.parse("2022-12-12T20:19:24.7103972");
        System.out.println(parse);

        //方式二
        //本地化相关的格式。如：ofLocalizedDateTime()
        //FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT:适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withZone(ZoneId.systemDefault());
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//2022年12月12日 CST 下午8:47:22

//        本地化相关的格式。如：ofLocalizedDate()
        //FormatStyle.FULL/FormatStyle.LONG/FormatStyle.MEDIUM/FormatStyle.SHORT:适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2022年12月12日星期一


        //重点：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2022-12-12 20:55:21
        //解析
        TemporalAccessor accessor = formatter3.parse("2022-12-12 20:55:21");
        System.out.println(accessor);

    }
}
