package cracking_coding_interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervewQuestionsTest extends IntervewQuestions {

	@Test
	public void split_string_test() {
		assertEquals(splitString("banana", "-", 2), "ba-na-na" );
	}

	@Test
	public void fuzzy_match_test() {
		assertTrue(fuzzyMatch("banana", "banona"));
	}

	@Test
	public void reverseMe_test() {
		assertEquals(reverseMe("cat"),  "tac");
	}

	@Test
	public void isPrime_test() {
		assertEquals(isPrime(2),  true);
		assertEquals(isPrime(97),  true);
		assertEquals(isPrime(997),  true);
		assertEquals(isPrime(23),  true);
	}

	@Test
	public void lastWord_test() {
		String sentence = "The quick brown fox";
		assertEquals(lastWord(sentence),  "fox");
	}

	@Test
	public void tipCalc_test() {
		double bill = 10.00;
		assertEquals(tipCalc(bill,0.2),  2.0);
	}

	@Test
	public void getPenultimateNode_test() {
		Node colorado = new Node("colorado");
		Node utah = new Node("utah");
		Node nevada = new Node("nevada");
		Node california = new Node("california");

		assertEquals(getPenultimateNode(colorado),  "nevada");
	}



}
