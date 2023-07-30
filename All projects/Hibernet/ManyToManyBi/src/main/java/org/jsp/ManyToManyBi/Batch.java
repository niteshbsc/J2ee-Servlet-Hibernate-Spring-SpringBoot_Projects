package org.jsp.ManyToManyBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;;
private String subject;
private String code;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="BatchAndStudent",
joinColumns = @JoinColumn(name="batchid"),
inverseJoinColumns = @JoinColumn(name="studentid"))
private List<Student> students;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
public String toString() {
	return "Batch [id=" + id + ", subject=" + subject + ", code=" + code + ", students=" + students + "]";
}


}
