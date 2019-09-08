package cn.sxt.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    /**
     * 通过文件创建SqlSessionFactory，是SqlSession的工厂类
     * @return
     * @throws IOException
     */
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis.cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * SqlSession通过id找到对应的SQL语句，执行SQL语句
     * @return
     * @throws IOException
     */
    public static SqlSession getSession() throws IOException {
        return getSqlSessionFactory().openSession();
    }
}
