package com.programacion_objetos.programacion_objetos.models;

public class CuerpoCeleste {

    Double masa;
    Double orbRadius;
    Double initPosition;
    public CuerpoCeleste() {
    }
    public CuerpoCeleste(Double masa, Double orbRadius, Double initPosition) {
        this.masa = masa;
        this.orbRadius = orbRadius;
        this.initPosition = initPosition;
    }
    public Double getMasa() {
        return masa;
    }
    public void setMasa(Double masa) {
        this.masa = masa;
    }
    public Double getOrbRadius() {
        return orbRadius;
    }
    public void setOrbRadius(Double orbRadius) {
        this.orbRadius = orbRadius;
    }
    public Double getInitPosition() {
        return initPosition;
    }
    public void setInitPosition(Double initPosition) {
        this.initPosition = initPosition;
    }
    
}