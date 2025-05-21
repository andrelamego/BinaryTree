package model;

public class BinNo {
	int valor;
	private int nivel;
	BinNo esq, dir, pai;
	
	public BinNo(int valor) {
		this.valor = valor;
		esq = dir = pai = null;
	}
	
	
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}	
	
	public int getNivel() {
		return this.nivel;
	}
}
