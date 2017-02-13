package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the RENT database table.
 * 
 */
@Entity
@NamedQuery(name="Rent.findAll", query="SELECT r FROM Rent r")
public class Rent implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RENT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rentId;

	@Column(name="RENT_ADDED_BY")
	private int rentAddedBy;

	@Column(name="RENT_COMMENT")
	private String rentComment;

	@Column(name="RENT_DELETED")
	private boolean rentDeleted;

	@Temporal(TemporalType.DATE)
	@Column(name="RENT_END_DATE")
	private Date rentEndDate;
	
	@Min(value = 0L, message = "The value must be positive")
	@Column(name="RENT_PRICE")
	private BigDecimal rentPrice;
	
	@Temporal(TemporalType.DATE)
	@Column(name="RENT_START_DATE")
	private Date rentStartDate;
	
	@NotNull
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Car> cars;

	//bi-directional many-to-one association to Customer
	@NotNull
	@ManyToOne
	@JoinColumn(name="RENT_CUSTOMER_ID")
	private Customer customer;

	public Rent() {
	}

	public Rent(int rentId, int rentAddedBy, String rentComment, boolean rentDeleted, Date rentEndDate,
			BigDecimal rentPrice, Date rentStartDate, List<Car> cars, Customer customer) {
		super();
		this.rentId = rentId;
		this.rentAddedBy = rentAddedBy;
		this.rentComment = rentComment;
		this.rentDeleted = rentDeleted;
		this.rentEndDate = rentEndDate;
		this.rentPrice = rentPrice;
		this.rentStartDate = rentStartDate;
		this.cars = cars;
		this.customer = customer;
	}

	public int getRentId() {
		return this.rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public int getRentAddedBy() {
		return this.rentAddedBy;
	}

	public void setRentAddedBy(int rentAddedBy) {
		this.rentAddedBy = rentAddedBy;
	}

	public String getRentComment() {
		return this.rentComment;
	}

	public void setRentComment(String rentComment) {
		this.rentComment = rentComment;
	}

	public boolean getRentDeleted() {
		return this.rentDeleted;
	}

	public void setRentDeleted(boolean rentDeleted) {
		this.rentDeleted = rentDeleted;
	}

	public Date getRentEndDate() {
		return this.rentEndDate;
	}

	public void setRentEndDate(Date rentEndDate) {
		this.rentEndDate = rentEndDate;
	}

	public BigDecimal getRentPrice() {
		return this.rentPrice;
	}

	public void setRentPrice(BigDecimal rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Date getRentStartDate() {
		return this.rentStartDate;
	}

	public void setRentStartDate(Date rentStartDate) {
		this.rentStartDate = rentStartDate;
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}