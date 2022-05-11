package com.walbety.blank.service.sample.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleModel {
  private UUID id;
  private String hashId;
  private Integer value;
}
