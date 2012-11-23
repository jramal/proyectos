package macrosoft.crexsa.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/macrosoft/crexsa/resources/application-context.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public abstract class AbstractBaseUnitTest {

	protected AbstractBaseUnitTest() {

	}
}
