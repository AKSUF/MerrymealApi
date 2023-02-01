package com.merry.meal.payload;

import java.util.List;

import com.merry.meal.data.UserRole;

public class AccountDto {
	private Long account_id;
	private String email;
	private String password;
	private String provider;
	private List<UserRole> userRoles;
}
