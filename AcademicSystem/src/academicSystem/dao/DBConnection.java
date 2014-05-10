package academicSystem.dao;

import javax.persistence.*;

public class DBConnection {
    private static EntityManagerFactory factory;
    private static EntityManager entityManager;

    public DBConnection() {
        
    }
    
    //Open a new connection with DB
    public static void openConnection() {
    	if(DBConnection.entityManager == null) {
    		DBConnection.factory = Persistence.createEntityManagerFactory("connectDB");
        	DBConnection.entityManager = DBConnection.factory.createEntityManager();
    	}
    }

    public static EntityManager getEntityManager() {
        return DBConnection.entityManager;
    }
    
    public static void closeConnection() {
    	DBConnection.entityManager = null;
    }
}