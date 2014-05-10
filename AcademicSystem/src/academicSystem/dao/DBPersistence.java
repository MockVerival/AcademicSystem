package academicSystem.dao;

public class DBPersistence {

	public DBPersistence() {

	}
	
	/**
	 * @param object get the object to persist, can be any type the models
	 * @param action indicates if will be register or remove
	 */
	public static void persistObject(Object object, String action) {
		DBConnection.getEntityManager().getTransaction().begin();
		
		if(action.equals("register")) {
			DBConnection.getEntityManager().persist(object);
		}
		else if(action.equals("remove")) {
			DBConnection.getEntityManager().remove(object);
		}
		
		DBConnection.getEntityManager().getTransaction().commit();
	}
}