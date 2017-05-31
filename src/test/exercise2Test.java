import org.junit.Test;
import static org.junit.Assert.*;
import exercise2;
public class exercise2Test {
	
	//Tri
	@Test
	public void testTri1() {
		assertEquals(exercise2.tri(1), 1);
	}
	
	@Test
	public void testTri10() {
		assertEquals(exercise2.tri(10), 55);
	}
	
	@Test
	public void testTri90() {
		assertEquals(exercise2.tri(90), 4095);
	}
	
	//Lazy
	@Test
	public void testLazy1() {
		assertEquals(exercise2.lazy(1), 2);
	}
	
	@Test
	public void testLazy10() {
		assertEquals(exercise2.lazy(10), 56);
	}
	
	@Test
	public void testLazy90() {
		assertEquals(exercise2.lazy(90), 4096);
	}
	
	
}
