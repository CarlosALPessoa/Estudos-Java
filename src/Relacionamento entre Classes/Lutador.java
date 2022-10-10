package CRelacao;

public class Lutador {
    private String nome;
    private String nacionality;
    private Integer age;
    private Double alt;
    private Double peso;
    private String categoria;
    private Integer win;
    private Integer lose;
    private Integer tie;
    
    //Construtor
    public Lutador(String nome, String nacionality, Integer age, Double alt,
    Double peso, Integer win, Integer lose, Integer tie)
    {
        this.nome = nome;
        this.nacionality = nacionality;
        this.age = age;
        this.alt = alt;
        this.setPeso(peso);
        this.win = win;
        this.lose = lose;
        this.tie = tie;
    }
    
    //Métodos
    public void apresentar(){
        System.out.println("------ Informações do lutador  ------");
        System.out.println("Nome do lutador: "+ this.getNome());
        System.out.println("Nacionalidade: " +this.getNacionality());
        System.out.println("Idade: " + this.getAge() + "anos");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Vitórias: " + this.getWin());
        System.out.println("Derrotas: " +this.getLose());
        System.out.println("Empates: " +this.getTie());
    }
    
    public void status(){
        System.out.println("---- Status Lutador ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: "+this.getWin());
        System.out.println("Derrotas: " + this.getLose());
        System.out.println("Empates: " + this.getTie());
    }
    
    public void setCategoria() {
        if(this.peso < 52.2){
            System.out.println("Lutador muito leve para se classificar a lutar.");
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            System.out.println("Lutador acima dos parâmetros para se classificar a luta.");
        }
    }
    
    public void ganharLuta(){
        this.setWin(this.getWin() + 1);
    }
    
    public void perderLuta(){
        this.setLose(this.getLose() + 1);
    }
    
    public void empatarLuta(){
        this.setTie(this.getTie() + 1);
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setAlt(Double alt) {
        this.alt = alt;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
        setCategoria();
    }
   
    public void setWin(Integer win) {
        this.win = win;
    }
    public void setLose(Integer lose) {
        this.lose = lose;
    }
    public void setTie(Integer tie) {
        this.tie = tie;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }
    public String getNacionality() {
        return nacionality;
    }
    public Integer getAge() {
        return age;
    }
    public Double getAlt() {
        return alt;
    }
    public Double getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public Integer getWin() {
        return win;
    }
    public Integer getLose() {
        return lose;
    }
    public Integer getTie() {
        return tie;
    }

}
