import org.junit.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class TestaDesconto extends TestCase  {

    ValorDescontos valDesc = new ValorDescontos();

    @Test
    public void testaDesconto10(){
        double valEsperado= 67.5;
        double descontoAplicado = valDesc.descontar10(75);
        Assert.assertEquals(valEsperado, descontoAplicado, 0);

    }

    @Test
    public void testaDesconto20(){
        Assert.assertNull(valDesc.descontar20(100));

    }

    @Test
    public void testaDesconto30(){
        double valEsperado= 164.5;
        double descontoAplicado = valDesc.descontar30(234);
        Assert.assertNotEquals(valEsperado,descontoAplicado);

    }

    @Test
    public void testaValorDesconto(){
        Assert.assertFalse(valDesc.descontoFixo(100));
        Assert.assertTrue(valDesc.descontoFixo(180));

    }
}

