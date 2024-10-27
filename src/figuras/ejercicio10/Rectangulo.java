package figuras.ejercicio10;

class Rectangulo extends Figura {

    private String dimensionA, dimensionB, dimensionC, dimensionD;

    public Rectangulo(String tipoFigura, String dimensionA, String dimensionB, String dimensionC, String dimensionD, String color) {
        super(color, tipoFigura);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
        this.dimensionD = dimensionD;
    }

    @Override
    String dimensiones() {
        return "Dimensiones del: " + this.getTipoFigura() + dimensionA + ", " + dimensionB + ", " + dimensionC + ", " + dimensionD;
    }

    public String toString() {
        return "Circulo{" +
                "tipoFigura='" + getTipoFigura() + '\'' +
                ", dimensionA='" + dimensionA + '\'' +
                ", dimensionB='" + dimensionB + '\'' +
                ", dimensionC='" + dimensionC + '\'' +
                ", dimensionD='" + dimensionD + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
    
}
