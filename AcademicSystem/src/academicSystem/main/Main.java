package academicSystem.main;

import academicSystem.course.Course;
import academicSystem.course.Discipline;
import academicSystem.dao.DBConnection;
import academicSystem.dao.DBPersistence;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		System.out.println("Projeto Inicial");
		
		Course course = new Course(1);
		course.setCredits(240);
		course.setName("Engenharia de Software");
		course.setPeriods(10);
		
		Discipline discipline = new Discipline(course, 1);
		discipline.setClassroom("AA");
		discipline.setName("Requisitos de Software");
		discipline.setCredits(4);
		discipline.setPeriod(5);
		
		Discipline discipline1 = new Discipline(course, 2);
		discipline1.setClassroom("AA");
		discipline1.setName("Verificação e Validação de Software");
		discipline1.setCredits(4);
		discipline1.setPeriod(8);
		discipline1.addRequirement(discipline);
		
		DBConnection.openConnection();
		DBPersistence.persistObject(course, "register");
		DBConnection.closeConnection();
		System.out.println("Curso: "+course.getName()+" cadastrado!");
		
		DBConnection.openConnection();
		DBPersistence.persistObject(discipline, "register");
		DBConnection.closeConnection();
		System.out.println("Disciplina: "+discipline.getName()+" cadastrada!");
		
		DBConnection.openConnection();
		DBPersistence.persistObject(discipline1, "register");
		DBConnection.closeConnection();
		System.out.println("Disciplina: "+discipline1.getName()+" cadastrada!");
	}
}
