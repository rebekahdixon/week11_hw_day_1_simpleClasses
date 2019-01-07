public class Printer {
    private int paper;
    private int toner;


    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }

    public String print(int pages, int copies){
        int paperUsed = pages * copies;
        if (paper >= paperUsed){
            paper -= paperUsed;
            toner -= paperUsed;
            return "Printed you have " + paper + " bits of paper left" + toner + "ml of toner left.";
        }
        else{
            return "Not enough paper";
        }
    }

    public int refillPrinterPaper(){
        return this.paper = 100;
    }


}

