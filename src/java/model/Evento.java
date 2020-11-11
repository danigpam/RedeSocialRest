/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
public class Evento {
     private int id;
    private String descricao;
    private Date data;
    private String local;

    public Evento() { }

    public Evento(int id, String descricao, Date data, String local) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
    }
    
    

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
}
