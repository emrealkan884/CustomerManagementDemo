package musteriYonetimiDemo.Concrete;

import musteriYonetimiDemo.Abstract.IMusteriCheckService;
import musteriYonetimiDemo.Entities.Musteri;

public class MusteriCheckManager implements IMusteriCheckService {

	@Override
	public boolean checkIfRealPerson(Musteri musteri) {
		if(musteri.getTcKimlik() == "12345678910") {
			return true;
		}
		else {
			return false;
		}
	}

}
