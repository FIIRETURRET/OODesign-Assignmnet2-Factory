
public abstract class PastryStore {
	
	public Pastry orderPastry(String type) {
		Pastry pastry;
		
		pastry = createPastry(type);
		
		pastry.prepare();
		pastry.bake();
		
		return pastry;
	}
	
	protected abstract Pastry createPastry(String type);
}
