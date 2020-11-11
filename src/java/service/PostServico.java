package service;

import com.google.gson.GsonBuilder;
import dao.PostDAO;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author DANIELLEGONCALVESPRA
 */
@Path("posts")
public class PostServico {

    public PostServico() {
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public String listarTodos() {
       return new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssX").create().toJson( new PostDAO().listarTodos() );
    }
}


