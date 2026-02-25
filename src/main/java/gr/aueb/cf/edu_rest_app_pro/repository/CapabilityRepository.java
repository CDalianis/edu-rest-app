package gr.aueb.cf.edu_rest_app_pro.repository;

import gr.aueb.cf.eduapp.model.Capability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapabilityRepository extends JpaRepository<Capability, Long> {
}
