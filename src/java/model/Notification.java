/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
public class Notification {
    
    private int id;
    private Date data;
    private int usuarioId;
    private String titulo;
    private String texto;

    public Notification() {
        data = new Date();
    }

    public Notification(int id, int usuarioId, String title, String text) {
        this.id = id;
        this.data = new Date();
        this.usuarioId = usuarioId;
        this.titulo = title;
        this.texto = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    
    
    public static Comparator<Notification> BY_DATE_DESC = new Comparator<Notification>() {
        @Override
        public int compare(Notification o1, Notification o2) {
            return Long.compare(o2.data.getTime(), o1.data.getTime());
        }
    };
    
}
