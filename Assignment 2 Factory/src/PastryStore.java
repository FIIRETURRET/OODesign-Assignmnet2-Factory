import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class PastryStore {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Pastry orderPastry() throws IOException {
		Pastry pastry;
		
		pastry = createPastry();
		
		// Handle different encounters based on class.
		
		if (pastry instanceof Pie) {
			// Pie Encounter 1
			pastry = new Apple(pastry);
			System.out.println(pastry.getEncounter());
			String s = br. readLine();
			pastry.solveEncounter(s);
			// Pie Encounter 2
			pastry = new Flour(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
			// Pie Encounter 3
			pastry = new Butter(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
		}
		else if (pastry instanceof Scone) {
			// Scone Encounter 1
			pastry = new Sugar(pastry);
			System.out.println(pastry.getEncounter());
			String s = br.readLine();
			pastry.solveEncounter(s);
			// Scone Encounter 2
			pastry = new Flour(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
			// Scone Encounter 3
			pastry = new BakingSoda(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
		}
		else if (pastry instanceof CremePuff) {
			// CremePuff Encounter 1
			pastry = new Sugar(pastry);
			System.out.println(pastry.getEncounter());
			String s = br.readLine();
			pastry.solveEncounter(s);
			pastry.solveEncounter(s);
			// TODO add an egg encounter
			// CremePuff Encounter 1
			pastry = new Yeast(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
			
		}
		else if (pastry instanceof UnknownPastry) {
			
		}
		
		pastry.prepare();
		pastry.bake();
		
		return pastry;
	}
	
	protected abstract Pastry createPastry();
}
