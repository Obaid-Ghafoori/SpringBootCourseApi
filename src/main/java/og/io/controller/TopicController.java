package og.io.controller;

import og.io.controller.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getATopic(@PathVariable String id){
        return topicService.getATopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public String addTopic(@RequestBody Topic topic){
        return topicService.addATopic(topic);
    }
}
