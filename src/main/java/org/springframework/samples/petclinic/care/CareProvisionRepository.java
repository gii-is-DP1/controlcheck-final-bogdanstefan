package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CareProvisionRepository extends CrudRepository<CareProvision, Integer> {
	
	@Query("SELECT careProvision FROM CareProvision careProvision") //TEST 2
    List<CareProvision> findAll();
//	List<Care> findAllCares();
    Optional<CareProvision> findById(int id);
    
    CareProvision save(CareProvision p);
	
	
	
    //List<Care> findCompatibleCares(String petTypeName);
    //Care findCareByName(String name);
    //List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
}