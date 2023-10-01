package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.build.AllowSysOut;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SecondLevelCacheTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session1 = sfactory.openSession();
		Session session2 = sfactory.openSession();
		
		Student st1 = session1.get(Student.class, 101);		
		System.out.println(st1);
		System.out.println();
		
		try {
			Thread.sleep(4000);
		}catch(Exception ex) {}
		
		Student st2 = session2.get(Student.class, 101);		
		System.out.println(st2);
		
		session1.close();
		session2.close();
		sfactory.close();
	}
}
