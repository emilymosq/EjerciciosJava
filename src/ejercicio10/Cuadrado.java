package ejercicio10;

class Cuadrado extends Figura {

    private String dimensionA, dimensionB;

    public Cuadrado(String tipoString, String dimensionA, String dimensionB, String color) {
        super(color, tipoString);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }

    @Override
    String dimensiones() {
        return "Las dimensiones del " + this.getTipoFigura() + dimensionA + ", " + dimensionB;
    }
    
    public String toString() {
        return "Cuadrado{" +
                "tipoFigura='" + getTipoFigura() + '\'' +
                ", dimensionA='" + dimensionA + '\'' +
                ", dimensionB='" + dimensionB + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
