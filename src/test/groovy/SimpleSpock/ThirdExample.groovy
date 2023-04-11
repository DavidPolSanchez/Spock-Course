package SimpleSpock

import SimpleSpock.SumOfTwoNumbers
import spock.lang.Specification

class ThirdExample extends Specification{

    def "we are going to add two number"(){
        given:
        def obj = new SumOfTwoNumbers()

        when:
        def sum = obj.adder(2,3)

        then:
        sum == 5
    }
}
