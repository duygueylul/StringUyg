package StringUyg;

public class Main {

	public static void main(String[] args) {
		
		String string1="duygu";
        int i;
        
        i=0;
        i=string1.compareTo("eylül");
        System.out.println(string1);
        
        if(i==0) {
            System.out.println("");
            System.out.println(string1+" =  "+"eylül");
        }
        
        if(i>0) {
            System.out.println("");
            System.out.println(string1+" >  "+"eylül");
        }
        
        if(i<0) {
            System.out.println("");
            System.out.println(string1+"  < "+"eylül");
        }
        
        System.out.println("i="+i);
	}

}
