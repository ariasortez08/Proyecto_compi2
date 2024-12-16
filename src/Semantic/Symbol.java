package Semantic;

public class Symbol {
    private String name;
    private String type;
    private int scopeLevel; // Nivel de alcance
    private Object value;   // Opcional: para almacenar un valor asociado

    private String rangosarreglo; //opcional para arreglos

    private boolean function;

    private String pertfunction;

    public Symbol(String name, String type, int scopeLevel) {
        this.name = name;
        this.type = type;
        this.scopeLevel = scopeLevel;
        this.function = false;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getScopeLevel() {
        return scopeLevel;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setRanges(String range) {
        this.rangosarreglo = range;
    }

    public String getRangosarreglo()
    {
        return rangosarreglo;
    }

    public boolean getFunction() {
        return function;
    }

    public void setFunction(boolean function) {
        this.function = function;
    }

    public String getPertfunction() {
        return pertfunction;
    }

    public void setPertfunction(String pertfunction) {
        this.pertfunction = pertfunction;
    }
}
