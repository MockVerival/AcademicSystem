package academicSystem.dao;

import java.util.List;

import javax.persistence.Query;

public class DBSearch {

	public DBSearch() {

	}
	
	public static Object getObjectById(Object object, long idObject) {
		Object obj = DBConnection.getEntityManager().find(object.getClass(), idObject);
		
		return obj;
	}

	public static List<Object> allRegisters(Object object) {
		Query query = DBConnection.getEntityManager().createQuery("SELECT query FROM " +
			object.getClass().getSimpleName() + " query");
		
		@SuppressWarnings("unchecked")
		List<Object> resultList = query.getResultList();
		
		return resultList;
	}
}