package helloRest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(value="hello")
public class HelloResource {
	//@GET
	//@Produces("text/plain")
	public String sayHello() {
		return "hello from methode 1";
	}
	@GET
	@Path(value="{fname}/{lname}")
	@Produces
	public String sayHelloTo1(@PathParam(value="fname")String firstName,@PathParam(value="lname")String lastName) {
		return "hello from JAX-RS " +""+firstName+" "+lastName;
	}

	@GET
	//@Path(value="sayhelloto2")
	public String sayhelloto2 (@QueryParam(value="fname")String firstName,@QueryParam(value="lname")String lastName) {
		if (firstName==null && lastName ==null) {
			return sayHello();
		}
		return "hello from JAX-RS"+firstName+lastName;
	}
	
}
