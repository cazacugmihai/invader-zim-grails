package zim

class InvaderController {
    def index(String name) {
        [quote: Quote.findByName(name)]
    }
}
