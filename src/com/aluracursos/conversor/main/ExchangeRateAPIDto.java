package com.aluracursos.conversor.main;

public record ExchangeRateAPIDto(String base_code, String target_code, double conversion_rate) {
}
