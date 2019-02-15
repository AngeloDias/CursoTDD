package testes;

import classes.Pilha;
import org.junit.Assert;
import org.junit.Test;

public class TestePilha {

    @Test
    public void emptyStack() {
        Pilha p = new Pilha();

        Assert.assertTrue(p.isEmpty());
        Assert.assertEquals(0, p.length());
    }

    @Test
    public void pushOneElement() {
        Pilha p = new Pilha();

        p.push("primeiro");
        Assert.assertFalse(p.isEmpty());
        Assert.assertEquals(1, p.length());
        Assert.assertEquals("primeiro", p.top());
    }

    @Test
    public void pushAndPop() {
        Pilha p = new Pilha();

        p.push("primeiro");
        p.push("segundo");
        Assert.assertEquals(2, p.length());
        Assert.assertEquals("segundo", p.top());

        Object outP = p.pop();

        Assert.assertEquals(1, p.length());
        Assert.assertEquals("primeiro", p.top());
        Assert.assertEquals("segundo", outP);
    }

}
