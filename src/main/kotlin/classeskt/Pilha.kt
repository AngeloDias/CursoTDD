package classeskt

import exceptionskt.EmptyStackExceptionKotlin
import exceptionskt.FullStackExceptionKotlin

class PilhaKt (max: Int) {
    private val elements: Array<Any> = arrayOf(max)
    private val quant: Int = 0

    fun isEmpty(): Boolean {
        return this.quant == 0
    }

    fun length(): Int {
        return this.quant
    }

    fun push(element: Any) {

        if (this.quant == this.elements.size) {
            throw FullStackExceptionKotlin("Push operation isn't possible!")
        }

        this.elements[quant] = element
        this.quant.inc()
    }

    fun top(): Any {
        return this.elements[quant-1]
    }

    fun pop(): Any {

        if(isEmpty()) {
            throw EmptyStackExceptionKotlin("Pop operation isn't possible!")
        }

        val top: Any = this.top()

        this.quant.dec()

        return top
    }

}
