package _06_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
	
	private static String name;
	private static boolean isWoman;
	private static boolean isKnighted;
	
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        this.name = name;
	        this.isWoman = isWoman;
	        this.isKnighted = isKnighted;
			return name;
	    }
	    
	    String getName() {
	    	return name;
	    }
	    
	    boolean isWoman() {
	    	return isWoman;
	    }
	    
	    boolean isKnighted() {
	    	return isKnighted;
	    }
	    
	public static void main(String[] args) {
			
		if(isWoman == true) {
			if(isKnighted == true) {
				System.out.println("Hello Lady " + name);
			}
			else {
				System.out.println("Hello Ms. " + name);
			}
		}
		else {
			if(isKnighted == true) {
				System.out.println("Hello Sir " + name);
			}
			else {
				System.out.println("Hello Mr. " + name);
			}
		}
	}
}
public class TeaPartyTest {
	/**
	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	 **/

	@Test
	public void testIsWomanNotKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
	}

	@Test
	public void testIsManNotKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
	}

	@Test
	public void testIsManKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
	
	@Test
	public void testIsWomanKnighted() {
		TeaParty teaParty = new TeaParty();
		assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
	}

}
