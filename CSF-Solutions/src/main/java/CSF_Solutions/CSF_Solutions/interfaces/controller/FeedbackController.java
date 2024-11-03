package CSF_Solutions.CSF_Solutions.interfaces.controller;

import CSF_Solutions.CSF_Solutions.application.service.FeedbackService;
import CSF_Solutions.CSF_Solutions.domain.model.Feedback;
import CSF_Solutions.CSF_Solutions.interfaces.dto.FeedbackDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {
    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping
    public ResponseEntity<FeedbackDto> createFeedback(@RequestBody FeedbackDto feedbackDto) {
        Feedback feedback = feedbackService.createFeedback(feedbackDto.toDomain());
        return new ResponseEntity<>(FeedbackDto.fromDomain(feedback), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.GetAll();
    }
}