import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private StackADT<Integer> stack;

	@Before
	public void setUp() {
		stack = new ArrayStack<Integer>(2);
		stack.push(1);
		stack.push(10);
		stack.push(100);
	}

	@Test
	public void testPeek() {
		assertTrue(stack.peek() == 100);
	}

	@Test
	public void testPop() {
		assertTrue(stack.pop() == 100);
	}

	@Test
	public void testEmpty() {
		stack.clear();
		assertTrue(stack.isEmpty());
	}

}
