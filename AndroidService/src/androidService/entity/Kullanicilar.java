package androidService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kullanicilar {

	@Id
	private int id;
	private String name;
	private String sifre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
}
