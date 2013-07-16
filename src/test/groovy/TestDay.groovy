import componentStatistics.StatisticsElements
import org.junit.Test
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 11.33
 * To change this template use File | Settings | File Templates.
 */
class TestDay {

    @Test
    public void verifyNumberDay() throws InterruptedException {

        StatisticsElements statisticsElements = new StatisticsElements();
        File file = new File("src/main/resources/doc.txt")
        process.Process p = new process.Process(statisticsElements);
        p.extractElements(file);
        def arrayDay = statisticsElements.getDays()
        junit.framework.Assert.assertEquals(arrayDay.size(),31);
        junit.framework.Assert.assertEquals(arrayDay.get(0),"01  May  2013");


    }
}
