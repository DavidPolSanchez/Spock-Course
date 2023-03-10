package SimpleSpock

import spock.lang.Timeout
import spock.lang.IgnoreRest
import spock.lang.Issue
import spock.lang.Specification

class ExtensionExample extends Specification{
    @Issue("Https://UserStory ")
    def "feature 1"(){
        given:
        println "we are in feature 1"
    }
    //@IgnoreRest
    def "feature 2"(){
        given:
        println "we are in feature 2"
    }

    def "feature 3"(){
        given:
        println "we are in feature 3"
    }
    @Timeout(2)
    def "feature 4"(){
        given:
        println "we are in feature 4"
    }

}
