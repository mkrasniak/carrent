package com.app.models;
@javax.persistence.Entity
@javax.persistence.Table(name="CUSTOMER")
public class Customer {
  @javax.persistence.Id
  @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
  @javax.persistence.Column(name="CUSTOMER_ID",length=10,nullable=false)
  private int customerId;

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public int getCustomerId() {
    return customerId;
  }

  @javax.persistence.Column(name="CUSTOMER_ADRESS",length=100)
  private String customerAdress;

  public void setCustomerAdress(String customerAdress) {
    this.customerAdress = customerAdress;
  }

  public String getCustomerAdress() {
    return customerAdress;
  }

  @javax.persistence.Column(name="CUSTOMER_BRING_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date customerBringDate;

  public void setCustomerBringDate(java.util.Date customerBringDate) {
    this.customerBringDate = customerBringDate;
  }

  public java.util.Date getCustomerBringDate() {
    return customerBringDate;
  }

  @javax.persistence.Column(name="CUSTOMER_DELETED",length=1)
  private Boolean customerDeleted;

  public void setCustomerDeleted(Boolean customerDeleted) {
    this.customerDeleted = customerDeleted;
  }

  public Boolean getCustomerDeleted() {
    return customerDeleted;
  }

  @javax.persistence.Column(name="CUSTOMER_FIRST_NAME",length=100)
  private String customerFirstName;

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public String getCustomerFirstName() {
    return customerFirstName;
  }

  @javax.persistence.Column(name="CUSTOMER_LAST_RENT_DATE",length=8)
  @javax.persistence.Temporal(value=javax.persistence.TemporalType.DATE)
  private java.util.Date customerLastRentDate;

  public void setCustomerLastRentDate(java.util.Date customerLastRentDate) {
    this.customerLastRentDate = customerLastRentDate;
  }

  public java.util.Date getCustomerLastRentDate() {
    return customerLastRentDate;
  }

  @javax.persistence.Column(name="CUSTOMER_SECOND_NAME",length=100)
  private String customerSecondName;

  public void setCustomerSecondName(String customerSecondName) {
    this.customerSecondName = customerSecondName;
  }

  public String getCustomerSecondName() {
    return customerSecondName;
  }

  @javax.persistence.OneToMany(mappedBy="rentCustomerId", fetch=javax.persistence.FetchType.LAZY)
  private java.util.Set<Rent> rentCustomerIdRent = new java.util.HashSet<Rent>();

  public void setRentCustomerIdRent(java.util.Set<Rent> rentCustomerIdRent) {
    this.rentCustomerIdRent = rentCustomerIdRent;
  }

  public java.util.Set<Rent> getRentCustomerIdRent() {
    return rentCustomerIdRent;
  }

  public void addRentCustomerIdRent(Rent rentCustomerIdRent) {
    this.rentCustomerIdRent.add(rentCustomerIdRent);
  }

  public void removeRentCustomerIdRent(Rent rentCustomerIdRent) {
    this.rentCustomerIdRent.remove(rentCustomerIdRent);
  }
}