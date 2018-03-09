package atividade.exerc5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Karen
 * 8 de mar de 2018
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	atividade.OperacaoTest.class,
	atividade.exerc2.OperacaoTest.class,
	atividade.exerc3.OperacaoTest.class,
	atividade.exerc4.OperacaoTest.class,

})
public class AllTests {

}
