package testt.test.hibernate.test;// default package
// Generated 2015-11-14 22:24:56 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "myschema")
public class Student implements java.io.Serializable {

	private int id;
	private String name;
	private String firstName;

	public Student() {
	}

	public Student(int id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public Student(int id, String name, String firstName) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "firstName", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}