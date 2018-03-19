public class Persona {
	private String[] nomi;

	public Persona(int n) {
		this.nomi = new String[n];
	}

	public int contaOmonimiDi(String nome) {
		int contatore = 0;
		int i;
		for(i = 0; i < this.nomi.length; i++) {
			if(nome.equals(this.nomi[i])) {
				contatore++;
			}
		}
		return contatore;

	}

	public void aggiungiNome(int indice, String nome) {
		this.nomi[indice] = nome;
	}
}