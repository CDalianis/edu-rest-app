package gr.aueb.cf.edu_rest_app_pro.repository;

import gr.aueb.cf.eduapp.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
