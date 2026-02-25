package gr.aueb.cf.edu_rest_app_pro.repository;

import gr.aueb.cf.eduapp.model.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long>,
        JpaSpecificationExecutor<PersonalInfo> {

    Optional<PersonalInfo> findByAmka(String amka);
}
