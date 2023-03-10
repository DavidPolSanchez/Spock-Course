package POM

import spock.lang.Specification
import geb.Page

/*
Any page class is going to have following blocks of code
1-Static URL (this is going  to have the )
2-At the checker block
3-Content DSL
4-Action Methods
note: each of the page class are going to inherit PAge class defined in Geb package
So generic template would be

class <Name of Page CLass > externds geb.page{
    static url = "relative path"
        Comment where final url would be configured as base _URL + static url
    static at = {
        comment : asserts are jept here to identify the page
    }
    static content = {   }

    def funtions(){}
 */
class ExamplePage extends Page {
    //url
    static url = "/selenium-webdriver/"
    //final url  = BaseURL + static url

    //at block
    static at ={
        title == "Selenium WebDriver"
    }
    //content dsl
    static content = {
        headerTitle (wait: true){$("")}
    }

    //Functions
    def "Show message on screen"(){
        println headerTitle.text()
    }
}

