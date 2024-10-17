package ejercicio10;

abstract class Figura {
    private String color;
    private String tipoFigura;

    public Figura (String color, String tipoFigura) {
        this.color = color;
        this.tipoFigura = tipoFigura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    abstract String dimensiones();

}
