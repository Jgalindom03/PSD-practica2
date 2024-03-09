import junit.framework.TestCase;
import org.junit.Test;

import java.rmi.RemoteException;

public class ServidorTest extends TestCase {
    private Interfaz calculadora; // Declara una instancia de la interfaz

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculadora = new Interfaz() { // Implementación temporal de la interfaz
            @Override
            public float sumar(float numero1, float numero2) throws RemoteException {
                return numero1 + numero2;
            }

            @Override
            public float restar(float numero1, float numero2) throws RemoteException {
                return numero1 - numero2;
            }

            @Override
            public float multiplicar(float numero1, float numero2) throws RemoteException {
                return numero1 * numero2;
            }

            @Override
            public float dividir(float numero1, float numero2) throws RemoteException {
                return numero1 / numero2;
            }

            @Override
            public float raiz(float numero1) throws RemoteException {
                return (float) Math.sqrt(numero1);
            }
        };
    }

    @Test
    public void testSumar() throws RemoteException {
        assertEquals(5, calculadora.sumar(2, 3), 0); // 2 + 3 = 5
    }
    @Test
    public void testSumar2() throws RemoteException {
        assertEquals(5, calculadora.sumar(3, 3), 0); // 2 + 3 = 5
    }

    @Test
    public void testRestar() throws RemoteException {
        assertEquals(2, calculadora.restar(5, 3), 0); // 5 - 3 = 2
    }
    @Test
    public void testRestar2() throws RemoteException {
        assertEquals(2, calculadora.restar(9, 3), 0); // 5 - 3 = 2
    }

    @Test
    public void testMultiplicar() throws RemoteException {
        assertEquals(10, calculadora.multiplicar(2, 5), 0); // 2 * 5 = 10
    }
    @Test
    public void testMultiplicar2() throws RemoteException {
        assertEquals(10, calculadora.multiplicar(9, 5), 0); // 2 * 5 = 10
    }

    @Test
    public void testDividir() throws RemoteException {
        assertEquals(2, calculadora.dividir(10, 5), 0); // 10 / 5 = 2
    }
    @Test
    public void testDividir2() throws RemoteException {
        assertEquals(2, calculadora.dividir(12, 5), 0); // 10 / 5 = 2
    }

    @Test
    public void testRaiz() throws RemoteException {
        assertEquals(3, calculadora.raiz(9), 0); // sqrt(9) = 3
    }
    @Test
    public void testRaiz2() throws RemoteException {
        assertEquals(3, calculadora.raiz(8), 0); // sqrt(9) = 3
    }
}
