package galaxy_sim;

public class Planet {
public double rotationFactor;
public String name;
public double distanceTravelled;
public double numberOfRotations;

public Planet(double rotationFactor, String name, double distanceTravelled) {
	
	this.rotationFactor = rotationFactor;
	this.name = name;
	this.distanceTravelled = distanceTravelled;
}
}
