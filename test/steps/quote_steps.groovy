import cucumber.api.PendingException
import zim.Quote
import zim.QuotePage

import static cucumber.api.groovy.EN.*

Given(~'^an Invader named "([^"]*)"$') { String name ->
    quote = new Quote(name:name)
}

And(~'^the Invader "([^"]*)" says "([^"]*)"$') { String name, String message ->
    quote.message = message
    quote.save()
}

When(~'^a Quote is requested for "([^"]*)"$') { String name ->
    QuotePage.url = "http://localhost:8080/zim-grails/invader/$name"
    to QuotePage
}

Then(~'^we are taken to the Quote Page$') { ->
    at QuotePage
}

And(~'^we see "([^"]*)"$') { String quote ->
    def invasionQuote = page.fetchInvasionQuote()
    assert invasionQuote == quote
}