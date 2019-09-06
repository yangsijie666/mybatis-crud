import cn.sxt.dao.UserDao;
import cn.sxt.entity.User;

import java.io.IOException;
import java.util.List;

public class Test {
    @org.junit.Test
    public void selectAllTest() throws IOException {
        UserDao userDao = new UserDao();
        List<User> list = userDao.getAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void selectTest() throws IOException {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getById(1));
    }

    @org.junit.Test
    public void insertTest() throws IOException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("yqyq");
        user.setPwd("999999");
        System.out.println(userDao.add(user));
    }

    @org.junit.Test
    public void updateTest() throws IOException {
        UserDao userDao = new UserDao();
        User user = userDao.getById(7);
        user.setPwd("22222");
        System.out.println(userDao.update(user));
    }

    @org.junit.Test
    public void deleteTest() throws IOException {
        UserDao userDao = new UserDao();
        System.out.println(userDao.delete(8));
    }
}
