package ru.itis;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if ((tonerLevel > 0) && (tonerLevel <= 100)){
            this.tonerLevel = tonerLevel;
        }

        this.isDuplex = isDuplex;
    }

    public void print (int pages){
        this.numberOfPrintedPages += pages;
        this.tonerLevel -= pages * 0.1;
        System.out.println(pages + " pages was printed!");
    }

    public void fillToner(){
        if (tonerLevel > 50) {
            System.out.println("Doesn't need filling!");
        }else {
            System.out.println("Printer was filled");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
