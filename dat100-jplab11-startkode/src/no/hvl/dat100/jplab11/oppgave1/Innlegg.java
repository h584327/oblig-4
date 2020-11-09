package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	
	//public Innlegg() {
		
	
		
		
		
	//}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this(id,bruker,dato);
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public void setId(int id) {
		
	
		this.id = id;
		
	}
	
	public int getId() {
		
		return id;
		
	}

	public int getLikes() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
