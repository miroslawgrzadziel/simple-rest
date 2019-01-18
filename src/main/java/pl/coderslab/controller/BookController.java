package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;

@RestController
// RestController = @Controller + @ResponseBody
@RequestMapping("/books")
// REST API one endpoint, different methods, data return (e.g. JSON)
public class BookController {

    @GetMapping
    public String getBooks(){
        return "TODO: getBooks}";
    }

    @PostMapping
    public String createBook(){
        return "TODO: createBook";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return "TODO: deleteBook " + id;
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id) {
        return "TODO: updateBook " + id;
    }
}
