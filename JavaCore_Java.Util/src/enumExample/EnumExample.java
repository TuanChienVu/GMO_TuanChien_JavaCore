package enumExample;

public class EnumExample {
	
	public enum Planets {
		Mercury, 
		Venus, 
		Earth, 
		Mars, 
		Jupiter, 
		Saturn, 
		Uranus, 
		Neptune;
	}

	public static void main(String[] args) {
//		Assigning values
		Planets planets = Planets.Earth;
		
		if (planets == Planets.Mercury) {
			System.out.println("This planet is: Mercury");
		} else if (planets == Planets.Venus) {
			System.out.println("This planet is: Venus");
		} else if (planets == Planets.Earth) {
			System.out.println("This planet is: Earth");
		} else if (planets == Planets.Mars) {
			System.out.println("This planet is: Mars");
		} else if (planets == Planets.Jupiter) {
			System.out.println("This planet is: Jupiter");
		} else if (planets == Planets.Saturn) {
			System.out.println("This planet is: Saturn");
		} else if (planets == Planets.Uranus) {
			System.out.println("This planet is: Uranus");
		} else {
			System.out.println("This planet is: Neptune");
		}
		
	}

}
