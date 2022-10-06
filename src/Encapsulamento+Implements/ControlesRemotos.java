package Encapsulamento.ControleRemoto;

public class ControlesRemotos implements Controlador {
    private Integer volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControlesRemotos(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //OVERRIDES
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " +this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i < this.getVolume(); i+=5){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
            System.out.print("\nSaindo do menu...\n");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            if(this.getVolume() <=45)
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            if(this.getVolume() >= 5){
                this.setVolume(this.getVolume() - 5);
            }
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getVolume() > 0 && this.isLigado() == true){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getVolume() == 0 && this.isLigado() == true)
        {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(!(this.isTocando()) && this.isLigado())
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isTocando() && this.isLigado())
        {
            this.setTocando(false);
        }
    }
    
    //sets que somente os métodos podem usar
    private void setVolume(Integer volume) {
        this.volume = volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //getters que somente os métods podem usar.
    private Integer getVolume() {
        return volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private boolean isTocando() {
        return tocando;
    }
}
