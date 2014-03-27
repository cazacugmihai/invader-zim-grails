package zim

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

class InvaderController {

    def index(String id) {
        def quote = Quote.findByName(id)
        [quote: quote]
    }
}
