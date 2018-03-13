package diadia;

public class StanzaTest1 {

	public static void main(String[] args) {
		Stanza bar = new Stanza("bar"); //nord porta a mensa
		Stanza mensa = new Stanza("mensa"); //sud porta a bar
		Attrezzo a = new Attrezzo("spada", 10);
		Attrezzo b = new Attrezzo("scudo", 40);
		
		mensa.impostaStanzaAdiacente("sud", bar);
		bar.impostaStanzaAdiacente("nord", mensa);
		
		mensa.addAttrezzo(a);
		//mensa.addAttrezzo(b);
		System.out.println(mensa.toString());
	}

}
