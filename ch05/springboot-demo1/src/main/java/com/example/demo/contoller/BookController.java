package contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/123")
    public String getBookName(){
        return "Java EE平台应用与开发";
    }
}
