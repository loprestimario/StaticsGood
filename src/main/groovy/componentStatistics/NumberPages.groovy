package componentStatistics

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 09/07/13
 * Time: 23.10
 * To change this template use File | Settings | File Templates.
 */
public class NumberPages {

    def arrayPages = new ArrayList()


    public ArrayList addPages(String pages){

        arrayPages.add(pages)
    }

    public  ArrayList getNumberPages(){

        return arrayPages
    }
}
