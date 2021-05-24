package exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackjackSimpleTest {

	@Test
	public void dealer () {
		assertEquals(19, BlackjackSimple.play(19, 16) );
		assertEquals(19, BlackjackSimple.play(19, 22) );

	}
	
	@Test
	public void player () {
		assertEquals(19, BlackjackSimple.play(16, 19) );
		assertEquals(19, BlackjackSimple.play(22, 19) );
	}
	
	@Test
	public void bust () {
		assertEquals(0, BlackjackSimple.play(22, 26) );
	}
	
}
