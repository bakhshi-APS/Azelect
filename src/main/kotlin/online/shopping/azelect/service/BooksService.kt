package online.shopping.azelect.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/books")
class BooksSece {

    @GetMapping("/books")
    @ResponseBody
    fun getBooks(): BooksService {
        return BooksService("Books Are retrieved... Success")
    }
}

data class BooksService(
        val status: String
)
