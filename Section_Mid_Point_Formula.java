import java.util.Scanner;
public class Section_Mid_Point_Formula {
    void at_x(){ 
        Scanner sc = new Scanner(System.in);
        int x1 = 0 , x2 = 0 , m1 = 0 , m2 = 0  , formula = 0 ;
        System.out.println("Enter the value of : "); 
        System.out.println("x1 & x2");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println("m1 & m2");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        formula = ((m1*x2) + (m2 * x1)) / (m1 + m2);
        System.out.println(formula);
    }
    void at_y(){
        Scanner sc = new Scanner(System.in);
        int x1 = 0 , x2 = 0 , m1 = 0 , m2 = 0  , formula = 0 ;
        System.out.println("Enter the value of : "); 
        System.out.println("y1 & y2");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.println("m1 & m2");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        formula = ((m1*x2) + (m2 * x1)) / (m1 + m2);
        System.out.println(formula);
    }
    void both(){
        Scanner sc = new Scanner(System.in);
        int y1 = 0 , y2 = 0 , m1 = 0 , m2 = 0  , formula_x = 0 ;
        int x1 = 0 , x2 = 0  , formula_y = 0;
        System.out.println("Enter the following value");
        System.out.println("x1 & x2");
        x1 = sc.nextInt();
        x2 = sc.nextInt(); 
        System.out.println("y1 & y2");
        y1 = sc.nextInt();
        y2 = sc.nextInt(); 
        System.out.println("m1 & m2 ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        formula_x = ((m1*x2) + (m2 * x1)) / (m1 + m2);
        formula_y = ((m1*y2) + (m2 * y1)) / (m1 + m2);
        System.out.println("(x,y) => ("+formula_x+" , "+formula_y+")");
    }
    void mid_point_x(){
        Scanner sc = new Scanner(System.in);
        int x1 = 0 , x2 = 0 , formula = 0;
        System.out.println("Enter the value of :");
        System.out.println("x1 & x2");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        formula = (x1 + x2) / 2 ;
        System.out.println(formula);
    }
    void mid_point_y(){
        Scanner sc = new Scanner(System.in);
        int x1 = 0 , x2 = 0 , formula = 0;
        System.out.println("Enter the value of :");
        System.out.println("y1 & y2");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        formula = (x1 + x2) / 2 ;
        System.out.println(formula);
    }
    public static void main(String[] args) {
        Section_Mid_Point_Formula mathematics = new Section_Mid_Point_Formula();
        char answer_user = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for Co-ordinate formula");
        System.out.println("Enter '2' for Mid-Point formula");
        System.out.println("Enter your choice");
        byte input = sc.nextByte();
        switch(input){
            case 1 :
               System.out.println("On x-axis or on y-axis");
               System.out.println("Enter the word 'b' to find both value(x , y)");
               answer_user = sc.next().charAt(0);
               if(answer_user == 'x')
               mathematics.at_x();
               else if(answer_user == 'y')
               mathematics.at_y();
               else if(answer_user == 'b')
               mathematics.both();
               answer_user = ' '; 
               break;
            case 2 :
            System.out.println("On x-axis or on y-axis");
            answer_user = sc.next().charAt(0);
            if(answer_user == 'x')
               mathematics.mid_point_x();
               else if(answer_user == 'y')
               mathematics.mid_point_y();
               break;
            default : 
                System.out.println("Error !!");
        }
    }
}
