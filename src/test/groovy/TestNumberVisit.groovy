import componentStatistics.StatisticsElements
import org.junit.Test
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 11.12
 * To change this template use File | Settings | File Templates.
 */
class TestNumberVisit {

    @Test
    public void verifyNumberVisit() throws InterruptedException {

        StatisticsElements statisticsElements = new StatisticsElements();
        File file = new File("src/main/resources/doc.txt")
        process.Process p = new process.Process(statisticsElements);
        p.extractElements(file);
        def arrayVisit = statisticsElements.getNumberVisit()
        junit.framework.Assert.assertEquals(arrayVisit.size(),31);
        junit.framework.Assert.assertEquals(arrayVisit.get(0),"6");

    }
}
