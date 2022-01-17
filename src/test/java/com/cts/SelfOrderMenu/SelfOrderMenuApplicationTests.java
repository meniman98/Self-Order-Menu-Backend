package com.cts.SelfOrderMenu;

import com.cts.SelfOrderMenu.controller.FoodController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
