package CSF_Solutions.CSF_Solutions.interfaces.dto;

import CSF_Solutions.CSF_Solutions.domain.model.Feedback;
import lombok.Data;

@Data
public class FeedbackDto {
    private String comment;
    private int rating;

    // Converte DTO para o modelo de domínio
    public Feedback toDomain() {
        Feedback feedback = new Feedback();
        feedback.setComment(this.comment);
        feedback.setRating(this.rating);
        return feedback;
    }

    // Converte domínio para DTO
    public static FeedbackDto fromDomain(Feedback feedback) {
        FeedbackDto dto = new FeedbackDto();
        dto.setComment(feedback.getComment());
        dto.setRating(feedback.getRating());
        return dto;
    }
}