package gr.aueb.cf.edu_rest_app_pro.repository;

import gr.aueb.cf.eduapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByOrderByNameAsc();
}
