package com.duoc.bff_mobile_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoCuentaAnual;

@FeignClient(name = "bancoxyz")
public interface CuentaAnualRestClient {
    @GetMapping("/banco/api/cuentas-anuales")
    List<DtoCuentaAnual> listarCuentasAnuales();

}
