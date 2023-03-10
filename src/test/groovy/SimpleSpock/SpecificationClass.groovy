package SimpleSpock

import spock.lang.*


class SpecificationClass extends Specification {

    //instance fields
    @Shared def obj = new SumOfTwoNumbers()

    def "feature method one"(){
        given:
        obj
    }
    def "feature method two"(){
        given:
        obj
    }

}
