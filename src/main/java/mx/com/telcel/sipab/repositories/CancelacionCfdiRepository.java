package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.CancelacionCfdi;
import mx.com.telcel.sipab.models.LlaveTramite;

@Repository
public interface CancelacionCfdiRepository extends JpaRepository<CancelacionCfdi, LlaveTramite> {

	@Query(value = QueryConstant.TRAMITE_ACTIVO_POR_UUID, nativeQuery = true)
	CancelacionCfdi findActiveTramiteByUuid(@Param("uuid") String uuid);
	
}
