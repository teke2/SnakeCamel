package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	@Test
	public void snakeToCamelcase() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String expected = "Abc";
		String expected1 = "AbcDef";
		String expected2 = "AbcDefGh";
		String expected3 = "AbcDefGh";
		String expected4 = "AbcDef";
		String actual = scu.snakeToCamelcase("abc");
		String actual1 = scu.snakeToCamelcase("abc_def");
		String actual2 = scu.snakeToCamelcase("abc_def_gh");
		String actual3 = scu.snakeToCamelcase("abc__def___gh");
		String actual4 = scu.snakeToCamelcase("_abc_def");
		assertThat(actual,is(expected));
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));	
		assertThat(actual3,is(expected3));
		assertThat(actual4,is(expected4));	
	}
	@Test
	public void camelToSnakecase() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String expected = "abc";
		String expected1 = "abc_def";
		String expected2 = "abc_def_gh";
		String actual = scu.camelToSnakecase("Abc");
		String actual1 = scu.camelToSnakecase("AbcDef");
		String actual2 = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expected));
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));	
	}
	@Test
	public void capitalize() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String expected = " ";
		String expected1 = "A";
		String expected2 = "Xyz";
		String actual = scu.capitalize(" ");
		String actual1 = scu.capitalize("a");
		String actual2 = scu.capitalize("xyz");
		assertThat(actual,is(expected));
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));	

	}
	@Test
	public void uncapitalize() {
		SnakeCamelUtil scu = new SnakeCamelUtil();		
		String expected = " ";
		String expected1 = "a";
		String expected2 = "xyz";
		String actual = scu.uncapitalize(" ");
		String actual1 = scu.uncapitalize("A");
		String actual2 = scu.uncapitalize("Xyz");
		assertThat(actual,is(expected));
		assertThat(actual1,is(expected1));
		assertThat(actual2,is(expected2));	

	}
}