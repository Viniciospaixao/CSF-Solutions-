package CSF_Solutions.CSF_Solutions.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Comentário é obrigatório")
    private String comment;

    @Min(1)
    @Max(5)
    private int rating;

    // Métodos e regras de negócio relevantes
}