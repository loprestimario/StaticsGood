package process

import StatisticsElement.Element

public class Process {

    File file

    public ArrayList<Element> extractElements(String pathFile) {
        def m
        def m1
        def m2
        def m3
        def start = false
        def array
        def count = 0
        def day
        def arrayStatistics = new ArrayList<Element>()
        file = new File(pathFile)

        file.splitEachLine(" ") { line ->
            m = line =~ /<TD>(.*),\W(\w{3}),\W(\w{4})<\/TD>/
            m1 = line =~ /<TD>(.*)<\/TD>/
            m2 = line =~ /<TR>/
            m3 = line =~ /<TR,\WbgColor.*>/

            if (m) {
                start = true
                day = m[0][1] + "  " + m[0][2] + "  " + m[0][3]
                array = new ArrayList()
            }
            if (m1 && start == true) {

                array.add(m1[0][1])
            }
            if ((m2 || m3) && start == true) {
                Element element = new Element()
                element.addElement(day, array.get(1), array.get(2))
                arrayStatistics.add(element)
                start = false
            }
        }
        return arrayStatistics
    }
}
