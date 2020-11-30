package test;

import static org.junit.Assert.assertEquals;
import org.junit.*;

import java.util.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*;


public class TestaAprovacap {

	//lista global com os dados a serem usados no teste.
	List<String> lines = Collections.emptyList();

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() throws IOException {
		//faz sentido lermos os dados do arquivo que será os dados randomicos no Setup.
			lines = Files.readAllLines(Paths.get("C:\\Users\\tc.isprogis\\Documents\\TCC\\experimento\\test-master\\RandomInputs.txt"), StandardCharsets.UTF_8); 
	
		System.out.println(lines);
}

@After
public void tearDown() {
}

@Test
public void testFrequenciaMenor75() {
	// Frequencia < 75
	int frequencia = Integer.parseInt(lines.get(0));
	int nota1 = Integer.parseInt(lines.get(2));
	int nota2 = Integer.parseInt(lines.get(4));
	int notafinal = Integer.parseInt(lines.get(6));
	EstudoCaso1 instance = new EstudoCaso1();
	boolean expResult = false;
	boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
	assertEquals(expResult, result);
}

@Test
public void testMediaMenor30() {
	// Media < 30
	int frequencia = Integer.parseInt(lines.get(1));
	int nota1 = Integer.parseInt(lines.get(3)); //nota1baixa menor q 30
	int nota2 = Integer.parseInt(lines.get(6)); //nota2baixa menor q 30
	int notafinal = Integer.parseInt(lines.get(8));
	EstudoCaso1 instance = new EstudoCaso1();
	boolean expResult = false;
	boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
	assertEquals(expResult, result);
}

@Test
public void testMediaMaior70() {
	// Media >= 70
	int frequencia = Integer.parseInt(lines.get(1));
	int nota1 = Integer.parseInt(lines.get(4)); //nota1 alta
	int nota2 = Integer.parseInt(lines.get(7)); //nota2 alta
	int notafinal = Integer.parseInt(lines.get(8));
	EstudoCaso1 instance = new EstudoCaso1();
	boolean expResult = true;
	boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
	assertEquals(expResult, result);
}

@Test
public void testMediaFinalMaior50() {
	// (Nota Final + Média)/ 2 >= 50
	int frequencia = Integer.parseInt(lines.get(1));
	int nota1 = Integer.parseInt(lines.get(2));
	int nota2 = Integer.parseInt(lines.get(4));
	int notafinal = Integer.parseInt(lines.get(9)); //nota final alta
	EstudoCaso1 instance = new EstudoCaso1();
	boolean expResult = true;
	boolean result = instance.calcularAprovacao(nota1, nota2, notafinal, frequencia);
	assertEquals(expResult, result);
}

@Test
public void testMediaEntre30e70eMediaFinalMenor50() {
	// Media entre 30 e 70 e Média na Prova Final < 50
	int frequencia = Integer.parseInt(lines.get(1));
	int nota1 = Integer.parseInt(lines.get(2));
	int nota2 = Integer.parseInt(lines.get(5));
	int notafinal = Integer.parseInt(lines.get(8)); //nota final baixa
	EstudoCaso1 instance = new EstudoCaso1();
	boolean expResult = false;
	boolean result = instance.calcularAprovacao(nota1, nota2,
			notafinal, frequencia);
	assertEquals(expResult, result);
}
}
