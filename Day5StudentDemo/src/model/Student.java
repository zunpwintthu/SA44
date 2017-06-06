package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	// @GeneratedValue
	private int id;
	private String name;
	@Column(name = "nick_name")
	private String nickName;
	private double fee;

	public Student(String name, int id, String nickName, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.nickName = nickName;
		this.fee = fee;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", nickName=" + nickName + ", fee=" + fee + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub

		if (this.getId() > o.getId())
			return 1;
		else if (this.getId() < o.getId())
			return -1;
		return 0;
	}
}
