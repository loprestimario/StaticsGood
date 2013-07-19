package process

import componentStatistics.Statistics

public class Process {

    def arrayNumberPages
    def arrayNumberVisits
    def arrayDays
    File file

    public Process(String pathFile) {
        arrayNumberPages = new ArrayList()
        arrayNumberVisits = new ArrayList()
        arrayDays = new ArrayList()
        file = new File(pathFile)
    }

    public ArrayList extractElements() {
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
        Statistics statistics = new Statistics()
        ArrayList statisticsElements = statistics.createStatistics(arrayDays, arrayNumberVisits, arrayNumberPages)
        return statisticsElements
    }
}
