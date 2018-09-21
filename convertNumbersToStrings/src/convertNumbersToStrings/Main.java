package convertNumbersToStrings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String birlik[]= {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
		
		String onluk[]= {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Yazılışını görmek istediğiniz sayıyı giriniz: ");
		int sayi=scan.nextInt();	
		
		int basamak=(int) (Math.log10(sayi)+1);
		
		switch(basamak){ 
		
        case 1: System.out.println(birlik[sayi]); break; 
        
        case 2: System.out.println(onluk[sayi/10]+" "+birlik[sayi%10]); break; 
        
        case 3: if(sayi/100==1){ System.out.println("yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;} 
        
                else{ System.out.println(birlik[sayi/100]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
        case 4: if(sayi/1000==1 && (sayi/100)%10 ==1) { System.out.println("bin"+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else if(sayi/1000==1 && (sayi/100)%10 !=1) { System.out.println("bin"+" "+birlik[(sayi/100)%10]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else if(sayi/1000!=1 && (sayi/100)%10 !=1) { System.out.println(birlik[sayi/1000]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
                else { System.out.println(birlik[sayi/1000]+" "+"bin"+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break;}
        
        case 5: if((sayi/100)%10==1) {  System.out.println(onluk[sayi/10000]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        	
                else{ System.out.println(onluk[sayi/10000]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
        case 6: if(sayi/100000==1 && (sayi/100)%10==1) { System.out.println("yüz"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
                else if(sayi/100000==1 && (sayi/100)%10!=1) { System.out.println("yüz"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; } 	
        
                else if(sayi/100000!=1 && (sayi/100)%10==1) { System.out.println(birlik[sayi/100000]+"yüz"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
        
                else { System.out.println(birlik[sayi/100000]+"yüz"+onluk[(sayi/10000)%10]+birlik[(sayi/1000)%10]+" "+"bin"+" "+birlik[(sayi/100)%10]+" "+"yüz"+" "+onluk[(sayi/10)%10]+" "+birlik[sayi%10]); break; }
    } 
		
		
		
	}	
		

	}


