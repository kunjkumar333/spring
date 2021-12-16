package com.coforge.training.ims.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.model.DealerAddress;



public interface UserRepository extends CrudRepository<Dealer, Long> {

public Optional<Dealer> findItByEmail(String email);

public Dealer findByEmail(String email); //custom repository method


// custom query using JPQL in CRUD repository
@Query("select new com.coforge.training.ims.model.DealerAddress(d.id,d.email,d.fname, d.lname,"
+ "d.password, d.dob, d.phoneNo , a.street,a.city,a.pincode) from Dealer d Inner Join d.address a")
List<DealerAddress> fetchDealerInnerJoin();

}