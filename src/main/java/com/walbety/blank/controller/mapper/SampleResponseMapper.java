package com.walbety.blank.controller.mapper;

import com.walbety.blank.controller.model.SampleResponse;
import com.walbety.blank.service.sample.model.SampleModel;
import java.util.List;
import java.util.UUID;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SampleResponseMapper {
  public static final SampleResponseMapper INSTANCE = Mappers.getMapper(SampleResponseMapper.class);

  @Mapping(target = "id", expression = "java(convertId(getId()))")
  List<SampleResponse> toSampleResponse(List<SampleModel> sampleModel);

  default String convertId(UUID id) {
    return id != null ? id.toString() : "";
  }
}
