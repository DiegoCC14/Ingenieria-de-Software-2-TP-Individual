package com.patrones;

public class EnvioMotoCreator extends EnvioCreator{
    @Override
    protected Envio crearEnvio() {
        return new EnvioMoto();
    }
}
