package outWriter

import outWriter.Implementation.WriterCsv
import outWriter.Implementation.WriterJson
import outWriter.Implementation.WriterXml


class Select {

    public void chooser(String pathFile, ArrayList arrayList) {

        if (pathFile.endsWith('.xml')) {
            WriterXml writerXml = new WriterXml()
            writerXml.write(pathFile, arrayList)

        }
        if (pathFile.endsWith('.csv')) {
            WriterCsv writerCsv = new WriterCsv()
            writerCsv.write(pathFile, arrayList)

        }
        if (pathFile.endsWith('.json')) {
            WriterJson writerJson = new WriterJson()
            writerJson.write(pathFile, arrayList)

        }
    }
}