import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GolfTest
{
    private Golf golf;

    @Before
    public void setUp() throws Exception
    {
        golf = new Golf();
    }

    @Test
    public void test() throws Exception
    {
        golf.hoyo(1);//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        golf.hoyo(2);
        assertEquals(3, golf.puntuacion());
    }

    @Test
    public void testJuegoPerfecto() throws Exception
    {
        for (int i = 0; i < 18; i++)
        {
            golf.hoyo(1);
        }

        assertEquals(18, golf.puntuacion());
    }
    //hola
}

