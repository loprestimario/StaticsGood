package process

public class Process {

    def arraySt
    File file

    public Process(String pathFile) {
        arraySt = new ArrayList()
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
                array = new ArrayList()
            }
            if (m1 && start == true) {

                array.add(m1[0][1])
            }
            if ((m2 || m3) && start == true) {
                def statistic = day + ' , ' + array.get(1) + ' , ' + array.get(2)
                arraySt.add(statistic)
                start = false
            }
        }
        return arraySt
    }
}
