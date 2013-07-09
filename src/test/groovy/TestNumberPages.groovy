import componentStatistics.Days
import componentStatistics.NumberPages
import componentStatistics.NumberVisits
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

        Days day= new Days()
        NumberVisits numberVisits = new NumberVisits();
        NumberPages numberPages = new NumberPages();
        File file = new File("src/main/resources/doc.txt")
        process.Process p = new process.Process(numberVisits,numberPages,day);
        p.extractElements(file);
        def arrayPages = numberPages.getNumberPages()
        Assert.assertEquals(arrayPages.size(),31);

    }
}
