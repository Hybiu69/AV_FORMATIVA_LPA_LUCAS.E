package Formativa;

public class Formativa4 {

	public static void main(String[] args) {

		int bingo[] = new int [20];
		for(int i=0; i<20;i++) {
			
			int n = (int)Math.round(Math.random()*100);
			
			bingo[i] = n;
			
			System.out.println(bingo[i]);
		
		}

	}

}
