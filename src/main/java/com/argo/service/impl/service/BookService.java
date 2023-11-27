package com.argo.service.impl.service;

import com.argo.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface BookService {
    /**
     *
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     *
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     *
     * @return
     */
    public List<Book> getAll();
}
