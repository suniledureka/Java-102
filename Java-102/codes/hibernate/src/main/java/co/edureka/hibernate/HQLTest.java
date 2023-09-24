package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Kayvya'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName IN ('Kayvya', 'Imran','Anil', 'Sanjay', 'Anirudh')";
		String hql = "from co.edureka.hibernate.entity.Student where studentName LIKE 'S%'";
		Query<Student> q = session.createQuery(hql, Student.class);
		List<Student> students = q.getResultList();
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(0, 101);
		q.setParameter(1, 106);
		List<Student> students = q.getResultList();		
		printStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 200);
		List<Student> students = q.getResultList();		
		printStudents(students);
		*/
		
		//--performing DML operation with HQL
		session.beginTransaction();
		String hql = "update co.edureka.hibernate.entity.Student set studentName='Sanjay Patil', studentEmail='sanjay@HOTMAIL.com' where studentId=101";
		Query q = session.createQuery(hql);
		int n = q.executeUpdate();
		System.out.println("students updated = " + n);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

	private static void printStudents(List<Student> students) {
		students.forEach(st -> {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		});		
	}
}
