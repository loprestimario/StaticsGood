package componentStatistics

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 13.06
 * To change this template use File | Settings | File Templates.
 */
class Statistics {

    public ArrayList createStatistics(ArrayList days, ArrayList numberVisits, ArrayList numberPages) {
        def string
        def stringTitle
        def arrayStatistics = new ArrayList()

        for (int i = 0; i < days.size(); i++) {
            def row = [days.get(i), numberVisits.get(i), numberPages.get(i)]
            arrayStatistics.add(row)
        }
        return arrayStatistics
    }
}
