package com.hans.springboot01;

import com.hans.springboot01.dao.BookDao;
import com.hans.springboot01.domain.Book;
import com.hans.springboot01.service.BookService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private BookService bookDao;

    @Test
    void testBookDao() {
        Book byId = bookDao.getById(3);
        System.out.println(byId);
    }

    @Test
    void testBookSave(){
        Book book = new Book(122, "skdf", "weewr", "skdfj");
        int save = bookDao.save(book);
        System.out.println(save);
    }


    @Test
    void testBookUpdate(){
        Book book = new Book(29, "skdf", "weewr", "skdfj");
        int save = bookDao.update(book);
        System.out.println(save);
    }


}
