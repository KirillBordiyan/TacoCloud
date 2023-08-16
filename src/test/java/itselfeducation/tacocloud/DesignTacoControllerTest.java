package itselfeducation.tacocloud;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import itselfeducation.tacocloud.web.DesignTacoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DesignTacoController.class)
public class DesignTacoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDesignController() throws Exception{
        mockMvc.perform(get("/design"));
    }

}
