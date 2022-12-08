package day03.com.stguigu.exer;

import org.junit.Test;

/**
 * 练习5：常见算法题目
 * 1. 模拟一个trim方法，去除字符串两端的空格。
 *
 * 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
 *
 * 3. 获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 *
 * 4.获取两个字符串中最大相同子串。比如：str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * 5.对字符串中字符进行自然顺序排序。
 * 提示：
 * 1）字符串变成字符数组。
 * 2）对数组排序，选择，冒泡，Arrays.sort();
 * 3）将排序后的数组变成字符串。
 *
 *
 * @author shkstart
 * @create 2022-12-07 21:08
 */
public class StringTest2 {
    // 第2题 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
    // 方式一：
    public String reverse1(String str, int start, int end) {// start:2,end:5
        if (str != null) {
            // 1.
            char[] charArray = str.toCharArray();
            // 2.
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            // 3.
            return new String(charArray);

        }
        return null;

    }

    // 方式二：
    public String reverse2(String str, int start, int end) {
        // 1.
        String newStr = str.substring(0, start);// ab
        // 2.
        for (int i = end; i >= start; i--) {
            newStr += str.charAt(i);
        } // abfedc
        // 3.
        newStr += str.substring(end + 1);
        return newStr;
    }

    // 方式三：推荐 （相较于方式二做的改进）
    public String reverse3(String str, int start, int end) {// ArrayList list = new ArrayList(80);
        // 1.
        StringBuffer s = new StringBuffer(str.length());
        // 2.
        s.append(str.substring(0, start));// ab
        // 3.
        for (int i = end; i >= start; i--) {
            s.append(str.charAt(i));
        }

        // 4.
        s.append(str.substring(end + 1));

        // 5.
        return s.toString();

    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String str1 = reverse3(str, 2, 5);
        System.out.println(str1);// abfedcg

    }
}
