package com.example.vendaIngressos.controller;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles(value = "test")
public class UsuarioControllerTest {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void deveriaDevolverListaDeUsuario() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/usuario").accept(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.content[-1].nome").value("Matheus"));
//	}
//
//	@Test
//	public void deveriaDevolverUsuarioInserido() throws Exception {
//		URI uri = new URI("/usuario");
//		String json = "{\r\n" + "		\"nomeCompleto\": \"Matheus Bruggemann Vieira\",\r\n"
//				+ "		\"cpf\": \"01014320703\",\r\n" + "		\"endereco\": {\r\n"
//				+ "				\"rua\": \"Rua das corticeiras\",\r\n" + "				\"numero\" : 114,\r\n"
//				+ "				\"cep\": \"88063160\",\r\n" + "				\"bairro\": \"Campeche\"\r\n"
//				+ "		},\r\n" + "		\"username\": \"itfon\",\r\n"
//				+ "		\"email\": \"matheusbvieira@email.com\",\r\n" + "		\"telefone\": \"48991466677\",\r\n"
//				+ "		\"idade\": 19\r\n" + "}";
//
//		mockMvc.perform(MockMvcRequestBuilders.post(uri).content(json).contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().is(201));
//	}
//
//	@Test
//	public void deveriaDevolverUsuarioAlterado() throws Exception {
//		String json = "{\r\n" + "		\"nome\": \"Matheus\",\r\n" + "		\"sobrenome\":\"Bruggemann Vieira\",\r\n"
//				+ "		\"endereco\": {\r\n" + "				\"rua\": \"Rua das corticeiras\",\r\n"
//				+ "				\"numero\" : 114,\r\n" + "				\"cep\": \"88063160\",\r\n"
//				+ "				\"bairro\": \"Campeche\"\r\n" + "		},\r\n"
//				+ "		\"email\": \"matheus@email.com\",\r\n" + "		\"telefone\": \"48991466677\",\r\n"
//				+ "		\"idade\": 19\r\n" + "}";
//
//		mockMvc.perform(
//				MockMvcRequestBuilders.put("/usuario/{id}", 2).content(json).contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.nome").value("Matheus"));
//	}

}
