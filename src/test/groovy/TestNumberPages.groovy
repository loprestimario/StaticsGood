import org.junit.Assert
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


        process.Process process = new process.Process("src/main/resources/doc.txt");

        ArrayList statisticsArray = process.extractElements();
        Assert.assertEquals(statisticsArray.size(), 31);
        Assert.assertEquals(statisticsArray.get(0), "01  May  2013 , 6 , 36");
    }
}
