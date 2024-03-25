import javax.swing.JOptionPane;

public final class RecIntegral extends Lab1 {
     Double data[];
     int size=4;
     double sum;
     public Double Integral (double x) {
        
        if (x==0) {
            JOptionPane.showMessageDialog(this, "Число Х не может быть равно нулю!");
            return null;
        }
        else return 1/Math.log(x);
    }
     public RecIntegral (double a, double b, double h) {
           
        double up=a;
        double ost=(b-a)%h;
        sum = h*(0.5*(Integral(a)+Integral(a+ost)));
        a=a+ost;
        
        while (a<=b) {
            
            sum = sum + h*(0.5*(Integral(a) + Integral(a+h)));
            a=a+h;
   }

       data = new Double[size];
       data[0]=up;
       data[1]=b;
       data[2]=h;
       data[3]=sum;
   }
    
   public Double[] getData () {
       return data;
   }
   
   public Double getResult () {
       return sum;
   }
}
