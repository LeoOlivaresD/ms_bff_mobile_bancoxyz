package com.duoc.bff_mobile_bancoxyz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_mobile_bancoxyz.restclient.CuentaAnualRestClient;
import com.duoc.bff_mobile_bancoxyz.restclient.InteresRestClientMobile;
import com.duoc.bff_mobile_bancoxyz.restclient.TransaccionRestClient;

@Service
public class BffServiceMobile {
    @Autowired
    private InteresRestClientMobile interesRestClientMobile;
    private TransaccionRestClient transaccionRestClient;
    private CuentaAnualRestClient cuentaAnualRestClient;

    public BffServiceMobile(InteresRestClientMobile interesRestClientMobile,
            TransaccionRestClient transaccionRestClient, CuentaAnualRestClient cuentaAnualRestClient) {
        this.interesRestClientMobile = interesRestClientMobile;
        this.transaccionRestClient = transaccionRestClient;
        this.cuentaAnualRestClient = cuentaAnualRestClient;
    }

    public List<DtoInteres> verInteresesAplicados() {
        return interesRestClientMobile.listarIntereses();
    }

    public List<DtoCuentaAnual> verCuentasAnuales() {
        return cuentaAnualRestClient.listarCuentasAnuales();
    }

    public List<DtoTransaccion> verTransacciones() {
        return transaccionRestClient.listarTransacciones();
    }

}
