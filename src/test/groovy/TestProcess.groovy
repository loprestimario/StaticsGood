import StatisticsElement.Element
import org.junit.Assert
import org.junit.Test
import process.*

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 07/07/13
 * Time: 16.15
 * To change this template use File | Settings | File Templates.
 */
class TestProcess {

    @Test
    public void verifyElement() throws InterruptedException {


        Process process = new Process();

        ArrayList<Element> array = process.extractElements("src/main/resources/doc.txt");
        //Assert.assertEquals(array.size(), 31);
        Assert.assertEquals(array.get(0).getElement(), "01  May  2013 , 6 , 36");
    }

    @Test
    public void verifyDay() throws InterruptedException {

        def array
        def line = '<TD>06, May, 2013</TD>'
        def m = line =~ /<TD>(.*),\W(\w{3}),\W(\w{4})<\/TD>/

        if (m) {
            def day = m[0][1] + "  " + m[0][2] + "  " + m[0][3]
            array = new ArrayList()
            array.add(day)
        }

        Assert.assertEquals(array.size(), 1);
        Assert.assertEquals(array.get(0), "06  May  2013");

    }

    @Test
    public void verifyMatcherDay() throws InterruptedException {

        def line = '<TD>06, May, 2013</TD>'
        def m = line ==~ /<TD>(.*),\W(\w{3}),\W(\w{4})<\/TD>/

        Assert.assertTrue(m)
    }

    @Test
    public void verifyMatcherDayBad() throws InterruptedException {

        def line = '<TD>06, May, 201322</TD>'
        def m = line ==~ /<TD>(.*),\W(\w{3}),\W(\w{4})<\/TD>/

        Assert.assertFalse(m)
    }


    @Test
    public void verifyPagesAndVisit() throws InterruptedException {

        def line = '<TD>6</TD>'
        def m = line =~ /<TD>(.*)<\/TD>/

        Assert.assertEquals(m[0][1], "6");
    }

    @Test
    public void verifyEnd() throws InterruptedException {
        def start =true
        def line = '<TR>'

        def m2 = line =~ /<TR>/
        def m3 = line =~ /<TR,\WbgColor.*>/

        if ((m2 || m3) && start == true) {
            start = false
        }
        Assert.assertFalse(start);
    }

    @Test
    public void verifyEndBad() throws InterruptedException {
        def start =true
        def line = '<TRRRRRR>'

        def m2 = line =~ /<TR>/
        def m3 = line =~ /<TR,\WbgColor.*>/

        if ((m2 || m3) && start == true) {
            start = false
        }
        Assert.assertTrue(start);
    }

}
