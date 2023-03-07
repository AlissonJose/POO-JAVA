public class Peixe extends Animal{

    private String tipoDeBarbatana;

    public Peixe(String nome, int idade, double peso, String tipoDeBarbatana){
        super(nome, idade, peso);
        this.tipoDeBarbatana=tipoDeBarbatana;

    }

    public String getTipoDeBarbatana() {
        return tipoDeBarbatana;
    }

    public void setTipoDeBarbatana(String tipoDeBarbatana) {
        this.tipoDeBarbatana = tipoDeBarbatana;
    }
}
