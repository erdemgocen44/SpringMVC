package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import model.Kisi;
import repository.KisiRepository;

@Service
public class KisiService {

	public static KisiRepository kisiRepository;

	@Autowired // Spring buna ihtiyaç duyduğunda (çalıştırıldığında, runtime), oluşturuyor,
				// normalde boşuna çalışmasın diye alttaki
	public KisiService(KisiRepository kisiRepository) {
		KisiService.kisiRepository = kisiRepository;
	}

	public List<Kisi> tumKisileriGetir() {
		return kisiRepository.findAll();
	}

	// Veritabanina Kisi ekleyen servis metodu
	public Kisi kisiEkle(Kisi kisi) {
		return kisiRepository.save(kisi);// repos. sayesinde database e depoluyor
	}

	public String idIleKisiSil(Integer id) {
		if (kisiRepository.findById(id) == null) {
			throw new EmptyResultDataAccessException(id);
		}
		kisiRepository.deleteById(id);
		return id + " id numarali kişi silindi";
	}

}