package com.walbety.blank.service.sample.model;

import com.walbety.blank.gateway.repository.entity.SampleEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SampleModelMapper {

  SampleModelMapper INSTANCE = Mappers.getMapper(SampleModelMapper.class);

  List<SampleModel> fromEntity(List<SampleEntity> sampleModel);
}
