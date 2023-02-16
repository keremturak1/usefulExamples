package com.keremturak;

import java.util.Scanner;

public class Qusteion001 {

	//kullanıcıdan alınan kelimelerde kaç tane  sesli harf var ona bakacağız
	public static Scanner input = new Scanner(System.in);
	public static int sesli() {
		System.out.println("kelimeyi giriniz");
		String kelime = input.nextLine();
		input.close();
		char[] sesli = {'a','e','i','u','ü','o','ö'};
		int sayac = 0;
		for (int i = 0; i < sesli.length; i++) {
			for (int j = 0; j < kelime.length(); j++) {
				if (sesli[i]==kelime.charAt(j)) {
					sayac++;
					
				}
				
			}
			
			
		}return sayac;
		
		
		
		
	}public static void main(String[] args) {
		System.out.println(sesli());
	}
	
	

}
