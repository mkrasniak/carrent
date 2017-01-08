package com.app.models;
@javax.persistence.Entity
@javax.persistence.Table(name="CAR_RENT")
public class CarRent {
  @javax.persistence.Id
  @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
  @javax.persistence.Column(name="CAR_RENT_ID",length=10,nullable=false)
  private int carRentId;

  public void setCarRentId(int carRentId) {
    this.carRentId = carRentId;
  }

  public int getCarRentId() {
    return carRentId;
  }

  @javax.persistence.ManyToOne
  @javax.persistence.JoinColumn(name="CAR_RENT_CAR_ID")
  private Car carRentCarId;

  public void setCarRentCarId(Car carRentCarId) {
    this.carRentCarId = carRentCarId;
  }

  public Car getCarRentCarId() {
    return carRentCarId;
  }

  @javax.persistence.ManyToOne
  @javax.persistence.JoinColumn(name="CAR_RENT_RENT_ID")
  private Rent carRentRentId;

  public void setCarRentRentId(Rent carRentRentId) {
    this.carRentRentId = carRentRentId;
  }

  public Rent getCarRentRentId() {
    return carRentRentId;
  }
}