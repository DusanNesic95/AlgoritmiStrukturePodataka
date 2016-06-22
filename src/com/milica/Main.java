package com.milica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import com.milica.algoritmistringovi.BoyerMoore;
import com.milica.algoritmistringovi.KnutMorisPat;
import com.milica.algoritmistringovi.Lsd;
import com.milica.algoritmistringovi.Msd;
import com.milica.algoritmistringovi.PretrazivanjePodstringova;
import com.milica.algoritmistringovi.TernarnoTrieStablo;
import com.milica.algoritmistringovi.TrieStablo;
import com.milica.algoritmistringovi.TrodelniQuickSort;
import com.milica.kolekcije.IzracunavanjeAritmetickihIzraza;
import com.milica.kolekcije.NizILista;
import com.milica.kolekcije.PasKomparator;
import com.milica.kolekcije.PrimerIteratora;
import com.milica.kolekcije.SortiranjeObrtanjeNasumicnoPomeranjeElemenataKolekcije;
import com.milica.kolekcije.UpotrebaArrayListe;
import com.milica.kolekcije.UpotrebaHashMap;
import com.milica.kolekcije.UpotrebaHashSet;
import com.milica.kolekcije.UpotrebaInterfejsaMap;
import com.milica.kolekcije.UpotrebaInterfejsaMapEntry;
import com.milica.kolekcije.UpotrebaInterfejsaSortedMap;
import com.milica.kolekcije.UpotrebaLinkedHashMap;
import com.milica.kolekcije.UpotrebaLinkovaneListe;
import com.milica.kolekcije.UpotrebaListi;
import com.milica.kolekcije.UpotrebaPriorityQueue;
import com.milica.kolekcije.UpotrebaSortedSet;
import com.milica.kolekcije.UpotrebaTreeMap;
import com.milica.razvojalgoritama.SitoErastotena;
import com.milica.rekurzija.BrojanjeKaraktera;
import com.milica.rekurzija.BrojanjeVelikihSlova;
import com.milica.rekurzija.BrojanjeVelikihSlovaRekurzija;
import com.milica.rekurzija.EuklidovAlgoritam;
import com.milica.rekurzija.MaksimalnaSumaPodniza;
import com.milica.rekurzija.StampanjeBrojevaUVertikalnomPoretku;
import com.milica.rekurzija.SumaNizaBrojeva;
import com.milica.rekurzija.SumaSerijeBrojevaRekuzrija;
import com.milica.rekurzija.VelicinaDirektorijuma;
import com.milica.rekurzija.VracanjeKusuraDinamickoProgramiranje;
import com.milica.rekurzija.VracanjeKusuraRekurzija;
import com.milica.uvod.BinarnaPretraga;
import com.milica.uvod.HexToDecimal;
import com.milica.uvod.LinearnaPretraga;
import com.milica.uvod.MnozenjeMatrica;
import com.milica.uvod.NajveciZajednickiDelilac;
import com.milica.uvod.NjabliziParTacaka;
import com.milica.uvod.ObrnutiSelectionSort;
import com.milica.uvod.Palindrom;
import com.milica.uvod.ProstBroj;
import com.milica.uvod.ProstPalindromskiBroj;
import com.milica.uvod.SelectionSort;
import com.milica.uvod.SortiranjeDvodimenzionalnogNiza;
import com.milica.uvod.SortiranjeVrstaMatrice;
import com.milica.uvod.SviNajbliziParoviTacaka;

public class Main {

	public static void main(String[] args) {
		// Vezba 01
		
		/* Najveci zajednicki delilac
		NajveciZajednickiDelilac.nzd();*/
		
		/* Prost broj
		ProstBroj.prostBroj();*/
		
		/* Linearna i binarna pretraga niza
		int[] list = {10, 15, 16, 22, 35, 44};
		System.out.println(LinearnaPretraga.linearnaPretraga(list, 35));
		System.out.println(BinarnaPretraga.binarnaPretraga(list, 35)); */
		
		/* Selection sort i obrnuti selection sprt
		double[] array = {10.2, 15, 16.9, 44.1, 35.2, 2.1};
		SelectionSort.selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		ObrnutiSelectionSort.selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
		
		/* Najblizi par tacaka
		NjabliziParTacaka.najbliziParTacaka(); */
		
		/* Da li je string palindrom
		System.out.println(Palindrom.isPalindrome("milica")); */
		
		/* Pretvaranje heksalnog u decimalni broj
		System.out.println(HexToDecimal.hexToDecimal("A55")); */
		
		/* Prost palindomski broj
		ProstPalindromskiBroj.prostPalindromskiBroj();*/
		
		
		/* Mnozenje matrica
		MnozenjeMatrica.mnozenjeMatrica();*/
		
		/* Svi najblizi paovi tacaka
		SviNajbliziParoviTacaka.svinajbliziParoviTacaka(); */
		
		/* Sortiranje matrica
		SortiranjeDvodimenzionalnogNiza.sortiranjeDvodimenzionalnogNiza(); */
		
		/* Sortiranje vrsta matrica
		SortiranjeVrstaMatrice.sortiranjeVrstaMatrice(); */
		
		// Vezba 02
		
		/* Sito Erastotena
		SitoErastotena.sitoErastotena(); */
		
		// Vezba 03
		
		/* Stampanje brojeva u vertikalnom poretku
		StampanjeBrojevaUVertikalnomPoretku.superWriteVertical(567); */
		
		/* Euklidov algoritam
		System.out.println(EuklidovAlgoritam.nzd(150, 3)); */
		
		/* Velicina direktorijuma, prima fajl
		VelicinaDirektorijuma.getSize(File("tekst.txt")); */
		
		/* Maksimalna suma podniza
		System.out.println(MaksimalnaSumaPodniza.max3(15, 32, 41)); */
		
		/* Vracanje kusura u odnosu na novcice i visinu kusura
		int[] coins = {1, 2, 5};
		int num = VracanjeKusuraRekurzija.makeChange(coins, 15);
		System.out.println(num); */
		
		/* Vracanje kusura kreirano pomocu dinamickog programiranja
		String[] coins = {"2", "1", "5"};
		VracanjeKusuraDinamickoProgramiranje.change(coins); */
		
		/* Suma prvih n brojeva koriscenjem rekuzrije 
		for( int i = 1; i <= 10; i++ )
			System.out.println( RecSuma.sum_rec( i ) );
			System.out.println( RecSuma.sum_rec( 8882 ) );
			System.out.println( RecSuma.sum_iter( 8882 ) ); */
		
		/* Suma serije brojeva pomocu rekurzije
		for (int i = 1; i <= 10; i++)
			System.out.println(SumaSerijeBrojevaRekuzrija.m(i)); */
		
		/* Prebrojavanje ponavljanja jednog karaktera u stringu
		BrojanjeKaraktera.count(); */
		
		/* Brojanje koliko velikih slova ima u stringu
		BrojanjeVelikihSlova.count(); */
		
		/* Brojanje koliko velikih slova ima u nizu pomocu rekurzije
		BrojanjeVelikihSlovaRekurzija.count(); */
		
		// Vezba 05
		
		/* Prikaz funcionisanja Iteratora kroz kolekciju
		PrimerIteratora.example(); */
		
		/* Sortiranje liste u obrnutom poretku, nasumicno pomeranje elemenata liste i odrejdivanje minimuma
		 * i maksimuma
		SortiranjeObrtanjeNasumicnoPomeranjeElemenataKolekcije.example(); */
		
		/* Upotreba ArrayList-e i prikaz metoda koje ona podrzava
		UpotrebaArrayListe.arrayList(); */
		
		/* Prikaz rada Linkovane liste i metoda koje ona podrzava
		UpotrebaLinkovaneListe.linkedList(); */
		
		/* Koriscenje razlicith tipova listi (LinkedList i ArrayList) i manipulacija listama
		String[] array = { "2", "4", "5", "6" };
		UpotrebaListi.lists(array); */
		
		/* Koriscenje nizova i listi i manipulacija njima
		NizILista.example(); */
		
		/* Kreiranje klase koja implementuje komparator i prikaz rada komparatora
		List<PasKomparator> list = new ArrayList<PasKomparator>();
		list.add(new PasKomparator("Shaggy",3));
		list.add(new PasKomparator("Lacy",2));
		list.add(new PasKomparator("Roger",10));
		list.add(new PasKomparator("Tommy",4));
		list.add(new PasKomparator("Tammy",1));
		Collections.sort(list);
		for(PasKomparator a: list)
			System.out.print(a.getDogName() + ", ");
		
		Collections.sort(list, new PasKomparator());
		System.out.println(" ");
		for(PasKomparator a: list)
			System.out.print(a.getDogName() + " : " + a.getDogAge() + ", "); */
		
		/* Prikaz rada i upotreba prioritetnog reda
		UpotrebaPriorityQueue.priorityQueue(); */
		
		/* Izracunavanje slozenijih matematickih izraza unesenih kao string
		String[] formula = {"5*4-5*1+15/7"};
		IzracunavanjeAritmetickihIzraza.count(formula); */
		
		/* Prikaz rada HashSet-a
		UpotrebaHashSet.hashSet(); */
		
		/* Prikaz rada LinkedHashSet-a
		UpotrebaHashSet.hashSet(); */
		
		/* Prikaza rada SortedSet-a
		UpotrebaSortedSet.sortedSet(); */
		
		/* Upotreba interfejsa Map i prikaz broja koliko se puta elementi ponavljaju u nizu
		String[] elements = {"5", "2", "3", "5"};
		UpotrebaInterfejsaMap.map(elements); */
		
		/* Upotreba LinkedHashMap-e, dodavanje elemanata i stampanje
		UpotrebaLinkedHashMap.linkedHashMap(); */
		
		/* Prikaz rada i upotreba TreeMap-e
		UpotrebaTreeMap.treeMap(); */
		
		/* Prikaz rada interfejsa Map.Entry
		UpotrebaInterfejsaMapEntry.mapEntry(); */
		
		/* Upotreba interfejsa SortedMap i prikaz njegovog rada
		UpotrebaInterfejsaSortedMap.sortedMap(); */
		
		/* Upotreba i prikaz rada HashMap-e
		UpotrebaHashMap.hashMap(); */
		
		// Vezba 11
		
		/* Implementacija grafa preko matrice susedstva
		Graph g = new Graph(5); */
		
		// Vezba 13
		
		/* Sortitanje stringova pomocu algoritma Lsd, sortiranje se vrsi prema svakog pojedinacnom karakteru
		String[] text = {"milica", "jovanovic", "dusan", "nesic"};
		Lsd.sort(text, 5);
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		} */
		
		/* Sortiranje stringova pomocu Msd algoritma, koristi se kod stringova cije duzine nisu iste
		String[] text = {"milica", "jovanovic", "dusan", "nesic"};
		Msd.sort(text);
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		} */
		
		/* Trodelni QuickSort za sortiranje niza stringova
		String[] text = {"milica", "jovanovic", "dusan", "nesic"};
		TrodelniQuickSort.sort(text);
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		} */
		
		/* Implementacija Trie Stabla
		TrieStablo<Integer> ts = new TrieStablo<Integer>();
		ts.put("first", 1); */
		
		/* Implementacija Ternarnog Trie Stabla
		TernarnoTrieStablo<Integer> tts = new TernarnoTrieStablo<>();
		tts.put("elem 1", 1); */
		
		/* Pretraga da li je jedan steing podstring drugog uz pomoc algoritma iscrpne pretrage
		System.out.println(PretrazivanjePodstringova.search("milica", "milica jovanovic")); */
		
		/* Primer rada Knut-Moris Par algoritma za pretragu sablona u stringu
		String[] text = {"Milica", "Jovanovic", "Skola", "Olovka"};
		String pat = text[0];
		String txt = text[1];
		KnutMorisPat kmp = new KnutMorisPat(pat);
		System.out.println("text: " + txt);
		int offset = kmp.search(txt);
		System.out.println("pattern: ");
		for (int i = 0; i < offset; i++)
			System.out.println(" ");
		System.out.println(pat); */
		
		/* Primer rada Bojer-Mur algoritma
		BoyerMoore bm = new BoyerMoore("olovka sveska lenjir");
		System.out.println(bm.search("sveska")); */
	}
}
