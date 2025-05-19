package model;

public class BinNo {
	int valor;
	int nivel;
	BinNo esq, dir;
	
	public BinNo(int valor) {
		this.valor = valor;
		esq = dir = null;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public int getValor() {
		return valor;
	}	
}
