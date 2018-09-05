
public class WaterEnchantedStore extends PastryStore{

	@Override
	protected Pastry createPastry(String type) {
		if (type.equals("Pie")) {
			return new WaterEnchantedPie();
		}
		else if(type.equals("Scone")) {
			return new WaterEnchantedScone();
		}
		else if(type.equals("Creme Puff")) {
			return new WaterEnchantedCremePuff();
		}
		else return null;
	}

		
}
