package androidService;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/merhaba")
public class Merhaba {

	@GET
	@Path("/selamcak")
	@Produces(MediaType.TEXT_PLAIN)
	public String selamCak(){
		return "merhaba";
	}
	
	
	@GET
	@Path("/toplama/{param1}/{param2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String toplama(@PathParam("param1") String veri1, @PathParam("param2") String veri2){
		
		return String.valueOf(Integer.parseInt(veri1)+Integer.parseInt(veri2));
	}
	
	@GET
	@Path("/toplama/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String kisiKontrol(@PathParam("param1") String veri1, @PathParam("param2") String veri2){
		
		return String.valueOf(Integer.parseInt(veri1)+Integer.parseInt(veri2));
	}
	
	
}


