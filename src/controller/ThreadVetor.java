package controller;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class ThreadVetor extends Thread {
 
	int opc = 1;
	int i;
	int[] ThreadVet = new int[1000];
	
	public ThreadVetor(int[] ThreadVet) {
		this.ThreadVet = ThreadVet;
		
	}

	@Override
	public void run() {
		for (int i = 0; i <1000; i++) {
	    ThreadVet[i] = new SecureRandom().nextInt(100);
//		System.out.println(ThreadVet[i]);
		}
		
		while (opc != 0) {
		opc = Integer.parseInt(JOptionPane.showInputDialog("Digite um número par para percorrer o vetor utilizando estrutura 'for'"
				+ "\nDigite um número ímpar para percorrer o vetor utilizando estrutura 'foreach'"));
		int res;
		
		res = opc % 2;
		
		if (res == 0) {
			double TI = System.nanoTime();
			for (int i = 0; i < ThreadVet.length; i++) {
			}
			double TF = System.nanoTime();
			double TT = TF - TI;
			TT = TT / Math.pow(10, 9);
			System.out.println(TT + " s");	
			System.out.println("par");
		}
		if (res != 0) {
			double TI = System.nanoTime();
			for (int n : ThreadVet) {	
			}
			double TF = System.nanoTime();
			double TT = TF - TI;
			TT = TT / Math.pow(10, 9);
			System.out.println(TT);
			System.out.println("impar");
		}
		
	
		
		}	
}
}

