import componentStatistics.Statistics;
import outWriter.OutWriter;
import process.Process;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        OutWriter out = new OutWriter();
        Statistics statistics = new Statistics();

        Process process = new Process("src/main/resources/doc.txt");
        ArrayList statisticsArray = process.extractElements();
        out.chooseWriter("xml", "src/main/resources/output", statisticsArray);
    }
}
