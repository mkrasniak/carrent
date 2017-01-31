package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CAR database table.
 * 
 */
@Entity
@NamedQuery(name="Car.findAll", query="SELECT c FROM Car c")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAR_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carId;

	@Temporal(TemporalType.DATE)
	@Column(name="CAR_AVAILABLE")
	private Date carAvailable;

	@Column(name="CAR_COLOR")
	private String carColor;

	@Column(name="CAR_COMMENT")
	private String carComment;

	@Column(name="CAR_DELETED")
	private boolean carDeleted;

	@Temporal(TemporalType.DATE)
	@Column(name="CAR_ISURANCE_DATE")
	private Date carIsuranceDate;

	@Column(name="CAR_MAKE")
	private String carMake;

	@Column(name="CAR_MODEL")
	private String carModel;

	@Temporal(TemporalType.DATE)
	@Column(name="CAR_MOT_DATE")
	private Date carMotDate;

	@Column(name="CAR_PLATE_NUMBER")
	private String carPlateNumber;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="CAR_ADDED_BY")
	private User user;

	public Car() {
	}

	public int getCarId() {
		return this.carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Date getCarAvailable() {
		return this.carAvailable;
	}

	public void setCarAvailable(Date carAvailable) {
		this.carAvailable = carAvailable;
	}

	public String getCarColor() {
		return this.carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarComment() {
		return this.carComment;
	}

	public void setCarComment(String carComment) {
		this.carComment = carComment;
	}

	public boolean getCarDeleted() {
		return this.carDeleted;
	}

	public void setCarDeleted(boolean carDeleted) {
		this.carDeleted = carDeleted;
	}

	public Date getCarIsuranceDate() {
		return this.carIsuranceDate;
	}

	public void setCarIsuranceDate(Date carIsuranceDate) {
		this.carIsuranceDate = carIsuranceDate;
	}

	public String getCarMake() {
		return this.carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return this.carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Date getCarMotDate() {
		return this.carMotDate;
	}

	public void setCarMotDate(Date carMotDate) {
		this.carMotDate = carMotDate;
	}

	public String getCarPlateNumber() {
		return this.carPlateNumber;
	}

	public void setCarPlateNumber(String carPlateNumber) {
		this.carPlateNumber = carPlateNumber;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}