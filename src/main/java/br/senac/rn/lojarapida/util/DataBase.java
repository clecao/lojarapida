package br.senac.rn.lojarapida.util;
 // @author a915458

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBase {

    private static DataBase singleton = new DataBase();
    private static EntityManager manager;
    
    public DataBase(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    public static DataBase getInstace(){
        return singleton;
    }
    
    public EntityManager getEm() {
        return manager;
    }
    
}
