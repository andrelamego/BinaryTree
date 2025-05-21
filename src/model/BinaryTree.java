package model;

public class BinaryTree {
	private BinNo raiz;
	
	//INSERIR NÓ
	private BinNo inserir(BinNo atual, BinNo novoNo) {
		if (atual == null) {
			return novoNo;
		}
		else if (novoNo.valor < atual.valor) {
			novoNo.pai = atual;
			atual.esq = inserir(atual.esq, novoNo);
		}
		else {
			novoNo.pai = atual;
			atual.dir = inserir(atual.dir, novoNo);
		}
		return atual;
	}

	public void inserirNo(BinNo novoNo) {
		raiz = inserir(raiz, novoNo);
		preencheNivel(raiz, 0);
	}
	
	
	//PREENCHER NIVEL DO NÓ
	private void preencheNivel(BinNo atual, int nivel) {

		if (atual == null)
			return;
		else if (atual == raiz) {
			atual.setNivel(nivel);
		}
		else {
			atual.setNivel(nivel);
		}
		
		preencheNivel(atual.esq, nivel+1);
		preencheNivel(atual.dir, nivel+1);
	}
	
	
	//CALCULAR TOTAL DE ELEMENTOS
	private int calcularElementos(BinNo atual, int n) {
		if(atual == null)
			return n;
		else {
			n++;
			n = calcularElementos(atual.esq, n);
			n = calcularElementos(atual.dir, n);
		}
		return n;
	}
	
	
	//BUSCAR ELEMENTO
	private void buscar(int valor, BinNo atual) {
		
		if(atual == null)
			return;
		else if(atual.valor == valor) {
			System.out.println("\nElemento encontrado:");
			System.out.println(atual.valor + "\t Nivel: " + atual.getNivel());
			
			System.out.println("Antecessores:");
			buscarAntecessor(atual);
		}
		else {
			buscar(valor, atual.esq);
			buscar(valor, atual.dir);
		}
	}
	
	private void buscarAntecessor(BinNo no) {
		if(no.pai == null)
			return;
		else {
			System.out.println(no.pai.valor + " ");
			buscarAntecessor(no.pai);
		}
			
		
	}

	public void buscarNo(int valor) {
		buscar(valor, raiz);
	}
	
	
	//EXIBIR ARVORE
	public void exibir() {
		System.out.println("Exibindo elementos da �rvore");
		exibirArvore(raiz);
		System.out.println("Qtd de Elementos: " + calcularElementos(raiz, 0));
	}

	private void exibirArvore(BinNo atual) {
		if (atual != null) {
			exibirArvore(atual.esq);
			System.out.println(atual.valor + "\t Nivel: " + atual.getNivel());
			exibirArvore(atual.dir);
		}
	}
}
