package com.cts.SelfOrderMenu;

import com.cts.SelfOrderMenu.controller.FoodController;
import com.cts.SelfOrderMenu.model.Food;
import com.cts.SelfOrderMenu.repo.FoodRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@AutoConfigureMockMvc
@SpringBootTest
class SelfOrderMenuApplicationTests {

	@Autowired
	FoodController controller;

	@Autowired
	private MockMvc mockMvc;
	
	final String url = "/menu/food/get";

	@Test
	void getAllFoodObjects() throws Exception {
		this.mockMvc.perform(get(url)).andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
