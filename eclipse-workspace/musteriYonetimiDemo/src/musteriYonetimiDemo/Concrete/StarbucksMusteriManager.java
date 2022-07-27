package musteriYonetimiDemo.Concrete;

import musteriYonetimiDemo.Abstract.BaseMusteriManager;
import musteriYonetimiDemo.Abstract.IMusteriCheckService;
import musteriYonetimiDemo.Entities.Musteri;

public class StarbucksMusteriManager extends BaseMusteriManager{
	
	private IMusteriCheckService _musteriCheckService;
	
	public StarbucksMusteriManager(IMusteriCheckService musteriCheckService) {
		_musteriCheckService = musteriCheckService;
	}
	
	@Override
	public void save(Musteri musteri) {
		if (_musteriCheckService.checkIfRealPerson(musteri)==true) {
			super.save(musteri);//Base classtan gelen save i kullaniyor.
		}
		else {
			System.out.println("Geçerli bir kişi değil");
		}
		
	}

}
