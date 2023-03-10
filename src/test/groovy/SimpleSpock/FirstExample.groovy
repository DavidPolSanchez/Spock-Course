package SimpleSpock

import spock.lang.Specification

class FirstExample  extends Specification{
    def "we are going to see max value using Math class"(){
        expect:
        Math.max(3,4) == 4
    }
}
