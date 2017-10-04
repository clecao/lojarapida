/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Sexo;
import br.senac.rn.lojarapida.util.GenericDAO;

/**
 *
 * @author a915458
 */
public class SexoDAO extends GenericDAO<Sexo> {
    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
}
//public class SexoDAO {
//    
//    private EntityManager manager;
//    private EntityManagerFactory factory;
//
//    public SexoDAO() {
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//    }
//    
//    public void inserir(Sexo sexo) {
//        manager.getTransaction().begin();
//        manager.persist(sexo);
//        manager.getTransaction().commit();
//    
//    }
//    
//    public void excluir(Sexo sexo){
//        manager.getTransaction().begin();
//        manager.remove(sexo);
//        manager.getTransaction().commit();
//    }
//    
//    public void atualizar (Sexo sexo){
//        manager.getTransaction().begin();
//        manager.merge(sexo);
//        manager.getTransaction().commit();
//    }
//    
//    public List<Sexo> buscarTodos(){
//        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
//        return consulta.getResultList();
//    }
//    
//    public Sexo buscarPorId(int id){
//        return manager.find(Sexo.class, id);
//    }
//
//    public Object buscarPorId() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    
//    
//}
