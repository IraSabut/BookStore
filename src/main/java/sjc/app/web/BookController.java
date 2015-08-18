package sjc.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sjc.domain.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

}
