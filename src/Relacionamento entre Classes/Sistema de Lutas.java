public class RelacionamentoClasses {

    public static void main(String[] args) {
        Lutador[] lut = new Lutador[6];
        lut[0] = new Lutador("Pretty", "França", 31, 1.75, 68.9, 11, 2, 1);
        lut[1] = new Lutador("Putscripty", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lut[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lut[3] = new Lutador("Dead Code", "Austrália", 28, 1.93,81.6,13,0,2);
        lut[4] = new Lutador("Ufocobol", "Brasil", 37,1.70,119.3,5,4,3);
        lut[5] = new Lutador("Nerdoard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
       /* //Apresentação dos lutadores:
        for(int i = 0; i < 5; i++){
            lut[i].apresentar();
            System.out.println("\n*********************************\n");
            lut[i].status();
            System.out.println("\n######################\n");
        }*/
        
        //TODO: Entre lutadores de categorias diferentes!
        /*Luta UFC01 = new Luta(lut[1], lut[2]);
        
        UFC01.marcarLuta(3);
        UFC01.lutar();*/
        
        Luta UFC01 = new Luta(lut[1], lut[0]);
        UFC01.marcarLuta(4);
        UFC01.lutar();
    }
}
