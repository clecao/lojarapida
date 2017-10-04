package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.util.GenericDAO;

/**
 *
 * @author a915458
 */
public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }    
}
    
////    private EntityManager manager;
////    private EntityManagerFactory factory;
////    
////    public CategoriaDAO() {
////        factory = Persistence.createEntityManagerFactory("ConexaoDB");
////        manager = factory.createEntityManager();
////    }
////    
////    public void inserir(Categoria categoria){
////        manager.getTransaction().begin();
////        manager.persist(categoria);
////        manager.getTransaction().commit();       
////    }
////    
////    public void excluir(Categoria categoria){
////        manager.getTransaction().begin();
////        manager.remove(categoria);
////        manager.getTransaction().commit();
////    }
////    
////    public void atualizar(Categoria categoria){
////        manager.getTransaction().begin();
////        manager.merge(categoria);
////        manager.getTransaction().commit();
////    }
////    
////    public List<Categoria> buscarTodos(){
////        TypedQuery<Categoria> consulta = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
////        return consulta.getResultList();
////    }
////    
//////    public List<Sexo> buscarTodos(){
//////        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
//////        return consulta.getResultList();
//////    }
//////    
//////    public Sexo buscarPorId(int id){
//////        return manager.find(Sexo.class, id);
////    
////    public Categoria buscarPorId(int id){
////       return manager.find(Categoria.class, id);
////     }
////}
