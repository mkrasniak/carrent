package com.app.models;
@javax.persistence.Entity
@javax.persistence.Table(name="CAR")
public class Car {
  @javax.persistence.Id
  @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
  @javax.persistence.Column(name="CAR_ID",length=10,nullable=false)
  private int carId;

  public void setCarId(int carId) {
    this.carId = carId;
  }

  public int getCarId() {
    return carId;
  }

  @javax.persistence.ManyToOne
  @javax.persistence.JoinColumn(name="CAR_ADDED_BY")
  private User carAddedBy;

  public void setCarAddedBy(User carAddedBy) {
    this.carAddedBy = carAddedBy;
  }

  public User getCarAddedBy() {
    return carAddedBy;
  }

  @javax.persistence.Column(name="CAR_AVAILABLE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date carAvailable;

  public void setCarAvailable(java.util.Date carAvailable) {
    this.carAvailable = carAvailable;
  }

  public java.util.Date getCarAvailable() {
    return carAvailable;
  }

  @javax.persistence.Column(name="CAR_COLOR",length=15)
  private String carColor;

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public String getCarColor() {
    return carColor;
  }

  @javax.persistence.Column(name="CAR_COMMENT",length=300)
  private String carComment;

  public void setCarComment(String carComment) {
    this.carComment = carComment;
  }

  public String getCarComment() {
    return carComment;
  }

  @javax.persistence.Column(name="CAR_DELETED",length=1)
  private Boolean carDeleted;

  public void setCarDeleted(Boolean carDeleted) {
    this.carDeleted = carDeleted;
  }

  public Boolean getCarDeleted() {
    return carDeleted;
  }

  @javax.persistence.Column(name="CAR_ISURANCE_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date carIsuranceDate;

  public void setCarIsuranceDate(java.util.Date carIsuranceDate) {
    this.carIsuranceDate = carIsuranceDate;
  }

  public java.util.Date getCarIsuranceDate() {
    return carIsuranceDate;
  }

  @javax.persistence.Column(name="CAR_MAKE",length=20)
  private String carMake;

  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  public String getCarMake() {
    return carMake;
  }

  @javax.persistence.Column(name="CAR_MODEL",length=50)
  private String carModel;

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getCarModel() {
    return carModel;
  }

  @javax.persistence.Column(name="CAR_PLATE_NUMBER",length=10)
  private String carPlateNumber;

  public void setCarPlateNumber(String carPlateNumber) {
    this.carPlateNumber = carPlateNumber;
  }

  public String getCarPlateNumber() {
    return carPlateNumber;
  }

  @javax.persistence.Column(name="MOT_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date motDate;

  public void setMotDate(java.util.Date motDate) {
    this.motDate = motDate;
  }

  public java.util.Date getMotDate() {
    return motDate;
  }

  @javax.persistence.OneToMany(mappedBy="carRentCarId", fetch=javax.persistence.FetchType.LAZY)
  private java.util.Set<CarRent> carRentCarIdCarrent = new java.util.HashSet<CarRent>();

  public void setCarRentCarIdCarrent(java.util.Set<CarRent> carRentCarIdCarrent) {
    this.carRentCarIdCarrent = carRentCarIdCarrent;
  }

  public java.util.Set<CarRent> getCarRentCarIdCarrent() {
    return carRentCarIdCarrent;
  }

  public void addCarRentCarIdCarrent(CarRent carRentCarIdCarrent) {
    this.carRentCarIdCarrent.add(carRentCarIdCarrent);
  }

  public void removeCarRentCarIdCarrent(CarRent carRentCarIdCarrent) {
    this.carRentCarIdCarrent.remove(carRentCarIdCarrent);
  }
}