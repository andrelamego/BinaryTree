package model;

public class BinaryTree {
	private BinNo raiz;
		
	private BinNo inserir(BinNo atual, BinNo novoNo) {
		if (atual == null)
			return novoNo;
		else if (novoNo.valor < atual.valor)
			atual.esq = inserir(atual.esq, novoNo);
		else
			atual.dir = inserir(atual.dir, novoNo);
		return atual;
	}

	public void inserirNo(BinNo novoNo) {
		raiz = inserir(raiz, novoNo);
		preencheNivel(raiz, 0);
	}

	private void preencheNivel(BinNo atual, int nivel) {

		if (atual == null)
			return;
		else if (atual == raiz) {
			atual.setNivel(nivel);
			preencheNivel(atual.esq, nivel+1);
			preencheNivel(atual.dir, nivel+1);
		}
		else {
			atual.setNivel(nivel);
			preencheNivel(atual.esq, nivel+1);
			preencheNivel(atual.dir, nivel+1);
		}
	}

	public void exibir() {
		System.out.println("Exibindo elementos da árvore");
		exibirArvore(raiz);
	}

	private void exibirArvore(BinNo atual) {
		if (atual != null) {
			exibirArvore(atual.esq);
			System.out.println(atual.valor + "\t Nivel: " + atual.nivel);
			exibirArvore(atual.dir);
		}
	}
}
