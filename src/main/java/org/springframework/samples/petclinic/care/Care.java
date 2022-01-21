package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.springframework.lang.NonNull;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  //TEST 1
@Table(name = "cares")
public class Care {
	
	@Id  //TEST 1
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //TEST 1
	@Column(name = "id")  //TEST 1
	Integer id;  //TEST 1
	
	@NotEmpty  //TEST 1
	@Size(min = 5, max = 30)  //TEST 1
	@Column(name = "name", unique = true)
    String name;
	
//	@NotNull  //TEST 1
	@NotEmpty  //TEST 1
    String description;
    
	@ManyToMany(cascade = CascadeType.ALL)
	@NotEmpty  //TEST 1
	@JoinColumn(name = "pet_type_id")
    Set<PetType> compatiblePetTypes;  
	
	@ManyToMany(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name = "incompatible_cares_id")  //TEST 4
	Set<Care> incompatibleCares;
}
