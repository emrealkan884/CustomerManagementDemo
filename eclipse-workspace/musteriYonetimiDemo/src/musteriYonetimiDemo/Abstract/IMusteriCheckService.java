package musteriYonetimiDemo.Abstract;

import musteriYonetimiDemo.Entities.Musteri;

public interface IMusteriCheckService {
	boolean checkIfRealPerson(Musteri musteri);
}
