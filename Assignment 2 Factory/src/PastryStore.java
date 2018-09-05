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
			// Encounter 1
			pastry = new Apple(pastry);
			System.out.println(pastry.getEncounter());
			String s = br. readLine();
			pastry.solveEncounter(s);
			// encounter 4,
			pastry = new Flour(pastry);
			System.out.println(pastry.getEncounter());
			s = br.readLine();
			pastry.solveEncounter(s);
		}
		else if (pastry instanceof Scone) {
			// encounter 2,
			pastry = new Sugar(pastry);
			System.out.println(pastry.getEncounter());
			String s = br.readLine();
			pastry.solveEncounter(s);
		}
		else if (pastry instanceof CremePuff) {
			// encounter 3,
			pastry = new Yeast(pastry);
			System.out.println(pastry.getEncounter());
			String s = br.readLine();
			pastry.solveEncounter(s);
		}
		
		pastry.prepare();
		pastry.bake();
		
		return pastry;
	}
	
	protected abstract Pastry createPastry();
}
