import outWriter.ChooseWriter;
import process.Process;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Process process = new Process("src/main/resources/doc.txt");
        ArrayList statisticsArray = process.extractElements();
        ChooseWriter chooseWriter= new ChooseWriter();
        chooseWriter.chooser("src/main/resources/output.xml", statisticsArray);
    }
}
