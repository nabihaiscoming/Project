public class project{
    public static void main(String[]args) {
   String name = "billybobjoe";
   int mathgrade = 43;
   int englishgrade = 12;
   int avg = average(42,12);
   if (avg > 50){
    System.out.println(name + " pass");
   } else{
    System.out.println(name +  " fail");
   }
    }
    public int average(int math, int english){
    return (math + english) / 2;
    }
}