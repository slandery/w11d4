package com.tts.w11d4.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class W11d4 {

	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String firstName;
		private String lastName;


		@Column
		@CreationTimestamp
		private Date signedUp;

		public W11d4(String firstName, String lastName, Date signedUp) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.signedUp = signedUp;
		}

		public W11d4() {
		}

		public Long getId() {
			return id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getSignedUp() {
			return signedUp;
		}

		public void setSignedUp(Date signedUp) {
			this.signedUp = signedUp;
		}

		@Override
		public String toString() {
			return "Form [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", signedUp=" + signedUp + "]";
		}

	}



