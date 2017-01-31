package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUSTOMER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;

	@Column(name="CUSTOMER_ADRESS")
	private String customerAdress;

	@Temporal(TemporalType.DATE)
	@Column(name="CUSTOMER_BRING_DATE")
	private Date customerBringDate;

	@Column(name="CUSTOMER_DELETED")
	private boolean customerDeleted;

	@Column(name="CUSTOMER_FIRST_NAME")
	private String customerFirstName;

	@Temporal(TemporalType.DATE)
	@Column(name="CUSTOMER_LAST_RENT_DATE")
	private Date customerLastRentDate;

	@Column(name="CUSTOMER_SECOND_NAME")
	private String customerSecondName;

	//bi-directional many-to-one association to Rent
	@OneToMany(mappedBy="customer")
	private List<Rent> rents;

	public Customer() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAdress() {
		return this.customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	public Date getCustomerBringDate() {
		return this.customerBringDate;
	}

	public void setCustomerBringDate(Date customerBringDate) {
		this.customerBringDate = customerBringDate;
	}

	public boolean getCustomerDeleted() {
		return this.customerDeleted;
	}

	public void setCustomerDeleted(boolean customerDeleted) {
		this.customerDeleted = customerDeleted;
	}

	public String getCustomerFirstName() {
		return this.customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public Date getCustomerLastRentDate() {
		return this.customerLastRentDate;
	}

	public void setCustomerLastRentDate(Date customerLastRentDate) {
		this.customerLastRentDate = customerLastRentDate;
	}

	public String getCustomerSecondName() {
		return this.customerSecondName;
	}

	public void setCustomerSecondName(String customerSecondName) {
		this.customerSecondName = customerSecondName;
	}

	public List<Rent> getRents() {
		return this.rents;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}

	public Rent addRent(Rent rent) {
		getRents().add(rent);
		rent.setCustomer(this);

		return rent;
	}

	public Rent removeRent(Rent rent) {
		getRents().remove(rent);
		rent.setCustomer(null);

		return rent;
	}

}