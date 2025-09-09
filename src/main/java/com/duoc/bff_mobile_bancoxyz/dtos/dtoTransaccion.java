package com.duoc.bff_mobile_bancoxyz.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DtoTransaccion {
    private String fechaTransaccion;
    private Integer monto;
}
