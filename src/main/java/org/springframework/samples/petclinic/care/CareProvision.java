package org.springframework.samples.petclinic.care;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "care_provisions")
public class CareProvision {  
	
	@Id  //TEST 2
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //TEST 2
	@Column(name = "id")  //TEST 2
	Integer id;  //TEST 2
	
	@NotNull  //TEST 2
	//@Min(value = 0)  //TEST 2
    @Positive
    double duration;
	
	@ManyToOne(optional = true) //TEST 2
	@JoinColumn(name = "visit_id")
    private Visit visit;
	
	@ManyToOne(optional = true)  //TEST 2
	@JoinColumn(name = "care_id")
    Care care;   
}
