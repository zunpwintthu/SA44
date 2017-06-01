package test;

import javax.persistence.EntityManager;

import model.PersistenceManager;
import model.Student;

public class TestStudentByJPA {

	public static void main(String[] args) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction()
	        .begin();
	    em.persist(new Student("Leonard",12,"Leo",1000.00));
	    em.getTransaction()
	        .commit();

	    em.close();
	    PersistenceManager.INSTANCE.close();

	}

}
