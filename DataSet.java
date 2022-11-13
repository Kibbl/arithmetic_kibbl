import java.util.*;
import java.io.*;

public class DataSet {
    private ArrayList<DataRow> set;
    private File f;
    int numIndepVars;
    int numRows;

    DataSet(String fileName) {
        f = new File(fileName);
        set = new ArrayList<DataRow>();
    }

    public ArrayList<DataRow> createSet() {
        try {

            Scanner inputFile = new Scanner(f);
            numIndepVars = inputFile.nextInt();
            numRows = inputFile.nextInt();
            while (inputFile.hasNext()) {
                double[] xvalues = new double[numIndepVars];
                for(int i = 0; i < numIndepVars; i++)
                    xvalues[i] = inputFile.nextDouble();
                set.add(new DataRow(inputFile.nextDouble(), xvalues));
            }
            inputFile.close();
        }
        catch(Exception exception) {
            System.out.println(exception);
            return null;
        }
        return set;
    }
}
