package com.depromeet.dodo.petInfo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "Charact")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Charact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String Charact;

}
