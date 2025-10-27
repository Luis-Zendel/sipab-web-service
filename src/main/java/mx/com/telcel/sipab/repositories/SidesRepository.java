package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.Sides;

@Repository
public interface SidesRepository extends JpaRepository<Sides, Integer> {
	
	@Query(value = QueryConstant.MAX_ID_SIDES, nativeQuery = true)
	Integer findMaxIdSides();

}
