package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/medicamento")

public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService; 
	
	@GetMapping
	public List<Medicamento> listaMedicamento(){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamento();
		return lstSalida;
	}
	
}