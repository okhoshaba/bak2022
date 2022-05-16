package org.vntu.repairAreas;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RepairAreasForm {

	@NotNull
	@Size(min=2, max=10)
	private String orderNumber;

	@NotNull
	@Size(min=2, max=30)
	private String areasName;

	@NotNull
	@Size(min=2, max=30)
	private String nameSparePart;

	@NotNull
	private Float price;

	@NotNull
	@Min(1)
	private Integer numbers;

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getAreasName() {
		return this.areasName;
	}

	public void setAreasName(String areasName) {
		this.areasName = areasName;
	}

	public String getNameSparePart() {
		return this.nameSparePart;
	}

	public void setNameSparePart(String nameSparePart) {
		this.nameSparePart = nameSparePart;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public String toString() {
		return "RepairAreas(orderNumber: " + this.orderNumber + ", areasName: " + this.areasName + ", nameSparePart: " + this.nameSparePart + ", price: " + this.price + ", numbers: " + this.numbers + ")";
	}
}

