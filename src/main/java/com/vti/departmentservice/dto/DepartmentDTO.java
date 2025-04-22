package com.vti.departmentservice.dto;

import java.util.List;

import lombok.Data;

@Data
public class DepartmentDTO {
    private int id;
	
	private String name;
	
	private String type;
	
	private int totalMember;
	
	private String createdAt ;
	
	private List<AccountDTO> accounts;
}
