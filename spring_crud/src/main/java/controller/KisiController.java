package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import model.Kisi;
import service.KisiService;
//burası localhosta ne girilirse ona göre nereye gitmesi gerektiğini belirleyen class
@RestController
//@RequestMapping("/kisiler")  //reacta geçince ver
//////frontend yayın portu
//@CrossOrigin(origins = "http://localhost:8081") ///bunu reacta geçince ver
public class KisiController {
	public KisiService kisiService;
	@Autowired //biz yazınca değil lazım olduğunda oluştur. alttaki gibi yaparak sıkı sıkı
	//bağlanmalarını engelledik, yeri geldiğinde birbirinden bağımsız olsun diye.
	//dependency injection yaptık, controller ın içine service yi injekte ettik
	public KisiController(KisiService kisiService) {
		this.kisiService = kisiService;
	}
	@GetMapping(path = "/kisiler")//reacta geçince kisiler i sil
	//kisiservice nin içindeki tumkisilerigetir metoduna git		
	public List <Kisi> kisileriGetir() {
		return kisiService.tumKisileriGetir();
	}
	@PostMapping(path="/kisiler/ekle")//reacta geçince buradaki kişiler yazan yeri sil
	public Kisi yeniKisiEkle(@RequestBody Kisi kisi) {
		return kisiService.kisiEkle(kisi);
	}
//	RequestBody, pathVariable kullanmazsak yukarıdaki gibi kolay adres yazamayız (/kisiler/ekle gibi). abuk sbuk kodlar gerekir
//@RequestBody:Açıklama bize isteğini teslim almak için izin verir. Daha sonra onu bir String olarak döndürebilir 
	//veya bir Plain Old Java Object (POJO)  hale getirebiliriz .
}