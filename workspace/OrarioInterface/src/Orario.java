
public class Orario implements Comparabile {
	
	private int ore;
	private int minuti;

	public Orario(int ore, int minuti) {
		this.setMinuti(minuti);
		this.setOre(ore);
	}
	
	
	public int getOre() {
		return ore;
	}

	
	public void setOre(int ore) {
		this.ore = ore;
	}
	public int getMinuti() {
		return minuti;
	}
	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}
	
	/**
	 * 
	 */
	public boolean minoreDi(Comparabile c) {
		Orario o;
		o = (Orario) c;
		if(this.getOre() > o.getOre())
			return false;
		if(this.getOre() == o.getOre())
			return (this.getMinuti() < o.getMinuti());
		
		return true;
		
	}
	
	public String toString() {
		String s = "" + this.getOre() + ":" + this.getMinuti();
		return s;
	}
	
	
}
