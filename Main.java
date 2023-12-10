import java.util.HashSet;

import java.io.IOException;
import java.util.function.Consumer;
import pl.edu.uj.javaframe.*;

public class Main {
    public static void main(String[] args) {
        try {
            if(args.length == 4){
                DataFrame df = DataFrame.readCSV(args[0], new Class[]{Int.class});
                Factorize factorizeTask = new Factorize();
                Series result = df.apply(factorizeTask, args[1], Integer.parseInt(args[2]));
    
                int indexToShow = Integer.parseInt(args[3]);
                Series resultRow = result.iloc(indexToShow, indexToShow + 1);
                for (Value v : resultRow.values) {
                    System.out.println(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
