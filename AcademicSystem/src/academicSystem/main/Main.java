package academicSystem.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		System.out.println("Projeto Inicial");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("connectDB");
		EntityManager entityManager = factory.createEntityManager(); 
		
		System.out.println(entityManager);
	}
}
