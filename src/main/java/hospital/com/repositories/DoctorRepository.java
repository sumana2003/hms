package hospital.com.repositories;
import hospital.com.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


// src/main/java/com/example/hospital/repositories/DoctorRepository.java


public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
