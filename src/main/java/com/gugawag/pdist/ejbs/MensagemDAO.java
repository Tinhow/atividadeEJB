package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName="default")
    private EntityManager em2;

    public void inserir(Mensagem novaMensagem){
        em2.persist(novaMensagem);
    }

    public List<Mensagem> listar() {
        return em2.createQuery("FROM Mensagem").getResultList();
    }

}
