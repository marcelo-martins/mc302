package com.marcelo.base;

public class CartaLacaio {
	private int ID;
	private String nome;
	private int ataque;
	private int vidaAtual;
	private int vidaMaxima;
	private int custoMana;

	public CartaLacaio(int ID, String nome, int ataque, int vida, int mana) {
		this.ID = ID;
		this.nome = nome;
		this.ataque = ataque;
		this.vidaAtual = vida;
		this.vidaMaxima = vida;
		this.custoMana = mana;
	

	}
	
	public CartaLacaio(int ID, String nome, int mana){
		this.ID=ID;
		this.nome=nome;
		this.custoMana=mana;
	}
	
	public CartaLacaio(CartaLacaio origem){
		this.ID=origem.ID;
		this.nome=origem.nome;
		this.custoMana=origem.custoMana;
		this.vidaAtual=origem.vidaAtual;
		this.vidaMaxima=origem.vidaMaxima;
		this.ataque=origem.ataque;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVidaAtual() {
		return vidaAtual;
	}

	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;                      
	}

	public int getCustoMana() {
		return custoMana;
	}

	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}
	
	/*public void buffar(int a){
		ataque = ataque+a;
		vidaAtual = vidaAtual + a;
		alteraNomeFortalecido();
	}
	
	public void buffar(int a, int v){
		ataque = ataque + a;
		vidaAtual = vidaAtual + v;
		alteraNomeFortalecido();
	}*/
	
	public void alteraNomeFortalecido(){
		nome += " Buffed";
	}
	
	public String toString() {
		String out = getNome() + " (ID: " + getID() + ")\n";
		out = out + "Ataque = " + getAtaque() + "\n";
		out = out + "Vida Atual = " + getVidaAtual() + "\n";
		out = out + "Vida Maxima = " + getVidaMaxima() + "\n";
		out = out + "Custo de Mana = " + getCustoMana() + "\n";
		return out;
	}
}
