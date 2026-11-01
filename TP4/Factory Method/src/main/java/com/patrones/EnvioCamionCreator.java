package com.patrones;

public class EnvioCamionCreator extends EnvioCreator{
    @Override
    protected Envio crearEnvio() {
        return new EnvioCamion();
    }
}
