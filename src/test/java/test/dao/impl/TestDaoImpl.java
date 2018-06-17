package test.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import test.dao.TestDao;
import test.entity.User;

import java.util.List;
@Repository//为了让这个包被spring扫到
public class TestDaoImpl implements TestDao {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession=null;
    private SqlSession getSqlSession(){
        if(sqlSession==null){
            sqlSession=sqlSessionFactory.openSession();
        }
        return sqlSession;
    }
    @Override
    public List<User> findUserByName(User user) {
        List<User> uList=getSqlSession().selectList("test.findUserByName","%"+user.getName()+"%");
        return uList;
    }
}
