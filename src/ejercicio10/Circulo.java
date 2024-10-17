package ejercicio10;

class Circulo extends Figura {

    private String dimensionA, dimensionB, dimensionC;

    public Circulo(String tipoFigura, String dimensionA, String dimensionB, String dimensionC, String color) {
        super(color, tipoFigura);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
    }

    @Override
    String dimensiones() {
        return "Dimensiones del: " + this.getTipoFigura() + dimensionA + ", " + dimensionB + ", " + dimensionC;
    }

    public String toString() {
        return "Circulo{" +
                "tipoFigura='" + getTipoFigura() + '\'' +
                ", dimensionA='" + dimensionA + '\'' +
                ", dimensionB='" + dimensionB + '\'' +
                ", dimensionC='" + dimensionC + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
    

}
