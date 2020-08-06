package com.lagn.mascotas;

public class Razas {

private String razaprro;
private int Fotoperro;
private int boton;

    public void setLikesdados(int likesdados) {
        Likesdados = likesdados;
    }

    private int Likesdados;
private int sumalk=0;

    public Razas(String razaprro, int fotoperro, int boton, int numerolikes) {
        this.razaprro = razaprro;
        this.Fotoperro = fotoperro;
        this.boton=boton;
        this.Likesdados=numerolikes;

    }

    public int getSumalk() {
        return sumalk;
    }

    public void setSumalk(int sumalk) {
        this.sumalk = sumalk;
    }

    public int getBoton() {
        return boton;
    }

    public void setBoton(int boton) {
        this.boton = boton;
    }

    public int getLikesdados() {
        return Likesdados;
    }



    public String getRazaprro() {
        return razaprro;
    }

    public void setRazaprro(String razaprro) {
        this.razaprro = razaprro;
    }

    public int getFotoperro() {
        return Fotoperro;
    }

    public void setFotoperro(int fotoperro) {
        Fotoperro = fotoperro;
    }

}
