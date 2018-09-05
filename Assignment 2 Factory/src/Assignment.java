import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment {

	public static void main(String[] args) throws IOException{
		//NEW
		PastryStore waterEnchantedStore = new WaterEnchantedStore();
		Pastry pastry2 = waterEnchantedStore.orderPastry("Pie");
		System.out.println("Brandon ordered a " + pastry2.getDescription());
		
		// TODO Auto-generated method stub
		Pastry pastry = new Pie();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to the dungeon run pick a class. "
				+ "\n 1.Pie:"
				+ "\n 2.Scone:"
				+ "\n 3.Creme Puff");
		String s = br.readLine();
		if (s.equals("1")) {
			System.out.println("You have chosen Pie, Huzza!\n");
			pastry = new Pie();
		}
		else if (s.equals("2")) {
			System.out.println("You have chosen Scone my good chap.\n");
			pastry = new Scone();
		}
		else if (s.equals("3")) {
			System.out.println("You have chosen the Creme Puff, long may he puff!\n");
			pastry = new CremePuff();
		}
		else {
			System.out.println("You sir and or madam, do now know how to follow simple directions.\n "
					+ "Very well... we shall push forward.\n");
			pastry = new UnkownPastry();
		}
		
		// encounter 1, TODO: randomize the encounters.
		pastry = new Apple(pastry);
		System.out.println(pastry.getEncounter());
		s = br. readLine();
		pastry.solveEncounter(s);
		
		// encounter 2,
		pastry = new Sugar(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		// encounter 3,
		pastry = new Yeast(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		// encounter 4,
		pastry = new Flour(pastry);
		System.out.println(pastry.getEncounter());
		s = br.readLine();
		pastry.solveEncounter(s);
		
		/*
		for (int x=0; x<=2; x++)
		{
			int rand = new Random().nextInt(3);
			if (rand == 0) {
				// encounter 1, TODO: randomize the encounters.
				pastry = new Apple(pastry);
				System.out.println(pastry.getEncounter());
				s = br. readLine();
				pastry.solveEncounter(s);
			}
			
			else if (rand == 1) {
				// encounter 2,
				pastry = new Sugar(pastry);
				System.out.println(pastry.getEncounter());
				s = br.readLine();
				pastry.solveEncounter(s);
			}
			
			else {
				// encounter 3,
				pastry = new Yeast(pastry);
				System.out.println(pastry.getEncounter());
				s = br.readLine();
				pastry.solveEncounter(s);
			}
		}
		*/
		
		System.out.println("Congrats you have made " + pastry.getDescription() + ".\nFinal Score: " + pastry.cost() + " /16");
	}

}
