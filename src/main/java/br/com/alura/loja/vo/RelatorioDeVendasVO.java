package br.com.alura.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendasVO {
	
	private String nomeProduto;
	
	private Long quantidadeVendida;
	
	private LocalDate ultimaVenda;

	public RelatorioDeVendasVO(String nomeProduto, Long quantidadeVendida, LocalDate ultimaVenda) {
		this.nomeProduto = nomeProduto;
		this.quantidadeVendida = quantidadeVendida;
		this.ultimaVenda = ultimaVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public Long getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public LocalDate getUltimaVenda() {
		return ultimaVenda;
	}

	@Override
	public String toString() {
		return "RelatorioDeVendasVO [nomeProduto=" + nomeProduto + ", quantidadeVendida=" + quantidadeVendida
				+ ", ultimaVenda=" + ultimaVenda + "]";
	}
	
	

}
