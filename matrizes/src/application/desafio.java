package application;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int c , l;
		l = sc.nextInt();
		c = sc.nextInt();
		
		int [] [] mat = new int[l][c];
		
		
		
		
		for(int i = 0; i<l; i++) {
			for(int j= 0; j<c; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Qual numero deseja encontrar? ");
		int num = sc.nextInt();
		
		for(int i = 0; i<l; i++) {
			for(int j= 0; j<c; j++) {
				if(mat[i][j] == num ) {
					System.out.println("position " + i + "," + j);
					
					if(i > 0 ) {
						System.out.println("up: " + mat[i - 1][j]);
					}else {
						System.out.print("");
					}
				
					
					 if (j > 0) {
			                System.out.println("Left: " + mat[i][j - 1]); 
			            } else {
			            	System.out.print("");
			            } 
					 
			            if (j < c - 1) {
			                System.out.println("Right: " + mat[i][j + 1]);
			            } else {
			                System.out.print(""); 
			            }

			         
			            if (i < l - 1) {
			                System.out.println("Down: " + mat[i + 1][j]);
			            } else {
			                System.out.print(""); 
			            }
					 
					 
				}
			}
		}
		
		
		sc.close();
		
	}

}
