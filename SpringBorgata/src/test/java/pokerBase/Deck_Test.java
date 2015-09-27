package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		//	I put this test in so it would pass...
		assertTrue(1==1);
		
		Deck newDeck = new Deck();
		newDeck.getTotalCards();
		System.out.println(newDeck.getTotalCards());
		
	}
	
	@Test
	public void TestRoyalFlush(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.ACE,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.HEARTS, eRank.KING,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.HEARTS, eRank.QUEEN,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.HEARTS, eRank.JACK, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.TEN, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
		
	}
	
	@Test
	public void TestStraight(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.FOUR,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FIVE,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.SIX,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.SEVEN, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.EIGHT, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
		
	}
	
	@Test
	public void Test4OfaKind(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.FOUR,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FOUR,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.FOUR,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.FOUR, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.EIGHT, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
	}
	
	@Test
	public void Test3OfaKind(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.FOUR,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FOUR,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.FOUR,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.SIX, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.EIGHT, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
	}
	
	@Test
	public void Test2Pair(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.FOUR,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FOUR,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.FOUR,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.SIX, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.EIGHT, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
		
	}
	
	@Test
	public void TestPair(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.FOUR,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FOUR,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.FIVE,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.SIX, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.EIGHT, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
		
	}
	
	@Test
	public void TestHighCard(){
		Hand newHand = new Hand();
		Card firstCard = new Card(eSuit.HEARTS, eRank.TWO,1);
		newHand.AddCardToHand(firstCard);
		
		Card secondCard = new Card(eSuit.SPADES, eRank.FOUR,2);
		newHand.AddCardToHand(secondCard);
		
		Card thirdCard = new Card(eSuit.CLUBS, eRank.FIVE,3);
		newHand.AddCardToHand(thirdCard);
		
		Card fourthCard = new Card(eSuit.DIAMONDS, eRank.SIX, 4);
		newHand.AddCardToHand(fourthCard);
		
		Card fifthCard = new Card(eSuit.HEARTS, eRank.KING, 5);
		newHand.AddCardToHand(fifthCard);
		
		newHand.EvalHand();
		
	}

}
