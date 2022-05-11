package com.walbety.blank.controller;

import com.walbety.blank.controller.mapper.SampleResponseMapper;
import com.walbety.blank.controller.model.SampleResponse;
import com.walbety.blank.service.sample.SampleService;
import com.walbety.blank.service.sample.model.SampleModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

  @Autowired private SampleService service;

  @GetMapping("/getall")
  public ResponseEntity<List<SampleResponse>> testGetMethod() {
    List<SampleModel> model = service.getModels();
    return ResponseEntity.ok()
        .body(SampleResponseMapper.INSTANCE.toSampleResponse(service.getModels()));
  }
}
