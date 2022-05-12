package org.vntu.MedicationUserInterface.MedicationUserInterface;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInterface {

	@NotNull
	@Min(1)
	@Max(1000)
	private Integer idRecord;

	@NotNull
	@Size(min=2, max=30)
	private String expertNumber;
	private String kriteriyNumber;
	private String participantNumber;

	public Integer getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(Integer idRecord) {
		this.idRecord = idRecord;
	}

	public String getExpertNumber() {
		return this.expertNumber;
	}

	public void setExpertNumber(String expertNumber) {
		this.expertNumber = expertNumber;
	}

	public String getKriteriyNumber() {
		return this.kriteriyNumber;
	}

	public void setKriteriyNumber(String kriteriyNumber) {
		this.kriteriyNumber = kriteriyNumber;
	}

	public String getParticipantNumber() {
		return this.participantNumber;
	}

	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}

	public String toString() {
		return "UserInterface(idRecord: " + this.idRecord + ", expertNumber: " + this.expertNumber + ", kriteriyNumber: " + this.kriteriyNumber + ", participantNumber: " + this.participantNumber + ")";
	}
}

