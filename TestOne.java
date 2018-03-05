import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.clarify.xvobase.ClfyCurrency;

import amdocs.core.Money;
import amdocs.oms.infra.DateTime;
interface TestA { String toString(); }
public class TestOne extends Rock {
	
	Integer i;
	int x;
//	public static void main(String[] args) throws Exception {
//		Date d = new Date();
//		System.out.println(d);
//		System.out.println(d.after(null));
//	}
	private static enum AddrType
	 {
	 TAX_ADDRESS,  SHIPPING_ADDRESS,  BILLING_ADDRESS;
	 private AddrType() {} }
	public static void boxer1(Integer y) {
System.out.println(y);
	}
	public static void main(String[] a) throws Exception {
		int j = 4;
		boxer1(j);
		Class2 cl2 = new Class2();
		Inter i = (Class1)cl2;
		Float pi = new Float(3.14f);
//		int i = (int)new Interger(4);
		if (pi > 3) {
			
		}
		
//		
//		double test1 = 723;
//		BigDecimal bd = new BigDecimal(test1);
//		double amountWithoutTax = 206.03;
//		System.out.println(new TestA() {
//			public String toString() { return "test";
//			}
//			});
//		Date systemDate = DateTime.getDate();
//		System.out.println("sysdate:"+systemDate);
//		System.out.println("5576970685".substring(0, 2));
//		System.out.println("5576970685".substring(2, 6));
//		System.out.println("5520796871".substring(0, 2));
//		System.out.println("5520796871".substring(2, 6));
//		StringBuffer customerLastName = new StringBuffer();
//		customerLastName = customerLastName.append("Giri");
//		String secondLastName = null;
//		customerLastName = customerLastName.append(" ").append(secondLastName);
//		System.out.println(customerLastName.toString());
//		System.out.println("amount:"+String.format("%.2f", new Object[] { Double.valueOf(amountWithoutTax) }));
//		System.out.println("Ticket to migrate Orange".substring(0, 30));
		System.out.println("And Printing:"+AddrType.SHIPPING_ADDRESS);
		for (AddrType addressType : AddrType.values())
		{
			System.out.println("Printing:"+addressType);
			System.out.println("Printing:"+(addressType.ordinal() ));
					}
		 
		StringBuffer street = new StringBuffer();
		StringBuffer buildingNumber = new StringBuffer();
		street.append("Street").append(",");
		String ext = "1234";
		String intt = null;

		if (ext != null) {
			buildingNumber.append(ext);
			if (intt != null)
				buildingNumber.append(",");
		}
		if (intt != null)
			buildingNumber.append(intt);

		street.append(buildingNumber);
		System.out.println(street);
		
		
		 
		
		/*DecimalFormat fmt = new DecimalFormat("0.00");
		String fmtbal1 = fmt.format(bd.setScale(2, 1));// panel & other screen 12.56
        String fmtbal2 = fmt.format(bd.setScale(2, 4));//text box 12.57
        ClfyCurrency curr = new ClfyCurrency();
        curr.setDecValue(bd);*/
        //String fmtbal3 = fmt.format(new BigDecimal(test).setScale(2, 0));
       //String fmtbal4 = fmt.format(new BigDecimal(test).doubleValue());
        //String fmtbal5 = fmt.format(new BigDecimal(test).setScale(2, 1).doubleValue());
        
        /*System.out.println("fmtbal1:"+fmtbal1);
        System.out.println("fmtbal2:"+fmtbal2);
        System.out.println(curr.getDecValue());*/
//        System.out.println(bd);
//        System.out.println(Double.toString(test1));
//        System.out.println(new BigDecimal(Double.toString(test1)));
//        System.out.println(bd.setScale(2, RoundingMode.HALF_UP));
        //System.out.println(test.);
		//System.out.println(new BigDecimal(test).setScale(2, 1));
        //System.out.println(new BigDecimal(test).setScale(2, 4));
        //System.out.println(new BigDecimal(test).doubleValue());
        //System.out.println("fmtbal3:"+fmtbal3);
       //System.out.println("fmtbal4:"+fmtbal4);
        //System.out.println("fmtbal5:"+fmtbal5);
		
//		String[] str = new String[2];
//		str = ;
		
//		myMethod(str);
//		MyColor treeColor = MyColor.GREEN;
//		if(RED.getRGB() < BLUE.getRGB()) { }
////		Compilation fails due to other error(s) in the code.
//		MyColor purple = new MyColor(0xff00ff);
//		MyColor purple = MyColor.BLUE + MyColor.RED;
	}
	public enum MyColor {
			RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
			private final int rgb;
			MyColor(int rgb) { this.rgb = rgb; }
			public int getRGB() { return rgb; }
		};
	public static void myMethod(String... str){
		try{
			throw new ClassCastException();
		}
		catch(ClassCastException e){
			System.out.println("Caught here ClassCastException");
		}
		catch(Exception e){
			System.out.println("Caught here Exception");
		}
	}
	
	TestOne() {
		 super("granite ");
		 new Rock("granite ");
		 }
	
	

}



class Atom {
Atom() { System.out.print("atom "); }
}
class Rock extends Atom {
Rock(String type) { System.out.print(type); }
 }

