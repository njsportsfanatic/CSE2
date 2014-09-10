//Mark Quentzel
//September 9, 2014
//CSE002
//Arithmetic Java Program

//perform simple arithmetic calculations

//  define a class
import java.text.DecimalFormat;
public class Arithmetic{
    
//  add main method
    public static void main(String[] args) {
    DecimalFormat d = new DecimalFormat("0.##");
    //number of pairs of socks
    int nSocks=3;
    //cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //number of drinking glasses
    int nGlasses=6;
    //cost per glass
    double glassCost$=2.29;

    //number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    //print purchases, # purchases, cost per purchase
    System.out.println("I am buying " + nSocks +" socks at the price of $"+ sockCost$ + ".");
    System.out.println("I am buying " + nGlasses +" glasses at the price of $"+ glassCost$ + ".");
    System.out.println("I am buying " + nEnvelopes +" envelope at the price of $"+ envelopeCost$ + ".");
    
    //create variables for individual costs, individual sales tax, total cost before and after tax
    double totalSockCost$;   //total cost of socks
    double totalGlassCost$;   //total cost of glasses
    double totalEnvelopeCost$;   //total cost of envelopes
    double sockSalesTax$;  //sales tax for socks
    double glassSalesTax$;  //sales tax for glasses
    double envelopeSalesTax$;   //sales tax for envelopes
    double totalSalesTax$;  //total sales tax
    double totalCost1$; //total cost of purchases before tax
    double totalCost2$; //total cost of purchases after tax
    
    //calculate individual costs; store values
    totalSockCost$=nSocks*sockCost$;
    totalGlassCost$=nGlasses*glassCost$;
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    
    //print cost of purchases
    System.out.println("Cost of socks: $" + totalSockCost$);
    System.out.println("Cost of glasses: $" + totalGlassCost$);
    System.out.println("Cost of envelopes: $" + totalEnvelopeCost$);
    
    //calculate individual sales tax
    sockSalesTax$=totalSockCost$*taxPercent;
    glassSalesTax$=totalGlassCost$*taxPercent;
    envelopeSalesTax$=totalEnvelopeCost$*taxPercent;
    
    //print sales tax for purchases
    System.out.println("Sales tax for socks: $" + d.format(sockSalesTax$));
    System.out.println("Sales tax for glasses: $" + d.format(glassSalesTax$));
    System.out.println("Sales tax for envelopes: $" + d.format(envelopeSalesTax$));
    
    //calculate total sales tax
    totalSalesTax$=sockSalesTax$+glassSalesTax$+envelopeSalesTax$;
    
    //calculate total cost of purchases before tax
    totalCost1$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    
    //print total cost of purchases (before tax)
    System.out.println("Total cost of the purchases (pre-tax): $" + d.format(totalCost1$));
    //print total sales tax
    System.out.println("Total sales tax of the purchases: $" + d.format(totalSalesTax$));
    
    //calculate total cost of purchases after tax
    totalCost2$=totalCost1$+totalSalesTax$;
    
    //print total cost of purchases after tax
    System.out.println("Total cost of the purchases: $" +  d.format(totalCost2$));
    
    
    }
    
}


