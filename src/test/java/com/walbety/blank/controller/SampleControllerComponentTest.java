package com.walbety.blank.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.walbety.blank.service.sample.SampleService;
import com.walbety.blank.service.sample.model.SampleModel;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import setup.AbstractBaseComponentTest;

@WebMvcTest(SampleController.class)
public class SampleControllerComponentTest extends AbstractBaseComponentTest {

  private MockMvc mockMvc;

  @MockBean SampleService sampleService;

  @BeforeEach
  void setup() {
    mockMvc = buildMockMvcWithBusinessExceptionHandler();
  }

  @Test
  void testSampleGet() throws Exception {
    // GIVEN
    SampleModel sampleModel = SampleModel.builder().hashId("id-sample").value(999).build();
    SampleModel sampleModel2 = SampleModel.builder().hashId("id-sample2").value(111).build();
    List<SampleModel> modelList = new ArrayList<SampleModel>();
    modelList.add(sampleModel);
    modelList.add(sampleModel2);

    when(sampleService.getModels()).thenReturn(modelList);

    // WHEN
    ResultActions result = mockMvc.perform(get("/api/sample/getall"));

    // THEN
    assertThat(result).isNotNull();
    result.andExpect(jsonPath("$.[0].id").value(""));
    result.andExpect(jsonPath("$.[0].hashId").value("id-sample"));
    result.andExpect(jsonPath("$.[0].value").value(999));
    result.andExpect(jsonPath("$.[1].id").value(""));
    result.andExpect(jsonPath("$.[1].hashId").value("id-sample2"));
    result.andExpect(jsonPath("$.[1].value").value(111));
  }
}
