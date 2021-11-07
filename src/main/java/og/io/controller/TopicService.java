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

    public String addATopic(Topic topic) {
        String msg = "";
        if (!topics.contains(topic)) {
            topics.add(topic);
            return msg = "the Topic [" + topic.getId() + "] successfully added";
        }
        return msg = "the Id is already added";

    }

    public String updateTopic(String id, Topic topic) {
        String msg;
        for (int i = 0; i < topics.size(); i++) {
            Topic tp = topics.get(i);
            if (tp.getId().equals(id)) {
                topics.set(i, topic);
                return msg = "the Topic [" + id + "] is successfully updated";
            }
        }
        return msg = " the Id is NOT updated, please check the id and try again";
    }

    public String deleteTopic(String id) {
        String msg;
        boolean isDeleted = false;
        isDeleted = topics.removeIf(t -> t.getId().equals(id));
        if (isDeleted) {
            return msg = "the Topic [" + id + "] is Deleted successfully";
        }
        return msg = " the Id is NOT Deleted, please check the id and try again";
    }
}
