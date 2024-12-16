package Semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class SymbolTable {
    private Map<String, Symbol> symbols = new HashMap<>();
    private List<String> errors = new ArrayList<>(); // Lista para almacenar errores
    public void addSymbol(String name, String type, int scopeLevel) {
        if (symbols.containsKey(name)) {
            errors.add("Error: Variable '" + name + "' ya declarada");
        }
        symbols.put(name, new Symbol(name, type, scopeLevel));
    }

    public Symbol lookup(String name) {
        return symbols.get(name);
    }

    public Symbol getLastAddedSymbol() {
        if (symbols.isEmpty()) return null;
        String lastKey = null;
        for (String key : symbols.keySet()) {
            lastKey = key; // Itera hasta el último elemento
        }
        return lastKey != null ? symbols.get(lastKey) : null;
    }
    public void removeSymbolsInScope(int scopeLevel) {
        symbols.entrySet().removeIf(entry -> entry.getValue().getScopeLevel() == scopeLevel);
    }

    public void setValue(String name, Object value) {
        if (symbols.containsKey(name)) {
            symbols.get(name).setValue(value);
        } else {
            errors.add("Error: Variable '" + name + "' no encontrada para asignar valor");
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public Map<String, Symbol> getSymbols() {


        return symbols;
    }
}
