package testes;

import classes.Pilha;
import org.junit.Assert;
import org.junit.Test;

public class TestePilha {

    @Test
    public void pilhaVazia() {
        Pilha p = new Pilha();

        Assert.assertTrue(p.isEmpty());
        Assert.assertEquals(0, p.length());
    }

}
