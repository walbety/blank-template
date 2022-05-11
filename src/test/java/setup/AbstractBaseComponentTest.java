package setup;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(MockitoExtension.class)
@ActiveProfiles("component-test")
public class AbstractBaseComponentTest {

  @Autowired private WebApplicationContext webApplicationContext;

  protected MockMvc buildMockMvcWithBusinessExceptionHandler() {
    return MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
  }
}
