package bean;
public class Add{
     private int numA;
     private int numB;     
     private int numC;
     public Add(){
        numA=0;numB=0;numC=0;
     }
     public int getNumA(){
        return numA;
     }
     public int getNumB(){
        return numB;
     }
     public int getNumC(){
        return numC;
     }
     public void setNumA(int val){
        numA = val;
     }
     public void setNumB(int val){
        numB = val;
     }
     public void setNumC(int val){
        numC = val;
     }
     public int getSum(){
        return numA+numB+numC;
     }
}
