package com.csdj.oaserviceimpl;

import com.csdj.dao.BookMapper;
import com.csdj.pojo.Book;
import com.csdj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper mapper;
    @Override
    public List<Book> getBook() {
        return mapper.selectAll();
    }
}
