package com.duoc.bff_mobile_bancoxyz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bff_mobile_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_mobile_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_mobile_bancoxyz.restclient.RestClientBancoXyz;

@Service
public class BffServiceMobile {
    @Autowired
    private RestClientBancoXyz restClientBancoXyz;

    public BffServiceMobile(RestClientBancoXyz restClientBancoXyz) {
        this.restClientBancoXyz = restClientBancoXyz;
    }

    public List<DtoInteres> verInteresesAplicados() {
        return restClientBancoXyz.listarIntereses();
    }

    public List<DtoCuentaAnual> verCuentasAnuales() {
        return restClientBancoXyz.listarCuentasAnuales();
    }

    public List<DtoTransaccion> verTransacciones() {
        return restClientBancoXyz.listarTransacciones();
    }

}
