package Compilador.tree;

public class Literal extends Tree {

    Double val;

    public Literal(Double i) {
        val = i;
        
    }

    public Double eval(Environment e) {
        return val;
    }
    
    public void print() {
        System.out.print("(LITERAL " + val + ")");
    }
    
    
}

