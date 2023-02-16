package com.keremturak;

import java.util.Scanner;

public class Question002 {


	// parametre olarak girilen harfe göre ikinci harfi girilen harf ile(kullanıcıdan da alınabilir)
	// bulunan şehirleri ilk üç harfini büyük bastıran metod
	// örnek "a"
	// bayburt = BAY
	// karaman = KAR



	public static Scanner input = new Scanner(System.in);//kullanıcıdan harf versisini alacağız..
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	
	


	public static void buyuk(String[] iller, char a) {

		
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == a) {
				System.out.println(iller[i] + "-->" + iller[i].substring(0, 3).toUpperCase());

			}
		}

	}
	public static void main(String[] args) {
		
		System.out.println("lütfen harfi giriniz");
		char harf =input.nextLine().charAt(0);//Kullanıcıdan alınan String değeri chara dönüştürdük
		buyuk(iller, harf);
		
	}



}
