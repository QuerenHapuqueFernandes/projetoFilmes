package br.com.alura.projetofilmes.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private String categoriaDoFilme;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getCategoriaDoFilme() {
        return categoriaDoFilme;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setCategoriaDoFilme(String categoriaDoFilme) {
        this.categoriaDoFilme = categoriaDoFilme;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do br.com.alura.projetofilmes.modelos.Filme: " + nome);
        System.out.println("Ano de Lançamento do br.com.alura.projetofilmes.modelos.Filme: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
// public: Uma classe, atributo ou método declarado como public pode ser acessado por qualquer classe em qualquer pacote.
// private: só pode ser acessado dentro da própria classe
// default: não especifica nenhum modificador de acesso, pode ser acessado apenas pelas classes que estão no mesmo pacote
