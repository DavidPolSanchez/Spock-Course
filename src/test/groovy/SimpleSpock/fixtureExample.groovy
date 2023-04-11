package SimpleSpock

import spock.lang.Specification

class fixtureExample extends Specification{

    def setupSpec(){
        println "we are in SETUPSPEC fixture"
    }
    def setup(){
        println "we are in setup fixture"
    }
    def "feature method one"(){
        given:
        println "we are in feature method 1"
    }
    def "feature method second"(){
        given:
        println "we are in feature method 2"
    }
    def "feature method 3"(){
        given:
        println "we are in feature method 3"
    }
    def cleanup(){
        println "we are in cleanup fixture"
    }
    def cleanupSpec(){
        println "we are in CLEANUPSPEC fixture"
    }
}
