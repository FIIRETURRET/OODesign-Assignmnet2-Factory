import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment {

	public static void main(String[] args) throws IOException{
		//NEW
		PastryStore PieStore = new PieStore();
		PastryStore SconeStore = new SconeStore();
		PastryStore CremePuffStore = new CremePuffStore();
		PastryStore UnknownPastryStore = new UnknownPastryStore();
		//Pastry pastry2 = PieStore.orderPastry();
		//System.out.println("Brandon ordered a " + pastry2.getDescription());
		
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
			//TODO add diferent types of pies with 'enchantments' take in input from the user.
			pastry = PieStore.orderPastry();
		}
		else if (s.equals("2")) {
			System.out.println("You have chosen Scone my good chap.\n");
			pastry = SconeStore.orderPastry();
		}
		else if (s.equals("3")) {
			System.out.println("You have chosen the Creme Puff, long may he puff!\n");
			pastry = CremePuffStore.orderPastry();
		}
		else {
			System.out.println("You sir and or madam, do now know how to follow simple directions.\n "
					+ "Very well... we shall push forward.\n");
			pastry = UnknownPastryStore.orderPastry();
		}
		
		//NEW
		/*System.out.println("Welcome to the dungeon run pick a Rune. "
				+ "\n 1.Water:"
				+ "\n 2.Scone:"
				+ "\n 3.Creme Puff");
		s = br.readLine();
		if (s.equals("1")) {
			System.out.println("You have chosen Pie, Huzza!\n");
			pastry = new WaterEnchantedPie();
		}*/
		
		
		System.out.println("Congrats you have made " + pastry.getDescription() + ".\nFinal Score: " + pastry.cost() + " /16");
	}

}
