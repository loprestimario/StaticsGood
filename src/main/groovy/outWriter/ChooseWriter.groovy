package outWriter

import outWriter.Implementation.WriterCsv
import outWriter.Implementation.WriterJson
import outWriter.Implementation.WriterXml


class ChooseWriter {

    public void chooser(String pathFile, ArrayList arrayList) {

        if (pathFile.contains('.xml')) {
            WriterXml writerXml = new WriterXml()
            writerXml.write(pathFile, arrayList)

        }
        if (pathFile.contains('.csv')) {
            WriterCsv writerCsv = new WriterCsv()
            writerCsv.write(pathFile, arrayList)

        }
        if (pathFile.contains('.json')) {
            WriterJson writerJson = new WriterJson()
            writerJson.write(pathFile, arrayList)

        }
    }
}