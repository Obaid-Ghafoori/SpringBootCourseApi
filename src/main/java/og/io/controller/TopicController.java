package og.io.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

   // private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return Arrays.asList(
                new Topic("spr", "SpringBoot", "Spring Boot description "),
                new Topic("sot", "Software Oriented Techniques", "Software Oriented Techniques description "),
                new Topic("tci", "Testing and Continuous Integrations", "Testing and Continuous Integrations description "),
                new Topic("bec", "Business Economics", "Business Economics description ")
        );
    }
}
