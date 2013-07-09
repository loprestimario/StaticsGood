package componentStatistics

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 09/07/13
 * Time: 23.12
 * To change this template use File | Settings | File Templates.
 */
public class Days {

    def arrayDays = new ArrayList()


    public ArrayList addDay(String day){

        arrayDays.add(day)
    }

    public  ArrayList getDays(){

        return arrayDays
    }
}
