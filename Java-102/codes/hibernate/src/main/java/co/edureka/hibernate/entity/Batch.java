package co.edureka.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Batch {
	@Id
	@GeneratedValue
	private Integer courseId;
	private String courseName;
	@ManyToOne
	@JoinColumn(name = "facultyId")
	private Faculty faculty;
	
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Batch(String courseName, Faculty faculty) {
		super();
		this.courseName = courseName;
		this.faculty = faculty;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
