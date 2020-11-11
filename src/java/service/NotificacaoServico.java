package service;

import com.google.gson.Gson;
import dao.NotificationDAO;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import model.Notification;

/**
 * REST Web Service
 *
 * @author DANIELLEGONCALVESPRA
 */
@Path("notificacao")
public class NotificacaoServico {

    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    public void cadastrar(String notificacaoJson) {
        
        Notification notificacao = new Gson().fromJson(notificacaoJson, Notification.class);
        new NotificationDAO().cadastrar(notificacao);
    }
}
