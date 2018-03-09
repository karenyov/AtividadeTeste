package atividade;

import java.util.concurrent.TimeUnit;

/**
 * @author Karen 8 de mar de 2018
 */
public class Operacao {
	/* retorna a �rea de um quadrado */
	public double areaRetangulo(double b, double a) throws Exception {
		if (b < 0 || a < 0) {
			throw new Exception("Valor negativo");
		}
		return b * a;
	}

	/*
	 * retorna true se o objeto � um subtipo de Number
	 */
	public boolean isNumber(Object obj) throws Exception {
		return obj instanceof java.lang.Number;
	}

	public int timer(int cont) throws InterruptedException {
		/* sleep por cont segundos */
		TimeUnit.SECONDS.sleep(cont);
		return 1;
	}

}
