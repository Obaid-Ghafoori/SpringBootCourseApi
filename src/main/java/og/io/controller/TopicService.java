package og.io.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("spr", "SpringBoot", "Spring Boot description "),
            new Topic("sot", "Software Oriented Techniques", "Software Oriented Techniques description "),
            new Topic("tci", "Testing and Continuous Integrations", "Testing and Continuous Integrations description "),
            new Topic("bec", "Business Economics", "Business Economics description ")
    );

    public List<Topic> getTopics() {
        return topics;
    }
}
