package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ProdutoDAO {
    
    private EntityManager manager;
    private EntityManagerFactory factory;
    
    public ProdutoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Produto produto) {
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
    
    }
    
    public void excluir(Produto produto){
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
    }
    
    public void atualizar (Produto produto){
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
    }
    
    public List<Produto> buscarTodos(){
        TypedQuery<Produto> consulta = manager.createQuery("SELECT p FROM Produto p", Produto.class);
        return consulta.getResultList();
    }
    
    public Produto buscarPorId(int id){
        return manager.find(Produto.class, id);
    }

    public Object buscarPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
