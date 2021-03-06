package com.example.vendaIngressos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.vendaIngressos.controller.dto.EventoDto;
import com.example.vendaIngressos.controller.form.AtualizacaoEventoForm;
import com.example.vendaIngressos.controller.form.EventoForm;
import com.example.vendaIngressos.exception.IdNotFoundException;
import com.example.vendaIngressos.model.Evento;
import com.example.vendaIngressos.repository.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private DataService dataService;

	@Autowired
	private CategoriaService categoriaService;

	public Page<EventoDto> lista(Pageable paginacao) {
		Page<Evento> eventos = eventoRepository.findAll(paginacao);
		return EventoDto.converter(eventos);
	}

	public Page<EventoDto> lista(Pageable paginacao, String nome) {
		Page<Evento> eventos = eventoRepository.findByNome(nome, paginacao);
		return EventoDto.converter(eventos);
	}

	public Page<EventoDto> lista(Pageable paginacao, Long idUsuario) {
		Page<Evento> eventos = eventoRepository.findByCriadorId(paginacao, idUsuario);
		return EventoDto.converter(eventos);
	}

	public Evento insere(EventoForm form, Long criador) {
		Evento evento = form.converter(criador, usuarioService, dataService, categoriaService);
		evento.atualizaCapacidade();
		eventoRepository.save(evento);
		return evento;
	}

	public Evento atualiza(Long id, AtualizacaoEventoForm form) {
		Optional<Evento> optional = this.getOne(id);
		if (optional.isPresent()) {
			Evento eventoAtualizado = form.atualizar(id, eventoRepository, categoriaService);
			return eventoAtualizado;
		}
		throw new IdNotFoundException("Problema na atualização do Evento");
	}

	public boolean deleta(Long id) {
		Optional<Evento> optional = eventoRepository.findById(id);
		if (optional.isPresent()) {
			eventoRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public EventoDto detalhar(Long id) {
		return getOne(id).map(evento -> EventoDto.converter(evento)).orElseThrow(IllegalArgumentException::new);
	}

	public Optional<Evento> getOne(Long idEvento) {
		return eventoRepository.findById(idEvento);

	}

}
