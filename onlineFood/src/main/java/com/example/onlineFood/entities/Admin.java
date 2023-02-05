package com.example.onlineFood.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		@Size(min=5)
		private String adminUserName;
		@Size(min = 5)
		private String adminPassword;
}

