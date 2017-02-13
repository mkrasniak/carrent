package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the USER database table.
 * 
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private int userId;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "enabled")
	private int enabled;


	@Column(name = "USER_DELETED")
	private boolean userDeleted;

	@Column(name = "USER_FIRST_NAME")
	private String userFirstName;

	@Column(name = "USER_SECOND_NAME")
	private String userSecondName;

	// bi-directional many-to-one association to Car
	@OneToMany(mappedBy = "user")
	private List<Car> cars;

	public User() {
	}

	public User(User user) {
		super();
		this.userId = user.userId;
		this.userName = user.userName;
		this.password = user.password;
		this.email = user.email;
		this.enabled = user.enabled;
		this.userDeleted = user.userDeleted;
		this.userFirstName = user.userFirstName;
		this.userSecondName = user.userSecondName;
		this.cars = user.cars;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
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