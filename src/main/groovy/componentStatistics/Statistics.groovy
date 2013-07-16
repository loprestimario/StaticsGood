package componentStatistics


class Statistics {

    public ArrayList createStatistics(ArrayList days, ArrayList numberVisits, ArrayList numberPages) {
        def string
        def stringTitle
        def arrayStatistics = new ArrayList()

        for (int i = 0; i < days.size(); i++) {
            def row = days.get(i) + ' , ' + numberVisits.get(i) +' , '+ numberPages.get(i)
            arrayStatistics.add(row)
        }
        return arrayStatistics
    }
}
