package convertNumbersToStrings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String birlik[]= {"","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		
		String onluk[]= {"","on","yirmi","otuz","k�rk","elli","altm��","yetmi�","seksen","doksan"};
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Yaz�l���n� g�rmek istedi�iniz say�y� giriniz: ");
		int sayi=scan.nextInt();	
		
		int basamak=(int) (Math.log10(sayi)+1);
		
		switch(basamak){ 
		
        case 1: System.out.println(birlik[sayi]); break; 
        
        case 2: System.out.println(onluk[sayi/10]+" "+birlik[sayi%10]); break; 
        
        case 3: if(sayi/100==1){ System.out.println("y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;} 
        
                else{ System.out.println(birlik[sayi/100]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
        case 4: if(sayi/1000==1 && (sayi/100)%10 ==1) { System.out.println("bin"+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else if(sayi/1000==1 && (sayi/100)%10 !=1) { System.out.println("bin"+" "+birlik[(sayi/100)%10]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else if(sayi/1000!=1 && (sayi/100)%10 !=1) { System.out.println(birlik[sayi/1000]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else { System.out.println(birlik[sayi/1000]+" "+"bin"+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
        case 5: if((sayi/100)%10==1) {  System.out.println(onluk[sayi/10000]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        	
                else{ System.out.println(onluk[sayi/10000]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
        case 6: if(sayi/100000==1 && (sayi/100)%10==1) { System.out.println("y�z"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
                else if(sayi/100000==1 && (sayi/100)%10!=1) { System.out.println("y�z"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; } 	
        
                else if(sayi/100000!=1 && (sayi/100)%10==1) { System.out.println(birlik[sayi/100000]+"y�z"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
                else { System.out.println(birlik[sayi/100000]+"y�z"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"y�z"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
    } 
		
		
		
	}	
		

	}


