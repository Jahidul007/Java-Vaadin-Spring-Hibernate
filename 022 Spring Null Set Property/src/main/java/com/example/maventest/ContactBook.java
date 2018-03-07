package com.example.maventest;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {

	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	// map setting
	private Map<String, EmergencyContact> contacts = new HashMap<String, EmergencyContact>();

	public ContactBook() {

	}

	public ContactBook(Map<String, EmergencyContact> contacts) {

		this.contacts = contacts;
	}

	public Map<String, EmergencyContact> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, EmergencyContact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(patient == null ? "patient is null\n" : patient.toString() + "\n");
		for (Map.Entry<String, EmergencyContact> contact : contacts.entrySet()) {
			sb.append(contact.toString() + "\n");

		}
		return sb.toString();
	}

}
