package musteriYonetimiDemo.Abstract;

import musteriYonetimiDemo.Entities.Musteri;

public abstract class BaseMusteriManager implements IMusteriService {

	@Override
	public void save(Musteri musteri) {
		System.out.println("Veritabanına kaydedildi : "+musteri.getAd());
	}

}
