import java.util.*;

public class Divide extends Binop {
    public Divide(Node l, Node r) {
        super(l, r);
    }

    public Divide() {
        super();
    }

    public double eval(double[] data) {
        return lChild.eval(data) / rChild.eval(data);
    }

    public String toString() {
        return "("+lChild.toString()+" / "+rChild.toString()+")";
    }
}

