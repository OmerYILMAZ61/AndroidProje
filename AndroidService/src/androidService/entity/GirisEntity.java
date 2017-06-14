package androidService.entity;

public class GirisEntity {

	private String name;
	private String sifre;
	
	public GirisEntity(String name, String sifre) {
		this.name=name;
		this.sifre=sifre;
	
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
