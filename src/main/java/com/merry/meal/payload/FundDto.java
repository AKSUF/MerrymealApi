package com.merry.meal.payload;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.merry.meal.status.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FundDto {
	private int fund_id;
	private int amount;

	@Enumerated(EnumType.STRING)
	private Status status;
}
