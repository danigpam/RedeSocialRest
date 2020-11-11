/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Evento;
import model.Post;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
public class EventoDAO {

    
    private static List<Evento> todosPosts;

    static {
        todosPosts = new ArrayList<Evento>();
        todosPosts.add(new Evento(1, "Festival vegano", new Date(), "Parque Ibirapuera"));
        todosPosts.add(new Evento(2, "Festa de ano novo", new Date(), "Minha casa"));
        todosPosts.add(new Evento(3, "Exposição de arte moderna", new Date(), "Parque Ibirapuera"));
    }

    public void cadastrar(Evento usuario) {
        usuario.setId(getNextId());
        todosPosts.add(usuario);
    }

    private int getNextId() {
        int nextId = 1;
        if (todosPosts != null && todosPosts.size() > 0) {
            Evento u = todosPosts.get(todosPosts.size() - 1);
            nextId = u.getId() + 1;
        }
        return nextId;
    }

    public List<Evento> buscarPorLocal(String local) {
        
         List<Evento> eventos = new ArrayList<Evento>();
        for (Evento evento : todosPosts) {
            if (evento.getLocal().equalsIgnoreCase(local)) {
                eventos.add(evento);
            }
        }
        return eventos;
    }
    
    public List<Evento> listarTodos() {
        return todosPosts;
    }
}
