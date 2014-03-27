package zim

class InvaderController {

    def index(String id) {
        def quote = Quote.findByName(id)
        [quote: quote]
    }
}
