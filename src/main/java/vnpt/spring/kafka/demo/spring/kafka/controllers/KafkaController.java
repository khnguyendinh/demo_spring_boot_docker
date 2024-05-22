package vnpt.spring.kafka.demo.spring.kafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vnpt.spring.kafka.demo.spring.kafka.common.ResponseModel;
import vnpt.spring.kafka.demo.spring.kafka.service.KafkaService;

import java.text.ParseException;

@RestController
@RequestMapping(value = "/Kafka")
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping(value = "/send-msg", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<ResponseModel> syncMsgs(@RequestBody String body, @RequestHeader HttpHeaders headers){
        ResponseModel responseModel = null;
        kafkaService.sendMessage(body);
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.OK);
    }
    @PostMapping(value = "/add", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String addDc02Special(@RequestBody String body ) {
        return "1";
    }
    @PostMapping(value = "/consume-msg", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<ResponseModel> consumeMsgs(@RequestBody String body, @RequestHeader HttpHeaders headers){
        ResponseModel responseModel = null;
        kafkaService.sendMessage(body);
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.OK);
    }
}
