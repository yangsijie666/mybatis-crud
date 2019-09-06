package cn.sxt.dao;

import cn.sxt.entity.User;
import cn.sxt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDao {

    public List<User> getAll() throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        List<User> list = session.selectList("UserMapper.selectAll");
        session.close();
        return list;
    }

    public User getById(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        User user = session.selectOne("UserMapper.selectUser", id);
        session.close();
        return user;
    }

    public int add(User user) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.insert("UserMapper.addUser", user);
        // 这里需要手动提交事务
        session.commit();
        session.close();
        return result;
    }

    public int update(User user) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.update("UserMapper.updateUser", user);
        session.commit();
        session.close();
        return result;
    }

    public int delete(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.delete("UserMapper.deleteUser", id);
        session.commit();
        session.close();
        return result;
    }
}
