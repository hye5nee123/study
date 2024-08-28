package com.mysite.sbb.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studnum;

	@Column(unique = true)
	private String studname;

	private String tel;

	@Column(unique = true)
	private String email;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.REMOVE)
	private List<Reply> replys;

}
