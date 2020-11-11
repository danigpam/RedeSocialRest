package service;

import com.google.gson.Gson;
import dao.NotificationDAO;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.User;

/**
 * REST Web Service
 *
 * @author DANIELLEGONCALVESPRA
 */
@Path("usuario")
public class UsuarioServico {

    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public String login(String usuarioJson) {
        
        User usuario = new Gson().fromJson(usuarioJson, User.class);
        
        if ("123".equals(usuario.getPassword()) && "a".equals(usuario.getUser())) {
            return new Gson().toJson(Response.ok().entity("token").build());
        } else {
            return new Gson().toJson(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }
    
    @GET
    @Path("/{id}/notificacao")
    @Produces(MediaType.APPLICATION_JSON)
    public String buscarNotificacoesDoUsuario(@PathParam("id") int id) {
        
        NotificationDAO dao = new NotificationDAO();
        return new Gson().toJson(dao.notificacoesDeUsuario(id));
    }
}
