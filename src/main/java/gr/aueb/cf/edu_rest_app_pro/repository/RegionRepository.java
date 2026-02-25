package gr.aueb.cf.edu_rest_app_pro.repository;

import gr.aueb.cf.eduapp.model.static_data.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    List<Region> findAllByOrderByNameAsc();
}
