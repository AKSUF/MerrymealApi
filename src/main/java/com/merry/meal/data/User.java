package com.merry.meal.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long user_id;
	@Column(name = "name")
	private String name;
	@Column(name = "detail")
	private String detail;
	@Column(name = "phone_number")
	private String phone_number;
	@Column(name = "birth")
	private String birth;
	@Column(name = "gender")
	private String gender;
	@Lob
	@Column(name = "profile_image")
	private byte[] profile_image;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	private Account account;
}
