package com.app.models;
@javax.persistence.Entity
@javax.persistence.Table(name="RENT")
public class Rent {
  @javax.persistence.OneToMany(mappedBy="carRentRentId", fetch=javax.persistence.FetchType.LAZY)
  private java.util.Set<CarRent> carRentRentIdCarrent = new java.util.HashSet<CarRent>();

  public void setCarRentRentIdCarrent(java.util.Set<CarRent> carRentRentIdCarrent) {
    this.carRentRentIdCarrent = carRentRentIdCarrent;
  }

  public java.util.Set<CarRent> getCarRentRentIdCarrent() {
    return carRentRentIdCarrent;
  }

  public void addCarRentRentIdCarrent(CarRent carRentRentIdCarrent) {
    this.carRentRentIdCarrent.add(carRentRentIdCarrent);
  }

  public void removeCarRentRentIdCarrent(CarRent carRentRentIdCarrent) {
    this.carRentRentIdCarrent.remove(carRentRentIdCarrent);
  }

  @javax.persistence.Id
  @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
  @javax.persistence.Column(name="RENT_ID",length=10,nullable=false)
  private int rentId;

  public void setRentId(int rentId) {
    this.rentId = rentId;
  }

  public int getRentId() {
    return rentId;
  }

  @javax.persistence.ManyToOne
  @javax.persistence.JoinColumn(name="RENT_ADDED_BY")
  private User rentAddedBy;

  public void setRentAddedBy(User rentAddedBy) {
    this.rentAddedBy = rentAddedBy;
  }

  public User getRentAddedBy() {
    return rentAddedBy;
  }

  @javax.persistence.Column(name="RENT_COMMENT",length=200)
  private String rentComment;

  public void setRentComment(String rentComment) {
    this.rentComment = rentComment;
  }

  public String getRentComment() {
    return rentComment;
  }

  @javax.persistence.ManyToOne
  @javax.persistence.JoinColumn(name="RENT_CUSTOMER_ID")
  private Customer rentCustomerId;

  public void setRentCustomerId(Customer rentCustomerId) {
    this.rentCustomerId = rentCustomerId;
  }

  public Customer getRentCustomerId() {
    return rentCustomerId;
  }

  @javax.persistence.Column(name="RENT_DELETED",length=1)
  private Boolean rentDeleted;

  public void setRentDeleted(Boolean rentDeleted) {
    this.rentDeleted = rentDeleted;
  }

  public Boolean getRentDeleted() {
    return rentDeleted;
  }

  @javax.persistence.Column(name="RENT_END_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date rentEndDate;

  public void setRentEndDate(java.util.Date rentEndDate) {
    this.rentEndDate = rentEndDate;
  }

  public java.util.Date getRentEndDate() {
    return rentEndDate;
  }

  @javax.persistence.Column(name="RENT_PRICE",length=2)
  private Float rentPrice;

  public void setRentPrice(Float rentPrice) {
    this.rentPrice = rentPrice;
  }

  public Float getRentPrice() {
    return rentPrice;
  }

  @javax.persistence.Column(name="RENT_START_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date rentStartDate;

  public void setRentStartDate(java.util.Date rentStartDate) {
    this.rentStartDate = rentStartDate;
  }

  public java.util.Date getRentStartDate() {
    return rentStartDate;
  }
}