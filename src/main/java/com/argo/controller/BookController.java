package com.argo.controller;


import com.argo.domain.Book;
import com.argo.service.impl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null? Code.GET_OK: Code.GET_ERR;
        String message = book != null? "": "数据查询失败，请重试！";
        return new Result(code, book, message);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null? Code.GET_OK: Code.GET_ERR;
        String message = bookList != null? "": "数据查询失败，请重试！";
        return new Result(code, bookList, message);
    }
}
