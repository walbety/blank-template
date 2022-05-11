package com.walbety.blank.gateway;

import com.walbety.blank.gateway.repository.SampleRepository;
import com.walbety.blank.gateway.repository.entity.SampleEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleGatewayImpl implements ISampleGateway {

  @Autowired private SampleRepository repository;

  public List<SampleEntity> getSamples() {
    return repository.findAll();
  }
}
