package com.example.demo.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
	private Integer id;

	private String name;

	private Date birthDate;
}
