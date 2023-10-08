package com.pm.arch.mockcontroller;

import com.pm.arch.entity.DigitalCurrency;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;


@SpringBootTest
@AutoConfigureMockMvc
class CheckerControllerTest {

    private static final String MOCK_PATH_V1 = "/api/v1.0.0/currency";

    private static final String HEALTH_CHECKER = "/api/v1.0.0/health";

    @Resource
    private MockMvc mvc;

    @MockBean
    private DigitalCurrency user;



    @Test
    void access_MOCK_PATH_V1() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(MOCK_PATH_V1))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    void access_HEALTH_CHECKER() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(HEALTH_CHECKER))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }


}