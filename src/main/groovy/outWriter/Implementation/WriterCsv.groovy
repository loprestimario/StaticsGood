package outWriter.Implementation

import outWriter.OutWriter

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 19/07/13
 * Time: 21.57
 * To change this template use File | Settings | File Templates.
 */
public class WriterCsv implements OutWriter {

    @Override
    public void write(String pathFile, ArrayList arrayList) {

        new File(pathFile).delete()
        File file = new File(pathFile)

        arrayList.each { line ->
            file.append(line)
            file.append '\n'
        }
    }
}
