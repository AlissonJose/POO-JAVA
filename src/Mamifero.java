public class Mamifero extends Animal {

    private String tipoDePena;
    private String glandulasMamarias;

    public Mamifero(String nome, int idade, double peso, String tipoDePena, String glandulasMamarias){
        super(nome, idade, peso);
        this.tipoDePena=tipoDePena;
                this.glandulasMamarias=glandulasMamarias;
    }

    public String getTipoDePena() {
        return tipoDePena;
    }

    public void setTipoDePena(String tipoDePena) {
        this.tipoDePena = tipoDePena;
    }

    public String getGlandulasMamarias() {
        return glandulasMamarias;
    }

    public void setGlandulasMamarias(String glandulasMamarias) {
        this.glandulasMamarias = glandulasMamarias;
    }
}
