package tr.edu.medipol.yazilimaraclari.erenkaraman;

import static org.junit.Assert.*;

import org.junit.Test;

public class MuhasebeProgramiTest {

	@Test
	public void testPozitif() {
		int saatlikUcret=25;
		int calisilanSaat=5;
		int ucret=MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		assertEquals(
				"Hata. Cevap 125",
				125,
				ucret
				);
	}
	@Test
	public void testNegatifSaatlikUcret() {
		int saatlikUcret=-1;
		int calisilanSaat=5;
		int ucret=MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		assertEquals(
				"Hata. Saatlik �crete negatif de�er girilimez",
				-5,
				ucret
				);
	}
	
	@Test
	public void testNegatifCalisanDeger() {
		int saatlikUcret=25;
		int calisilanSaat=-1;
		int ucret=MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		assertEquals(
				"Hata. �al���lan saate negatif de�er girilimez",
				-5,
				ucret
				);
	}
	@Test
	public void testNotrSaatlikUcret() {
		int saatlikUcret=0;
		int calisilanSaat=5;
		int ucret=MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		assertEquals(
				"Hata. Saatlik �crete n�tr de�er girilimez",
				0,
				ucret
				);
	}
	
	@Test
	public void testNotrCalisanDeger() {
		int saatlikUcret=25;
		int calisilanSaat=0;
		int ucret=MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		assertEquals(
				"Hata. �al���lan saate n�tr de�er girilimez",
				0,
				ucret
				);
	}
	

}