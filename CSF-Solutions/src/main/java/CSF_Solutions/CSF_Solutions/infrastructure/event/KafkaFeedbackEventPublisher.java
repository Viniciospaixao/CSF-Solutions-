package CSF_Solutions.CSF_Solutions.infrastructure.event;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaFeedbackEventPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topicName;

    public KafkaFeedbackEventPublisher(KafkaTemplate<String, String> kafkaTemplate,
                                       @Value("${feedback.topic.name}") String topicName) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicName = topicName;
    }

    public void publishFeedbackEvent(String feedbackId, String comment) {
        // Monta a mensagem a ser enviada, que pode ser JSON ou apenas texto simples
        String eventMessage = String.format("{\"feedbackId\": \"%s\", \"comment\": \"%s\"}", feedbackId, comment);

        // Envia o evento para o Kafka
        kafkaTemplate.send(topicName, feedbackId, eventMessage);
    }
}