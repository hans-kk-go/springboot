package com.hans.springboot01.dao;

import com.hans.springboot01.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface BookDao {
    @Insert("insert into tbl_book (type,name,description) values (#{type},#{name},#{description})")
    public boolean save(Book book);

    @Update("update tbl_book set type=#{type},name=#{name},description=#{description} where id = #{id}")
    public boolean update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public boolean delete(Integer id);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
