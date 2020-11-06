/*package test;

import static org.junit.Assert.assertEquals;
import org.junit.*;


public class TestaAprovacaoOriginal {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testFrequenciaMenor75() {
        // Frequencia < 75
        int frequencia = 74;
        int nota1 = 0;
        int nota2 = 0;
        int notafinal = 0;
        EstudoCaso1 instance = new EstudoCaso1();
        boolean expResult = false;
        boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
        assertEquals(expResult, result);
    } 

    @Test
    public void testMediaMenor30() {
        // Media < 30
        int frequencia = 75;
        int nota1 = 29;
        int nota2 = 30;
        int notafinal = 0;
        EstudoCaso1 instance = new EstudoCaso1();
        boolean expResult = false;
        boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
        assertEquals(expResult, result);
    }

    @Test
    public void testMediaMaior70() {
        // Media >= 70
        int frequencia = 75;
        int nota1 = 70;
        int nota2 = 70;
        int notafinal = 0;
        EstudoCaso1 instance = new EstudoCaso1();
        boolean expResult = true;
        boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
        assertEquals(expResult, result);
    }

    @Test
    public void testMediaFinalMaior50() {
        // (Nota Final + Média)/ 2 >= 50
        int frequencia = 75;
        int nota1 = 30;
        int nota2 = 30;
        int notafinal = 70;
        EstudoCaso1 instance = new EstudoCaso1();
        boolean expResult = true;
        boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
        assertEquals(expResult, result);
    }

    @Test
    public void testMediaEntre30e70eMediaFinalMenor50() {
        // Media entre 30 e 70 e Média na Prova Final < 50
        int frequencia = 75;
        int nota1 = 30;
        int nota2 = 30;
        int notafinal = 69;
        EstudoCaso1 instance = new EstudoCaso1();
        boolean expResult = false;
        boolean result = instance.calcularAprovacao(nota1, nota2,
                                          notafinal, frequencia);
        assertEquals(expResult, result);
    }
}*/
