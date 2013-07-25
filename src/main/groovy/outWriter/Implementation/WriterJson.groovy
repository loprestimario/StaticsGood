package outWriter.Implementation

import groovy.json.JsonBuilder
import outWriter.Output

/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 19/07/13
 * Time: 21.57
 * To change this template use File | Settings | File Templates.
 */

public class WriterJson implements Output {

    @Override
    public void write(String pathFile, ArrayList arrayList) {
        def count = 0
        new File(pathFile).delete()
        def fw = new File(pathFile)
        def json = new JsonBuilder()

        json.statistics() {
            arrayList.each { line ->
                "${[count]}"(id: [line.getElement()])
                count++
            }
        }
        fw.write(json.toString())
    }
}
