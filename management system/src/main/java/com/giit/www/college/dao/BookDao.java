package com.giit.www.college.dao;

import com.giit.www.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookDao {

    public void add(Book book);

    public void delete(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public Book find(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn);
}
