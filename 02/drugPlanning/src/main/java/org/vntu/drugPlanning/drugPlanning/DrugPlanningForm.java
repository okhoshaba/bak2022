package org.vntu.drugPlanning.drugPlanning;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DrugPlanningForm {

	@NotNull
	@Min(18)
	private Integer idRegistr;

	@NotNull
	@Size(min=2, max=30)
	private String drugName;

	@NotNull
	@Size(min=2, max=30)
	private String drugCapacity;

	@NotNull
	@Size(min=2, max=30)
	private String drugPlace;

	public Integer getIdRegistr() {
		return this.idRegistr;
	}

	public void setIdRegistr(Integer idRegistr) {
		this.idRegistr = idRegistr;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public void setDrugCapacity(String drugCapacity) {
		this.drugCapacity = drugCapacity;
	}

	public String getDrugCapacity() {
		return drugCapacity;
	}

	public void setDrugPlace(String drugPlace) {
		this.drugPlace = drugPlace;
	}

	public String getDrugPlace() {
		return drugPlace;
	}

	public String toString() {
		return "DrugPlanningForm(idRegistr: " + this.idRegistr + ", drugName: " + this.drugName + ", drugCapacity: " + this.drugCapacity + ", drugPlace " + this.drugPlace + ")";
	}
}

