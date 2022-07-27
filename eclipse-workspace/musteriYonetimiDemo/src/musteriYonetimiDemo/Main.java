package musteriYonetimiDemo;

import musteriYonetimiDemo.Abstract.BaseMusteriManager;
import musteriYonetimiDemo.Concrete.MusteriCheckManager;
import musteriYonetimiDemo.Concrete.StarbucksMusteriManager;
import musteriYonetimiDemo.Entities.Musteri;

public class Main {

	public static void main(String[] args) {
		Musteri musteri1 = new Musteri();
		musteri1.setAd("Emre");
		musteri1.setSoyad("Alkan");
		musteri1.setId(1);
		musteri1.setTcKimlik("16574141346");
		musteri1.setDogumYili(2001);
		
		BaseMusteriManager musteriManager = new StarbucksMusteriManager(new MusteriCheckManager());
		musteriManager.save(musteri1);
	}

}
