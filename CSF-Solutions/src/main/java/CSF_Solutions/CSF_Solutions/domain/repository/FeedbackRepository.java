package CSF_Solutions.CSF_Solutions.domain.repository;

import CSF_Solutions.CSF_Solutions.domain.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
