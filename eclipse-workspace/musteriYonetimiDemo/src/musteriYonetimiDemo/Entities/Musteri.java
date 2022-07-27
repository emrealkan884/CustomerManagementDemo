package musteriYonetimiDemo.Entities;

import musteriYonetimiDemo.Abstract.IEntity;

public class Musteri implements IEntity{
	private int id;
	private String tcKimliK;
	private String ad;
	private String soyad;
	private int dogumYili;
	
	public Musteri(int id,String tcKimlik,String ad,String soyad,int dogumYili) {
		this.id = id;
		this.tcKimliK = tcKimlik;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
		
	}
	
	public Musteri() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTcKimlik() {
		return tcKimliK;
	}
	
	public void setTcKimlik(String tcKimlik) {
		this.tcKimliK = tcKimlik;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public int getDogumYili() {
		return dogumYili;
	}
	
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	
	
}
