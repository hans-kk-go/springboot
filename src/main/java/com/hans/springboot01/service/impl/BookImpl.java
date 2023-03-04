package com.hans.springboot01.service.impl;

import com.hans.springboot01.dao.BookDao;
import com.hans.springboot01.domain.Book;
import com.hans.springboot01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id);
    }

    @Override
    public Book getById(Integer id) {
        Book byId = bookDao.getById(id);
        return byId;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
