package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf handy = new Smurf("Handy");
		handy.eat();
		handy.getName();
		Smurf papa = new Smurf("Papa");
		papa.getName();
		papa.getHatColor();
		papa.isGirlOrBoy();
		Smurf smurfette = new Smurf("Smurfette");
		smurfette.getName();
		smurfette.getHatColor();
		smurfette.isGirlOrBoy();
	}
}
