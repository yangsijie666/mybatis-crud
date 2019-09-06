package cn.sxt.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis.cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSession() throws IOException {
        return getSqlSessionFactory().openSession();
    }
}
