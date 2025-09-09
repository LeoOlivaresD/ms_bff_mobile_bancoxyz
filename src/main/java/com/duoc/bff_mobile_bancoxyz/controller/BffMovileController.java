package com.duoc.bff_mobile_bancoxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_mobile_bancoxyz.services.BffServiceMobile;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
@RequestMapping("/bff_mobile")
public class BffMovileController {
    @Autowired
    private BffServiceMobile bffServiceMobile;

    public BffMovileController(BffServiceMobile bffServiceMobile) {
        this.bffServiceMobile = bffServiceMobile;
    }

    @GetMapping("/cuenta_anual")
    public ResponseEntity<List<DtoCuentaAnual>> verCuentasAnuales() {
        return ResponseEntity.ok(bffServiceMobile.verCuentasAnuales());
    }

    @GetMapping("/interes")
    public ResponseEntity<List<DtoInteres>> verIntereses() {
        return ResponseEntity.ok(bffServiceMobile.verInteresesAplicados());
    }

    @GetMapping("/transaccion")
    public ResponseEntity<List<DtoTransaccion>> verTransacciones() {
        return ResponseEntity.ok(bffServiceMobile.verTransacciones());
    }
}
