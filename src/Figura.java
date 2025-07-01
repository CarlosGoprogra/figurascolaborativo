public abstract class Figura {
    protected double valor1;
    public Figura(double valor1){
        this.valor1 = valor1;
    }

    public double getValor(){
        return valor1;
    }

    public void setValor(double valor1){
        this.valor1 = valor1;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}