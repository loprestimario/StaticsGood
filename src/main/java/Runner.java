import componentStatistics.*;
import process.Process;
import process.Out;
import process.PreProcess;

import java.io.File;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 10.23
 * To change this template use File | Settings | File Templates.
 */
public class Runner {

    public static void main(String[] args) {

        StatisticsElements numberPages = new StatisticsElements();
        Out out = new Out();
        PreProcess preProcess = new PreProcess();
        Statistics statistics = new Statistics();

        File file = preProcess.read("src/main/resources/doc.txt");
        Process process = new Process(numberPages);
        process.extractElements(file);

        ArrayList visits = numberPages.getNumberVisit();
        ArrayList pagesN = numberPages.getNumberPages();
        ArrayList dayN = numberPages.getDays();

        ArrayList statisticsArray = (ArrayList) statistics.createStatistics(dayN, visits, pagesN);
        out.chooseWriter("json", "src/main/resources/output", statisticsArray);
    }
}
