package com.walbety.blank.gateway;

import com.walbety.blank.gateway.repository.entity.SampleEntity;
import java.util.List;

public interface ISampleGateway {
  List<SampleEntity> getSamples();
}
