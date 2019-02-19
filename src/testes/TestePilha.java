package testes;

import classes.EmptyStackExceptionTDD;
import classes.FullStackExceptionTDD;
import classes.Pilha;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestePilha {
    private Pilha p;

    @Before
    public void initializeStack() {
        this.p = new Pilha(10);
    }

    @Test
    public void emptyStack() {
        Assert.assertTrue(p.isEmpty());
        Assert.assertEquals(0, p.length());
    }

    @Test
    public void pushOneElement() {
        p.push("primeiro");
        Assert.assertFalse(p.isEmpty());
        Assert.assertEquals(1, p.length());
        Assert.assertEquals("primeiro", p.top());
    }

    @Test
    public void pushAndPop() {
        p.push("primeiro");
        p.push("segundo");
        Assert.assertEquals(2, p.length());
        Assert.assertEquals("segundo", p.top());

        Object outP = p.pop();

        Assert.assertEquals(1, p.length());
        Assert.assertEquals("primeiro", p.top());
        Assert.assertEquals("segundo", outP);
    }

    @Test(expected = EmptyStackExceptionTDD.class)
    public void popFromEmptyStack() {
        p.pop();
    }

    @Test
    public void pushToFullStack() {
        for(int i=0; i<10; i++) {
            p.push("elemento: " + i);
        }

        try {
            p.push("boom");
            fail();
        } catch (FullStackExceptionTDD e) {e.printStackTrace();}
    }

}
