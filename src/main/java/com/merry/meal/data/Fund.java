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
@Table(name = "funds")
@NoArgsConstructor
@Getter
@Setter
public class Fund {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fund_id;
	private int amount;

	@Enumerated(EnumType.STRING)
	private Status status;
	
	public void setStatus(String name) {
	this.status=status;
		
	}
}
