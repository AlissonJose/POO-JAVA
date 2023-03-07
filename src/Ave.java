public class Ave extends Animal{
    private String tipoBico;
    public Ave (String nome, int idade, double peso, String tipoBico ) {
        super(nome, idade, peso);
        this.tipoBico=tipoBico;

    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }
}

