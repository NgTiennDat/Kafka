package com.datien.kafka.consumer;

import com.datien.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "DatTien", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info("Consuming the message from DatTien topic: {}", message);
    }

    @KafkaListener(topics = "DatTien", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info("Consuming the message as JSON from DatTien topic: {}", student.toString());
    }
}
