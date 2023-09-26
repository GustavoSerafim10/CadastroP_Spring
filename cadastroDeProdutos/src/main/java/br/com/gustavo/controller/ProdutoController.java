package br.com.gustavo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.gustavo.model.Produto;

@Controller 
@ResponseBody
public class ProdutoController {
	
	/*@GetMapping("/olamundo")
	public String olaMundo() {
		return "Olá Mundo";
	}*/
	
	//para importar Ctrl + shift + O
	// criar nosso 1 metedo para listar nossos produtos
	
	@GetMapping("/listardeprodutos")
	public List<Produto> listarProdutos() {
		Produto p1 = new Produto("Celular sansuga", 35, 1299.99);
		Produto p2 = new Produto("Cafeteira arno", 10, 199.99);
		Produto p3 = new Produto("mouse sem fio", 150, 9.95);
		
		return Arrays.asList(p1, p2, p3);
	}

}
