package be.heh.ec.projetepm.adaptater.in;

import be.heh.ec.projetepm.model.Book;
import be.heh.ec.projetepm.port.in.BookListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@RequiredArgsConstructorpublic
class BookController {

    private final BookListUseCase bookListUseCase;
    private List<Book> books;

    @GetMapping("/")
    public String studentList(Model model){
        books = studentListUseCase.getBookList();
        model.addAttribute("students",books);
        return "studentList";
    }
}
