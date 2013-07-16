package process

import componentStatistics.StatisticsElements

public class Process {

    def arrayNumberPages
    def arrayNumberVisits
    def arrayDays


    public Process( StatisticsElements numberPages) {
        arrayNumberPages = numberPages.getNumberPages()
        arrayNumberVisits = numberPages.getNumberVisit()

        arrayDays = numberPages.getDays()
    }

    public void extractElements(File file) {
        def m
        def m1
        def m2
        def m3
        def start = false
        def array
        def count = 0
        def day

        file.splitEachLine(" ") { line ->
            m = line =~ /<TD>(.*),\W(\w{3}),\W(\w{4})<\/TD>/
            m1 = line =~ /<TD>(.*)<\/TD>/
            m2 = line =~ /<TR>/
            m3 = line =~ /<TR,\WbgColor.*>/
            if (m) {
                start = true
                day = m[0][1] + "  " + m[0][2] + "  " + m[0][3]
                arrayDays.add(day)
                array = new ArrayList()
            }
            if (m1 && start == true) {

                array.add(m1[0][1])
            }
            if ((m2 || m3) && start == true) {
                arrayNumberVisits.add(array.get(1))
                arrayNumberPages.add(array.get(2))
                start = false
            }
        }
    }
}
