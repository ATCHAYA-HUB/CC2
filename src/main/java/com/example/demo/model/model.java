package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="BlueMoon")
public class model {
	@Id
	@Column(name="patientId")
	private int id;
	@Column(name="patientName")
	private String name;
	@Column(name="patientBill")
	private float bill;	
	@Column(name="patientAge")
	private int age;	
	@Column(name="Consulanting Doctor")
	private String doctor;
	@Column(name="Health Issue")
	private String healthissue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getHealthissue() {
		return healthissue;
	}
	public void setHealthissue(String healthissue) {
		this.healthissue = healthissue;
	}
	public model(int id, String name, float bill, int age, String doctor, String healthissue) {
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
		this.age = age;
		this.doctor = doctor;
		this.healthissue = healthissue;
	}
	public model() {

	}
	
}