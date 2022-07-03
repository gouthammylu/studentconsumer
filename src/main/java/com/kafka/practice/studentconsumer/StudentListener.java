package com.kafka.practice.studentconsumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.practice.dto.Student;

@Service
public class StudentListener {
	
	@KafkaListener(topics = "StudentTopic")
	public void studentDetails(Student student) {
		
		System.out.println(student.getName());
		
	}
	
}
