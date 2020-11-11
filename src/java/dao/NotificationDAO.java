/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Notification;
import model.Post;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
public class NotificationDAO {

    private static List<Notification> todasNotificacoes;

    static {
        try {
            todasNotificacoes = new ArrayList<Notification>();
            todasNotificacoes.add(new Notification(1, 1, "Você foi marcado em um álbum", "Pluto marcou fotos suas no álbum Fotos da Quarentena."));
            Thread.sleep(1000);
            todasNotificacoes.add(new Notification(2, 1, "Você tem uma nova memória", "Passeio ao lago (maio 2020)"));
            Thread.sleep(1000);
            todasNotificacoes.add(new Notification(3, 2, "Nova solicitação de amizade", "Pluto enviou uma solicitação de amizade"));
            Thread.sleep(1000);
            todasNotificacoes.add(new Notification(4, 1, "Nova solicitação de amizade", "Mickey Mouse enviou uma solicitação de amizade"));
            Thread.sleep(1000);
            todasNotificacoes.add(new Notification(5, 2, "Você recebeu uma recomendação", "Donald recomendou: Receita rápida de batata sautê"));
        } catch (InterruptedException ex) {
            Logger.getLogger(NotificationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrar(Notification not) {
        not.setId(getNextId());
        todasNotificacoes.add(not);
    }

    private int getNextId() {
        int nextId = 1;
        if (todasNotificacoes != null && todasNotificacoes.size() > 0) {
            Notification n = todasNotificacoes.get(todasNotificacoes.size() - 1);
            nextId = n.getId() + 1;
        }
        return nextId;
    }

    public List<Notification> notificacoesDeUsuario(int id) { 
        
        ArrayList<Notification> notificacoesUsuario = new ArrayList<Notification>();
        for (Notification notif : todasNotificacoes) {
            if (notif.getUsuarioId() == id) {
                notificacoesUsuario.add(notif);
            }
        }
        notificacoesUsuario.sort(Notification.BY_DATE_DESC);
        return notificacoesUsuario;
    }
}
