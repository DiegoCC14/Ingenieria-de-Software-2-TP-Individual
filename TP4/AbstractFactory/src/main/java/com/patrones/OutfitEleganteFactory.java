package com.patrones;

public class OutfitEleganteFactory implements OutfitFactory{
    @Override
    public Jean crearJean() {
        return new JeanRecto();
    }

    @Override
    public Remera crearRemera() {
        return new RemeraAlCuerpo();
    }
}
