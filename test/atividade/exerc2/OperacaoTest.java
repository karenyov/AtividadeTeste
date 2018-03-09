package atividade.exerc2;

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

	private double a;
	private double b;
	private double saida;
	private Operacao op;

	@Before
	public void initialize() {
		op = new Operacao();
	}
	
	/** � chamado ap�s cada m�todo de teste para limpar o lixo */
	@After
	public void tearDown() {
		op = null;
	}

	public OperacaoTest(double a, double b, double saida) {
		this.a = a;
		this.b = b;
		this.saida = saida;
	}

	@Parameterized.Parameters
    public static Collection parametros() {
        return Arrays.asList(new Object[][]{
            {-1, 0, -1},
            {0, -1, -1},
            {-1, -1, 1} });
    }


	/**
	 * Exerc�cio 2 � Programar uma classe parametrizada para
		testar o m�todo areaQuadrado em situa��es de
		exce��o, assim como em: 
		
		{b:-1, a:0, sa�da:-1},
		{b:0, a:-1, sa�da:-1},
		{b:-1, a:-1, sa�da:1}

	 * @throws Exception
	 */
	
	/** Testa se o m�todo lan�a a exce��o na opera��o 
	 * @throws Exception */
	@Test(expected = Exception.class)
	public void testExceptionAreaRetangulo() throws Exception {
		assertEquals("Teste:",saida, op.areaRetangulo(b, a), 0);
	}
	


}
