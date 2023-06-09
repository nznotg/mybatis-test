package com.mybatis.mybatisspringtrytwo.repository;

import com.mybatis.mybatisspringtrytwo.domain.entity.Foo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Deprecated
@Component
public class FooDao {
    //
    private SqlSession sqlSession;

    public FooDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Foo> findAllFoo() {
        //
        return sqlSession.selectList("selectList");
    }

    public Foo findById(String id) {
        //
        return sqlSession.selectOne("selectById", id);
    }
}
