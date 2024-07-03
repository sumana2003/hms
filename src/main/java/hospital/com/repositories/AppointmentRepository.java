package hospital.com.repositories;
import hospital.com.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

// src/main/java/com/example/hospital/repositories/AppointmentRepository.java


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
