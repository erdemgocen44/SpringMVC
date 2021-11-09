package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="kisiler")

//@data parametreli const + getter +setter
//@NoArgsContsructor 

@Data
@NoArgsConstructor
public class Kisi {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
//	id yi otomnatik versin
	private Integer id;
	private String ad;
	private String soyad;
	private int yas;
	
	public Kisi() {
		// TODO Auto-generated constructor stub
	}
	
	public Kisi(Integer id, String ad, String soyad, int yas) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + "]";
	}

}
