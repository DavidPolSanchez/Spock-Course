package SimpleSpock

import spock.lang.Specification

class fixtureExample extends Specification{

    def setupSpec(){
        println "we are in setUp Spec"
    }
    def setup(){
        println "we are in setup fixture"
    }
    def "feature method one"(){
        given:
        println "we are in feature method one"
    }
    def "feature method second"(){
        given:
        println "we are in feature method second "
    }
    def "feature method 3"(){
        given:
        println "we are in feature method 3"
    }
    def cleanup(){
        println "we are in clean method"
    }
    def cleanupSpec(){
        println "we are in cleanup method Spec"
    }
}
