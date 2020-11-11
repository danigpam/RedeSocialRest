package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.EventoDAO;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import model.Evento;

@Path("evento")
public class EventoServico {
   
    public EventoServico() {   }

    @GET
    @Path("/{local}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEventosLocal(@PathParam("local") String local) {
        List<Evento> eventos = new EventoDAO().buscarPorLocal(local);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssX").create();
       return gson.toJson(eventos);
    }
    
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEventos() {
        List<Evento> eventos = new EventoDAO().listarTodos();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssX").create();
       return gson.toJson(eventos);
    }
}
