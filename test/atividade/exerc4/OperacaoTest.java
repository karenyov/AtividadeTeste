package atividade.exerc4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import atividade.Operacao;

/**
 * @author Karen 8 de mar de 2018
 */
/* A classe precisa ser anotada com @RunWith(Parameterized.class) */
public class OperacaoTest {

	private Operacao op;

	@Before
	public void setUp() {
		/* chamado antes de cada @Test */
		op = new Operacao();
	}

	/**
	 * Exercício 4 – Programar uma classe para testar se o método timer dá uma
	 * resposta no tempo esperado. {cont:1, tempo limite:1100 milissegundos},
	 * {cont:3, tempo limite:3100 milissegundos}
	 * 
	 * @throws InterruptedException
	 * 
	 * @throws Exception
	 */

	@Test(timeout = 1100)
	public void test1() throws InterruptedException {
		System.out.println("{cont:1, tempo limite:1100 milissegundos} ");
		assertEquals(1, op.timer(1));
	}
	
	@Test(timeout = 3100)
	public void test2() throws InterruptedException {
		System.out.println("{cont:3, tempo limite:3100 milissegundos} ");
		assertEquals(1, op.timer(3));
	}

}
