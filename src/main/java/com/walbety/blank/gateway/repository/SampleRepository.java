package com.walbety.blank.gateway.repository;

import com.walbety.blank.gateway.repository.entity.SampleEntity;
import io.micrometer.core.lang.NonNullApi;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@NonNullApi
public interface SampleRepository extends JpaRepository<SampleEntity, UUID> {
  @Override
  List<SampleEntity> findAll();
}
