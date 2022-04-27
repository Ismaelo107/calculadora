package com.calculadora.modelo;

public class Calculadora {
    private Float op1;
    private Float op2;
    private Float resul;

    public Calculadora() {
    }

    public Calculadora(Float op1, Float op2, Float resul) {
        this.op1 = op1;
        this.op2 = op2;
        this.resul = resul;
    }

    public Float getOp1() {
        return op1;
    }

    public void setOp1(Float op1) {
        this.op1 = op1;
    }

    public Float getOp2() {
        return op2;
    }

    public void setOp2(Float op2) {
        this.op2 = op2;
    }

    public Float getResul() {
        return resul;
    }

    public void setResul(Float resul) {
        this.resul = resul;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "op1=" + op1 +
                ", op2=" + op2 +
                ", resul=" + resul +
                '}';
    }
}

