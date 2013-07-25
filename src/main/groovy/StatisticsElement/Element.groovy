package StatisticsElement

public class Element {

    def day
    def numberPages
    def numberVisits

    public void addElement(String s,String a,String b){
          day = s
          numberPages=a
          numberVisits=b
    }

    public String getElement(){
        def st = day + ' , '+ numberPages  + ' , ' + numberVisits
        return st
    }
}
