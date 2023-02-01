package com.merry.meal.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.merry.meal.status.Status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int session_id;

@Enumerated(EnumType.STRING)
private Status status;

 private String time;
 private String date;
}
