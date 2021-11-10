package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Kisi;
import repository.KisiRepository;

@Service
public class KisiService {
    public KisiRepository kisiRepository;

    public KisiService(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }

    public List<Kisi> tumKisileriGetir() {
        return kisiRepository.findAll();
    }

    public Kisi kisiEkle(Kisi kisi) {
        return kisiRepository.save(kisi);
    }
}
