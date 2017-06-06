package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.PersistenceManager;
import model.Student;

public class StudentJPA {

	public ArrayList<Student> findAllStudents() {
		EntityManager entitymanager = PersistenceManager.INSTANCE.getEntityManager();
		Query query = entitymanager.createQuery("Select s from Student s");
		ArrayList<Student> list = (ArrayList<Student>) query.getResultList();

		entitymanager.close();
		PersistenceManager.INSTANCE.close();
		return list;
	}
}
