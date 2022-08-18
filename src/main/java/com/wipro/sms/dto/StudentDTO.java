package com.wipro.sms.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

	private Long id;
	private String uname;
	private String email;
	private String password;
	private String gender;
	private LocalDate dob;
	private String course;
	private Long phone;
}
