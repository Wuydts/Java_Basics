import java.util.ArrayList;
/*
Primitives are the most basic kinds of data types and they driectly contain values. There are eight primitive types in total
The basic difference is that primitive variables store the actual values, whereas reference variables store the addresses of the objects they refer to



*/


    class intClass{
        private int myValue;

        public intClass(int myValue){
            this.myValue = myValue;
        }

        public int getMyValue(){
            return myValue;
        }
        public void setMyValue(int myValue){
            this.myValue = myValue;
        }
    }
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
	int[] intArray = new int[10];

	ArrayList<String> strArrayList = new ArrayList<String>();
	strArrayList.add("Chris");
       // ArrayList<int> intArrayList = new ArrayList<int>(); // Can't do this because of prim. type
        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));
        // Instead of doing this we can do autoboxing

        // The difference between Integer and int is that Integer is a class.
        Integer myInt = new Integer(54);
        Double myDouble = new Double(2.25);

        ArrayList<Integer> myintArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            myintArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i < 10; i++)
        {
           System.out.println(i + " --> " + myintArrayList.get(i).intValue());
        }

        //Shorter Method
        Integer myintValue = 56; // When compiled java will convert my code to Integer.Valueof(56)
        int myInt2 = myintValue; //myint.intvalue is being put in automatically

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <=10.0; dbl+=0.5)
            myDoubleValue.add(dbl);

        for(int i = 0; i <myDoubleValue.size(); i++){
            double value = myDoubleValue.get(i);
            System.out.println(i + " --> " + value);
        }
        // Again behind the scenes java is auto running these commands.


    }
}
