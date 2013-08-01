import StatisticsElement.Element;
import outWriter.Selector;
import process.Process;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Process process = new Process();
        ArrayList<Element> statisticsArray = process.extractElements("src/main/resources/doc.txt");
        Selector chooseWriter= new Selector();
        chooseWriter.chooser("src/main/resources/output.csv", statisticsArray);
    }
}
