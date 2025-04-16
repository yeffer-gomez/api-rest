package com.yefer.mi_api_rest.service;

import com.yefer.mi_api_rest.model.entity.cliente;

public interface ICliente {

    cliente save(cliente cliente);

    cliente findById(int id);

    void delete(cliente cliente);
}
