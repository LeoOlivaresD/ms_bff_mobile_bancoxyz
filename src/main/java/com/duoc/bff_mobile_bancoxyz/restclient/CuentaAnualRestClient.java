package com.duoc.bff_mobile_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoCuentaAnual;

@FeignClient(name = "bancoxyz", url = "http://localhost:8081/banco/api")
public interface CuentaAnualRestClient {
    @GetMapping("/cuentas-anuales")
    List<DtoCuentaAnual> listarCuentasAnuales();

}
