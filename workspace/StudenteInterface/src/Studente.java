
public class Studente implements Comparabile{
	
	private String name;
	private int age;
	
	public Studente(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean minoreDi(Comparabile lista) {
		
		Studente s;
		s = (Studente) lista; //downcasting
		
		if(this.getAge() < s.getAge())
			return true;
		
		return false;
	}
	
	public String toString() {
		return "Nome: " + this.getName() + ", Età: " + this.getAge();
	}
	
	
}
