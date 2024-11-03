package CSF_Solutions.CSF_Solutions.application.service;

import CSF_Solutions.CSF_Solutions.domain.event.FeedbackCreatedEvent;
import CSF_Solutions.CSF_Solutions.domain.model.Feedback;
import CSF_Solutions.CSF_Solutions.domain.repository.FeedbackRepository;
import CSF_Solutions.CSF_Solutions.infrastructure.event.KafkaFeedbackEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;
    private final KafkaFeedbackEventPublisher eventPublisher;

    public FeedbackService(FeedbackRepository feedbackRepository, KafkaFeedbackEventPublisher eventPublisher) {
        this.feedbackRepository = feedbackRepository;
        this.eventPublisher = eventPublisher;
    }

    public Feedback createFeedback(Feedback feedback) {
        // Lógica para salvar o feedback e disparar evento
        Feedback savedFeedback = feedbackRepository.save(feedback);
        // Emitir evento de domínio
        eventPublisher.publishFeedbackEvent(savedFeedback.getId().toString(), savedFeedback.getComment());
        return savedFeedback;
    }

    public List<Feedback> GetAll(){
        return feedbackRepository.findAll();
    }
}