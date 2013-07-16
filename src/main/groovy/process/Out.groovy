package process

import groovy.json.JsonBuilder

public class Out {

    public void chooseWriter(val, String pathFile, ArrayList arrayList) {
        switch (val) {

            case "xml":
                pathFile = pathFile + ".xml"
                writeOutputXml(pathFile, arrayList)
                break;

            case "csv":
                pathFile = pathFile + ".csv"
                writeOutputCvs(pathFile, arrayList)
                break;

            case "json":
                pathFile = pathFile + ".json"
                writeOutputJson(pathFile, arrayList)
                break;
        }

    }

    public void writeOutputCvs(String pathFile, ArrayList arrayList) {

        new File(pathFile).delete()
        File file = new File(pathFile)

        arrayList.each { line ->
            file.append(line)
            file.append '\n'
        }
    }

    public void writeOutputXml(String pathFile, ArrayList arrayList) {

        new File(pathFile).delete()

        def fw = new FileWriter(pathFile)
        def xml = new groovy.xml.MarkupBuilder(fw)

        xml.summary() {

            arrayList.each { line ->
                st(line)

            }
        }
    }

    public void writeOutputJson(String pathFile, ArrayList arrayList) {

        def count = 0
        new File(pathFile).delete()

        def fw = new File(pathFile)

        def json = new JsonBuilder()
        json.statistics() {

            arrayList.each { line ->
                //  "${[count]() }"
                "${[count]}"(id: [line])
                count++
            }

        }
        fw.write(json.toString())
    }
}




