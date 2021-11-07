package og.io.controller;

import og.io.controller.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spr", "SpringBoot", "Spring Boot description "),
            new Topic("sot", "Software Oriented Techniques", "Software Oriented Techniques description "),
            new Topic("tci", "Testing and Continuous Integrations", "Testing and Continuous Integrations description "),
            new Topic("bec", "Business Economics", "Business Economics description ")
    ));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getATopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findAny().orElse(null);
    }

    public String addATopic(Topic topic){
        String msg = "";
            if (!topics.contains(topic)) {
                topics.add(topic);
                return msg = "the Topic [" + topic.getId() + "] successfully added";
            }
       return  msg ="the Id is already added";

    }
}
