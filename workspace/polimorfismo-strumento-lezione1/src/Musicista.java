
public class Musicista {
	
	private String nome;

	public Musicista(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void suona(Strumento s) {
		System.out.println("Musicista \"" + this.getNome() + "\" suona:");
		s.produciSuono();
	}

}
