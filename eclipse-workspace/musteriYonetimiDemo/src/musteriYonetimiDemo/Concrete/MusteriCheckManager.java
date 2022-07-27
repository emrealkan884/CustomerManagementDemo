package musteriYonetimiDemo.Concrete;

import musteriYonetimiDemo.Abstract.IMusteriCheckService;
import musteriYonetimiDemo.Entities.Musteri;

public class MusteriCheckManager implements IMusteriCheckService {

	@Override
	public boolean checkIfRealPerson(Musteri musteri) {
		if(musteri.getTcKimlik() == "16574141346") {
			return true;
		}
		else {
			return false;
		}
	}

}
