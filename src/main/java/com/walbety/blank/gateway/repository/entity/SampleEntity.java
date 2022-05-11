package com.walbety.blank.gateway.repository.entity;

import java.time.OffsetDateTime;
import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "sample")
public class SampleEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public UUID id;

  @Column(name = "sample_id")
  public String hashId;

  @Column(name = "sample_value")
  public Integer value;

  @Column @CreationTimestamp public OffsetDateTime createdAt;
}
