package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	@Test
	public void test2() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String a ="test_case";
		String expected = "TestCase";
		String actual =scu.snakeToCamelcase(a);
		assertThat(actual,is(expected));		
	}
	@Test
	public void test3() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String a ="TestCase";
		String expected = "test_case";
		String actual =scu.camelToSnakecase(a);
		assertThat(actual,is(expected));
	}
}
