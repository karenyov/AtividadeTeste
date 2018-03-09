package atividade;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Karen 8 de mar de 2018
 */
/* A classe precisa ser anotada com @RunWith(Parameterized.class) */
@RunWith(Parameterized.class)
public class OperacaoTest {

	private double a;
	private double b;
	private double saida;
	private Operacao op;

	@Before
	public void initialize() {
		op = new Operacao();
	}

	public OperacaoTest(double a, double b, double saida) {
		this.a = a;
		this.b = b;
		this.saida = saida;
	}

	@Parameterized.Parameters
    public static Collection parametros() {
        return Arrays.asList(new Object[][]{
            {0, 0, 0},
            {1, 1, 1},
            {2, 0, 0},
            {0, 2, 0} });
    }


	/**
	 * Exercício 1 – Programar uma classe parametrizada para
		testar o método areaQuadrado com os seguintes
		valores de entrada e saída:
		{b:0, a:0, saída:0},
		{b:1, a:1, saída:1},
		{b:2, a:0, saída:0},
		{b:0, a:2, saída:0} 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		System.out.println("Teste: " + saida);
		assertEquals(saida, op.areaRetangulo(b, a), 0);
	}

}
