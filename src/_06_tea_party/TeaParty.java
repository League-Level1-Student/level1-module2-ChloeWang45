package _06_tea_party;

public class TeaParty {

	
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    	if(isWoman == true) {
				if(isKnighted == true) {
					return "Hello Lady " + name;
				}
				else {
					return "Hello Ms. " + name;
				}
			}
			else {
				if(isKnighted == true) {
					return "Hello Sir " + name;
				}
				else {
					return "Hello Mr. " + name;
				}
			}
	    }
	    
}
