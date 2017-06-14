package androidService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import androidService.dao.DAO;
import androidService.entity.GirisEntity;
import androidService.entity.Kullanicilar;

@Path("/android")
public class AndroidKullanicilar {

	@GET
	@Path("/kontrol/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String kisiKontrol(@PathParam("param1") String veri1, @PathParam("param2") String veri2){
		GirisEntity girisEntity = new GirisEntity(veri1, veri2);
		Kullanicilar kullanicilar =DAO.getInstance().kontrolEt(girisEntity);
		if(kullanicilar == null){
			return "yanlýþ";
		}
		Gson gson = new Gson();
		String json= gson.toJson(kullanicilar);
		return json;
		
	}
	
	
}
