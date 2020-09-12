import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.lieying.bean.Position;
import org.lieying.bean.PositionCategory;
import org.lieying.dao.PositionCategoryMapper;

import org.lieying.dao.PositionMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;


public class TestSpringMybatis {

    @Test
    public void testFindPositionCategories(){
        ApplicationContext applicationContext=new
                FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        SqlSessionFactory sqlSessionFactory= (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession=sqlSessionFactory.openSession();
        PositionMapper positionMapper=sqlSession.getMapper(PositionMapper.class);
//        List<Position> positions =positionMapper.selectPositionsByCriteria("软",null,null,null,null,null,null,null,null);
//        System.out.println(positions);

        sqlSession.close();

    }
}
