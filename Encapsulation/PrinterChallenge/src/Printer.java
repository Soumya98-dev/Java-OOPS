public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        }else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount >= 100 || tonerAmount < 0){
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
        if(this.duplex){
            pages = (pages / 2) + (pages % 2);
            System.out.println("It is a duplex printer");
            return this.pagesPrinted + pages;
        }else{
            return this.pagesPrinted + pages;
        }
    }
}
