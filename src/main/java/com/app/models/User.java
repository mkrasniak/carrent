package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	@Column(name="USER_DELETED")
	private boolean userDeleted;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_LOGIN")
	private String userLogin;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_SECOND_NAME")
	private String userSecondName;

	//bi-directional many-to-one association to Car
	@OneToMany(mappedBy="user")
	private List<Car> cars;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean getUserDeleted() {
		return this.userDeleted;
	}

	public void setUserDeleted(boolean userDeleted) {
		this.userDeleted = userDeleted;
	}

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSecondName() {
		return this.userSecondName;
	}

	public void setUserSecondName(String userSecondName) {
		this.userSecondName = userSecondName;
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car addCar(Car car) {
		getCars().add(car);
		car.setUser(this);

		return car;
	}

	public Car removeCar(Car car) {
		getCars().remove(car);
		car.setUser(null);

		return car;
	}

}