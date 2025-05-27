public class operatorprecedence {
    public static void main(String[] args){
        int result=10+5*2;
        System.out.println("operator precedence: Brackets,Of,Division,Multiplication,Addition,Subtraction");
        System.out.println("the result of 10+5*2 is (10+(5*2)=10)=20 :"+result);

        int result2=(10+5)*2;
        System.out.println("the result of (((10+5)=15)*2)=30  is "+ result2 );
    }
    
}
