package org.cts.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Emp {
	@Id
	private Integer eno;
	@NotNull(message="is required")
	@Size(min=1,message="is Required")
	private String name;
	private String address;
	
	//LinkedHashMap<String, String> countryOptions=new LinkedHashMap<>();;
	public Emp()
	{
		
		/*countryOptions.put("IN", "India");
		countryOptions.put("US", "UnitedStates");
		countryOptions.put("BR", "Brazil");*/
	}
	public Emp(Integer eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
		
	}
	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
}
