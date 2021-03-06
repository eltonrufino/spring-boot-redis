/*package com.elton.app.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.elton.app.converter.ExpenseConverter;
import com.elton.app.dto.ExpenseDTO;
import com.elton.app.model.Expense;
import com.elton.app.objectfactory.ExpenseMother;
import com.elton.app.service.ExpenseService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ExpenseController.class, secure = false)
public class ExpenseControllerIntTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ExpenseService expenseService;

	@Test
	public void insertTest() throws Exception {
		final ExpenseDTO dto = ExpenseMother.getExpenseDTOPattern();
		dto.setDate(null);
		final Expense model = ExpenseConverter.fromDTO(dto);
		Mockito.when(expenseService.insert(model)).thenReturn(model);

		mvc.perform(post("/api/v1/expenses").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(dto))).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void updateTest() throws Exception {
		final ExpenseDTO dto = ExpenseMother.getExpenseDTOPattern();
		dto.setDate(null);
		final Expense model = ExpenseConverter.fromDTO(dto);
		Mockito.when(expenseService.update(model)).thenReturn(model);

		mvc.perform(put("/api/v1/expenses").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(dto))).andExpect(status().is2xxSuccessful());
	}
}*/