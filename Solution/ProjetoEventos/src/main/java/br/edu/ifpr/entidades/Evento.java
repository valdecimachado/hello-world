package br.edu.ifpr.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;



public class Evento {
	private LocalDate data;
	private LocalDateTime horaInicio;
	private LocalDateTime horaPrevisaoFim;
	private Local local;
	private Responsavel reponsavel;
	private TipoEvento tipo;
	private List<Convidado> convidados;
	private DespesaTipoEvento despesa;
	private List<Suprimento> suprimentos;
	private BigDecimal valoTotal;
	private <transient>TamanhoEvento tamanhoEvento;
	
		
	
}
