package outWriter.Implementation

import outWriter.Output

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 19/07/13
 * Time: 21.57
 * To change this template use File | Settings | File Templates.
 */
public class WriterXml implements Output {

    @Override
    void write(String pathFile, ArrayList arrayList) {

        new File(pathFile).delete()

        def fw = new FileWriter(pathFile)
        def xml = new groovy.xml.MarkupBuilder(fw)

        xml.summary() {
            arrayList.each { line ->
                st(line.getElement())
            }
        }
    }


}
