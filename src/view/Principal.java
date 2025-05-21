package view;

import model.BinNo;
import model.BinaryTree;

public class Principal {
	public static void main(String[] args) {
		BinaryTree arvore1 = new BinaryTree();
		
		
		arvore1.inserirNo(new BinNo(14));
		arvore1.inserirNo(new BinNo(16));
		arvore1.inserirNo(new BinNo(12));
		arvore1.inserirNo(new BinNo(11));
		arvore1.inserirNo(new BinNo(17));
		arvore1.inserirNo(new BinNo(15));
		arvore1.inserirNo(new BinNo(10));
		arvore1.inserirNo(new BinNo(13));
		arvore1.inserirNo(new BinNo(18));
		
		
		arvore1.exibir();
		
		arvore1.buscarNo(13);
		
//		arvore1.exibir();
	}
}
