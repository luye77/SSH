package entity;

/**
 * Items entity. @author MyEclipse Persistence Tools
 */

public class Items implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String city;
	private Integer price;
	private Integer number;
	private String picture;

	// Constructors

	/** default constructor */
	public Items() {
	}

	/** full constructor */
	public Items(String name) {
		this.name = name;
		
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}