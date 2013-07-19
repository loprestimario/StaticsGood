package outWriter

import outWriter.Implementation.WriterCsv
import outWriter.Implementation.WriterJson
import outWriter.Implementation.WriterXml

public class OutWriter {


    public void write(String pathFile, ArrayList arrayList) {}


    public void chooseWriter(val, String pathFile, ArrayList arrayList) {
        switch (val) {

            case "xml":
                pathFile = pathFile + ".xml"
                WriterXml writerXml = new WriterXml()
                writerXml.write(pathFile, arrayList)
                break;

            case "csv":
                pathFile = pathFile + ".csv"
                WriterCsv writerCsv = new WriterCsv()
                writerCsv.write(pathFile, arrayList)
                break;

            case "json":
                pathFile = pathFile + ".json"
                WriterJson writerJson = new WriterJson()
                writerJson.write(pathFile, arrayList)
                break;
        }
    }
}




