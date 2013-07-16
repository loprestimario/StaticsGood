package componentStatistics


public class StatisticsElements {

    def arrayPages = new ArrayList()
    def arrayDays = new ArrayList()
    def arrayVisits = new ArrayList()

    public ArrayList addPages(String pages) {

        arrayPages.add(pages)
    }

    public ArrayList getNumberPages() {

        return arrayPages
    }

    public ArrayList addDay(String day) {

        arrayDays.add(day)
    }

    public ArrayList getDays() {

        return arrayDays
    }


    public ArrayList addVisit(String visit) {

        arrayVisits.add(visit)
    }

    public ArrayList getNumberVisit() {

        return arrayVisits
    }
}
