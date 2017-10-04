package br.senac.rn.lojarapida.dao;
// @author clean

import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.model.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class VendaDAO {
  
    private EntityManager manager;
    private EntityManagerFactory factory;

    public VendaDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Venda venda) {
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
        manager.close();
    }
    
    public void excluir(Venda venda){
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
    }
    
    public void atualizar (Venda venda){
        manager.getTransaction().begin();
        manager.merge(venda);
        manager.getTransaction().commit();
    }
    
    public List<Venda> buscarTodos(){
        TypedQuery<Venda> consulta = manager.createQuery("SELECT v FROM tb_vendas v", Venda.class);
        return consulta.getResultList();
    }
    public Venda buscarPorId(int id){
        return manager.find(Venda.class, id);
    }

    public Object buscarPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
