package com.walbety.blank.service.sample;

import com.walbety.blank.gateway.ISampleGateway;
import com.walbety.blank.service.sample.model.SampleModel;
import com.walbety.blank.service.sample.model.SampleModelMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

  @Autowired private ISampleGateway sampleGateway;

  public List<SampleModel> getModels() {

    return SampleModelMapper.INSTANCE.fromEntity(sampleGateway.getSamples());
  }
}
