package com.app.models;
@javax.persistence.Entity
@javax.persistence.Table(name="USER", uniqueConstraints={@javax.persistence.UniqueConstraint(columnNames={"USER_FIRST_NAME"}), })
public class User {
  @javax.persistence.OneToMany(mappedBy="carAddedBy", fetch=javax.persistence.FetchType.LAZY)
  private java.util.Set<Car> carAddedByCar = new java.util.HashSet<Car>();

  public void setCarAddedByCar(java.util.Set<Car> carAddedByCar) {
    this.carAddedByCar = carAddedByCar;
  }

  public java.util.Set<Car> getCarAddedByCar() {
    return carAddedByCar;
  }

  public void addCarAddedByCar(Car carAddedByCar) {
    this.carAddedByCar.add(carAddedByCar);
  }

  public void removeCarAddedByCar(Car carAddedByCar) {
    this.carAddedByCar.remove(carAddedByCar);
  }

  @javax.persistence.OneToMany(mappedBy="rentAddedBy", fetch=javax.persistence.FetchType.LAZY)
  private java.util.Set<Rent> rentAddedByRent = new java.util.HashSet<Rent>();

  public void setRentAddedByRent(java.util.Set<Rent> rentAddedByRent) {
    this.rentAddedByRent = rentAddedByRent;
  }

  public java.util.Set<Rent> getRentAddedByRent() {
    return rentAddedByRent;
  }

  public void addRentAddedByRent(Rent rentAddedByRent) {
    this.rentAddedByRent.add(rentAddedByRent);
  }

  public void removeRentAddedByRent(Rent rentAddedByRent) {
    this.rentAddedByRent.remove(rentAddedByRent);
  }

  @javax.persistence.Id
  @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
  @javax.persistence.Column(name="USER_ID",length=10,nullable=false)
  private int userId;

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getUserId() {
    return userId;
  }

  @javax.persistence.Column(name="USER_DELETED",length=1)
  private Boolean userDeleted;

  public void setUserDeleted(Boolean userDeleted) {
    this.userDeleted = userDeleted;
  }

  public Boolean getUserDeleted() {
    return userDeleted;
  }

  @javax.persistence.Column(name="USER_FIRST_NAME",length=100)
  private String userFirstName;

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  @javax.persistence.Column(name="USER_LOGIN",length=50)
  private String userLogin;

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public String getUserLogin() {
    return userLogin;
  }

  @javax.persistence.Column(name="USER_PASSWORD",length=50)
  private String userPassword;

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserPassword() {
    return userPassword;
  }

  @javax.persistence.Column(name="USER_SECOND_NAME",length=100)
  private String userSecondName;

  public void setUserSecondName(String userSecondName) {
    this.userSecondName = userSecondName;
  }

  public String getUserSecondName() {
    return userSecondName;
  }
}