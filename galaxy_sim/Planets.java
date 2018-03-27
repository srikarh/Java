package galaxy_sim;
import java.util.*;

public class Planets {
	Hashtable<String, Planet> planets;
	public Planets() {
		planets = new Hashtable<String, Planet>();
		planets.put("Sun", new Planet(30, "Sun", 0));
		planets.put("Mercury", new Planet(58, "Mercury", 0));
		planets.put("Venus", new Planet(116, "Venus", 0));
		planets.put("Earth", new Planet(1, "Earth", 0));
		planets.put("Mars", new Planet(1.61, "Mars", 0));
		planets.put("Jupiter", new Planet(.375, "Mars", 0));
		planets.put("Saturn", new Planet(.42, "Mars", 0));
		planets.put("Uranus", new Planet(.72, "Mars", 0));
		planets.put("Neptune", new Planet(.67, "Mars", 0));
	}
	
	public void rotateCalc(double time) {
		for(String key:planets.keySet())
		{
			Planet p = planets.get(key);
			p.numberOfRotations= time * p.rotationFactor; 
			System.out.println("The " + p.name +  " has rotated " + p.numberOfRotations + " times");
		}
	}
}

