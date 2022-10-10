import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer round;
    private boolean aprovado;
    
    //Construtor
    public Luta(Lutador desafiado, Lutador desafiante){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.round = 0;
        this.aprovado = false;
        System.out.println("Início do Torneio de Luta");
    }
    
    //Métodos
    public void marcarLuta(Integer round)
    {
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.getNome().equals(desafiante.getNome())){
            if(!(isAprovado())){
                this.setRound(round);
                this.setAprovado(true);
            }
        }
        else{
            System.out.println("Lutadores não estão na mesma categoria!");
        }
    }
    
    public void lutar(){
        if(isAprovado()){
            System.out.println("Apresentação dos lutadores, desafiado vs desafiante: \n");
            desafiado.apresentar();
            System.out.println("\n");
            desafiante.apresentar();
            System.out.println("\n***********************************\n");
            
            for(int x = 0; x < getRound(); x++){
                Random aletorio = new Random();
                int aleatorio = aletorio.nextInt(2);
                switch (aleatorio) {
                    case 1 -> {
                        System.out.println("O vencedor foi: " + desafiado.getNome());
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        
                        System.out.println("Total de vitórias do ganhador: "+desafiado.getWin());
                        System.out.println("Total de derrotas do perdedor: "+desafiante.getLose());
                        System.out.println("\n***********************************\n");
                    }
                    case 2 -> {
                        System.out.println("O vencedor foi: " + desafiante.getNome());
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        
                        System.out.println("Total de vitórias do ganhador: "+desafiante.getWin());
                        System.out.println("Total de derrotas do perdedor: "+desafiado.getLose());
                        System.out.println("\n***********************************\n");
                    }
                    default -> {
                        System.out.println("A luta entre: " + desafiado.getNome() + " vs " + desafiante.getNome() + ", deu empate!");
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                        
                        System.out.println("Respectivos empates dos lutadores: " +desafiado.getTie() +" vs " + desafiante.getTie());
                        System.out.println("\n***********************************\n");
                    }
                }
            }
            System.out.println("Fim do Torneio!");
        }
        else{
            System.out.println("A luta não foi aprovada!");
        }
    }

    //Setters
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public void setRound(Integer round) {
        this.round = round;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    //Getters
    public Lutador getDesafiado() {
        return desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public Integer getRound() {
        return round;
    }
    public boolean isAprovado() {
        return aprovado;
    }
}
