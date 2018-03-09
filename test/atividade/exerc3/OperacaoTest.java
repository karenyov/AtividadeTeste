package atividade.exerc3;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import atividade.Operacao;

/**
 * @author Karen 8 de mar de 2018
 */
/* A classe precisa ser anotada com @RunWith(Parameterized.class) */
@RunWith(Parameterized.class)
public class OperacaoTest {

	private Object a;
	private boolean saida;
	private Operacao op;

	@Before
	public void initialize() {
		op = new Operacao();
	}
	
	/** É chamado após cada método de teste para limpar o lixo */
	@After
	public void tearDown() {
		op = null;
	}

	public OperacaoTest(Object a, boolean saida) {
		this.a = a;
		this.saida = saida;
	}

	@Parameterized.Parameters
    public static Collection parametros() {
        return Arrays.asList(new Object[][] {
        	 {12, true},
        	 {12.0, true},
        	{(char)12.0, false},
        	 {"12", false},
        	 {new Object(), false},
        	 {null, false} });
    }


	/**
	 * Exercício 3 – Programar uma classe parametrizada para
		testar o método isNumber. A seguir tem-se a lista de
		parâmetros a serem testados:
		 Arrays.asList(new Object[][] {
		 {12, true},
		 {12.0, true},
		{(char)12.0, false},
		 {"12", false},
		 {new Object(), false},
		 {null, false} })

	 * @throws Exception
	 */
	
	@Test
	public void test1() throws Exception {
		System.out.println("Teste: " + saida);
		assertEquals(saida, op.isNumber(a));
	}
	

}
