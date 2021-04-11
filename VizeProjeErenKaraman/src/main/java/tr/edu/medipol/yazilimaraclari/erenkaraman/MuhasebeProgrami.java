package tr.edu.medipol.yazilimaraclari.erenkaraman;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(5, 25));
		}

		public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		int sonuc=calisilanSaat* saatlikUcret;
			return sonuc;
		}

}

