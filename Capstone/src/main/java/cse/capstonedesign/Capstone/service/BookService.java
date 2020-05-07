package cse.capstonedesign.Capstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cse.capstonedesign.Capstone.mapper.BookMapper;
import cse.capstonedesign.Capstone.model.Book;

@Service
public class BookService {

	private final BookMapper bookMapper;

	public BookService(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public boolean saveBook(Book newBook) {
		return bookMapper.insertBook(newBook) != 0;
	}

	public List<Book> getAllBooks() {
		return bookMapper.getAllBooks();
	}

	public Book getBookById(int bookId) {
		return bookMapper.getBookById(bookId);
	}

	public boolean putBook(int bookId, Book puttedBook) {
		return bookMapper.updateBook(bookId, puttedBook) != 0;
	}

	public boolean deleteBook(int bookId) {
		return bookMapper.deleteBook(bookId) != 0;
	}
}
