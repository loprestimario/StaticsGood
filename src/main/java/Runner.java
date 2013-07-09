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
        NumberVisits numberVisits = new NumberVisits();
        NumberPages numberPages = new NumberPages();
        Days days= new Days();
        Out out = new Out();
        PreProcess preProcess = new PreProcess();
        Statistics statistics= new Statistics();


        File file = preProcess.read("src/main/resources/doc.txt");
        Process process = new Process(numberVisits,numberPages,days);
        process.extractElements(file);

        ArrayList visits = numberVisits.getNumberVisit();
        ArrayList pagesN= numberPages.getNumberPages();
        ArrayList dayN= days.getDays();

        ArrayList statisticsArray= (ArrayList) statistics.createStatistics(dayN,visits, pagesN);
        out.writeOutput("src/main/resources/output.csv",statisticsArray);

    }
}
