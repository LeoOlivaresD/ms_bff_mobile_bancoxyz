package com.duoc.bff_mobile_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoTransaccion;

@FeignClient(name = "bancoxyz", url = "http://localhost:8081/banco/api")
public interface RestClientBancoXyz {

    @GetMapping("/transacciones")
    List<DtoTransaccion> listarTransacciones();
}
