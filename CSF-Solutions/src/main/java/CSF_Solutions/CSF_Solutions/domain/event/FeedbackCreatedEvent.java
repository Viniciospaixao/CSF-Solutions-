package CSF_Solutions.CSF_Solutions.domain.event;

public class FeedbackCreatedEvent {
    private Long feedbackId;
    private String comment;

    public FeedbackCreatedEvent(Long feedbackId, String comment) {
        this.feedbackId = feedbackId;
        this.comment = comment;
    }


}
