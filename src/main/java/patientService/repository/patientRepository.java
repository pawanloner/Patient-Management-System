package patientService.repository;

import patientService.model.patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepository extends JpaRepository<patient, UUID>{

}
