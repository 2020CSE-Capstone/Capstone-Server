package cse.capstonedesign.Capstone.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cse.capstonedesign.Capstone.dto.request.InsertBookRequestDTO;
import cse.capstonedesign.Capstone.dto.request.UpdateBookRequestDTO;
import cse.capstonedesign.Capstone.model.Book;

@Mapper
public interface BookMapper {
	public List<Book> getAllBooks();

	public Book getBookById(@Param("id") int id);

	public int insertBook(@Param("book") InsertBookRequestDTO book);

	public int updateBook(@Param("id") int id, @Param("book") UpdateBookRequestDTO book);

	public int deleteBook(@Param("id") int id);
}