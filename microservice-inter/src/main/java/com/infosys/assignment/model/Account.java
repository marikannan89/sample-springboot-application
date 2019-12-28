package com.infosys.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	private String userId;
	private String totalDataBalance;
	private String availableDataBalance;
	private String usedDataBalance;
	
}
