package process
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 12.14
 * To change this template use File | Settings | File Templates.
 */
public class Out {

    public void writeOutput(String pathFile,ArrayList arrayList){

        new File(pathFile).delete()
        File file = new File(pathFile)

        arrayList.each { line->
            def string = line + "\n"
            file.append(string)
        }

    }
}