package hospital.com.repositories;
import hospital.com.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

// src/main/java/com/example/hospital/repositories/PatientRepository.java


public interface PatientRepository extends JpaRepository<Patient, Long> {

}
