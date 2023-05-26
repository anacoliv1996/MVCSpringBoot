package br.fatecrl.mvc.Models;

public class Campeonato {

    private String times;
    private int pontos;
    private int gols;


    public Campeonato(String times, int pontos, int gols) {
        this.times = times;
        this.pontos = pontos;
        this.gols = gols;
    }

    public String getTimes(){return times;}
    public void setTimes(String times){this.times = times;}

    public int getPontos(){return pontos;}
    public void setPontos(int pontos){this.pontos = pontos;}

    public int getGols(){return gols;}

    public void setGols(int gols) {this.gols = gols;}

}