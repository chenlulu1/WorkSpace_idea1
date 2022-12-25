package day08.com.stguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-12-25 19:25
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);
        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }
}
