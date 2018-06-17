package test.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.entity.User;

public class DBConnectionTest {
    private  String resource="beans.xml";
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession=null;

    public SqlSession getSqlSession()throws Exception{
        //获取spring对象
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
        //从配置对象中创建会话工厂 并且注入mybatis信息
        sqlSessionFactory= (SqlSessionFactory) applicationContext.getBean("sqlsessionFactory");
        //得到sqlseesion
        sqlSession=sqlSessionFactory.openSession();
       return sqlSession;
    }


    public void TestSelect() throws Exception {
        sqlSession=this.getSqlSession();
        User user=sqlSession.selectOne("test.findUserByName","张三");
        System.out.println(user.getName());
    }
}
