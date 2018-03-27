package galaxy_sim;
import java.util.*;

public class PlanetInit {

	public static void main(String[] args) {
		System.out.println("Galaxy Simulator BETA *added rotations*");
		Scanner reader = new Scanner(System.in);
		System.out.println("How many days have passed since creation of the milky way:  ");
		double position = reader.nextDouble();
		reader.close();
		Planets run = new Planets();
		run.rotateCalc(position);
		
	}

}
