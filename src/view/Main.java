package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		    int[] ThreadVet = new int[1000];
		    		    
			Thread threadvetor = new ThreadVetor(ThreadVet);
			threadvetor.start();
		}
		
	}

