import classeskt.PilhaKt
import exceptionskt.EmptyStackExceptionKotlin
import exceptionskt.FullStackExceptionKotlin
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import org.junit.Assert.fail

class TestStack {
    private lateinit var p: PilhaKt

    @Before
    fun initializeStack() {
        this.p = PilhaKt(10)
    }

    @Test
    fun emptyStack() {
        Assert.assertTrue(this.p.isEmpty())
        Assert.assertEquals(0, this.p.length())
    }

    @Test
    fun pushOneElement() {
        p.push("primeiro");
        Assert.assertFalse(p.isEmpty());
        Assert.assertEquals(1, p.length());
        Assert.assertEquals("primeiro", p.top());
    }

    @Test
    fun pushAndPop() {
        p.push("primeiro")
        p.push("segundo")
        Assert.assertEquals(2, p.length())
        Assert.assertEquals("segundo", p.top())

        val outP: Any = p.pop()

        Assert.assertEquals(1, p.length())
        Assert.assertEquals("primeiro", p.top())
        Assert.assertEquals("segundo", outP)
    }

    @Test(expected = EmptyStackExceptionKotlin::class)
    fun popFromEmptyStack() {
        p.pop()
    }

    @Test
    fun pushToFullStack() {
        for(i in 0 until 9) {
            p.push("elemento: $i")
        }

        try {
            p.push("boom")
            fail()
        } catch (e: FullStackExceptionKotlin) {
            e.printStackTrace()
        }
    }

}
