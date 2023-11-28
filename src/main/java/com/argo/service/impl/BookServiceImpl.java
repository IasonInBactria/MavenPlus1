package com.argo.service.impl;

import com.argo.domain.Book;
import com.argo.dao.BookMapper;
import com.argo.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;
    @Override
    public boolean save(Book book) {
        return bookMapper.save(book) > 0? true: false;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id) > 0? true: false;
    }

    @Override
    public boolean update(Book book) {

        return bookMapper.update(book) > 0? true: false;
    }

    @Override
    public Book getById(Integer id) {
//        //将可能出现的异常进行包装，转换成自定义异常
//        int i = 1/ 0;
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
