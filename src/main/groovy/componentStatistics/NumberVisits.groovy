package componentStatistics
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 10.23
 * To change this template use File | Settings | File Templates.
 */
public class NumberVisits {

    def arrayVisits = new ArrayList()


    public ArrayList addVisit(String visit){

        arrayVisits.add(visit)
    }

    public  ArrayList getNumberVisit(){

        return arrayVisits
    }
}
