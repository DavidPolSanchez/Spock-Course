package SimpleSpock

import org.spockframework.compiler.model.Spec
import spock.lang.Specification

class FouthExample extends Specification {

    def "feature method without explicit block"(){
        setup:
        println "here we are in feature method"
        /* this could not be possible, this block must appear just one time on each method
        setup:
        println "here we are "
         */
        expect:
        println "here we are "
    }

    def "feature method without explicit block2"(){
        setup:
        def a = 4
        def b = 5
        def obj = new SumOfTwoNumbers()

        when:
        def sum = obj.adder(a,b)

        then:
        sum ==9

        when:
        def list = []
        list.add(3)
        list.add(4)

        then :
        //thrown(IndexOutOfBoundsException)
        println "Finally we have thrown the exception"
        list.size() == 2

        expect:
        Math.max(2,3) == 3

        cleanup:
        println "we are line"
    }
}
