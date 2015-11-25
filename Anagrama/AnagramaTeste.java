package tarefa9;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTeste {

	public void test() {
		assertTrue(Anagrama.eAnagrama("",""));
		assertTrue(Anagrama.eAnagrama(" ",""));
		assertTrue(Anagrama.eAnagrama("x","x "));
		assertFalse(Anagrama.eAnagrama("x ","y"));
		assertTrue(Anagrama.eAnagrama("xy","xy"));
		assertTrue(Anagrama.eAnagrama("xy","x y"));
		assertTrue(Anagrama.eAnagrama("y x","x y"));
		assertTrue(Anagrama.eAnagrama("xy", "yx"));
		assertFalse(Anagrama.eAnagrama("yx", "x"));
		assertTrue(Anagrama.eAnagrama("ana", "ana"));
		assertTrue(Anagrama.eAnagrama("henrique", "maia"));
		assertFalse(Anagrama.eAnagrama("macaco", "macoca"));
		assertFalse(Anagrama.eAnagrama("Bataman", "Antman"));
	}

}
