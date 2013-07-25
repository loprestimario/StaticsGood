import StatisticsElement.Element;
import outWriter.Select;
import process.Process;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Process process = new Process();
        ArrayList<Element> statisticsArray = process.extractElements("src/main/resources/doc.txt");
        Select chooseWriter= new Select();
        chooseWriter.chooser("src/main/resources/output.csv", statisticsArray);
    }
}
