package com.richardson.seletorrotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richardson.seletorrotas.logic.SeletorRotas;
import com.richardson.seletorrotas.model.dto.Rota;

@Service
public class SeletorRotasService {
	@Autowired
	private SeletorRotas seletorRotas;

	public List<Rota> recuperarRotas() {
		return this.seletorRotas.recuperarRotas();
	}

	public String recuperarMelhorRota(String origem, String destino) {
		return this.seletorRotas.recuperarRotas(origem, destino);
	}

	public void registrarRota(Rota rota) {
		this.seletorRotas.registrarRota(rota);
	}
}