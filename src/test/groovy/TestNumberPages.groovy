import componentStatistics.StatisticsElements
import junit.framework.Assert
import org.junit.Test
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 07/07/13
 * Time: 16.15
 * To change this template use File | Settings | File Templates.
 */
class TestNumberPages {

    @Test
    public void verifyNumberPages() throws InterruptedException {

        StatisticsElements statisticsElements = new StatisticsElements();
        File file = new File("src/main/resources/doc.txt")
        process.Process p = new process.Process(statisticsElements);
        p.extractElements(file);
        def arrayPages = statisticsElements.getNumberPages()
        Assert.assertEquals(arrayPages.size(),31);
        Assert.assertEquals(arrayPages.get(0),"36");

    }
}
