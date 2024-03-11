// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 10; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
           System.out.println("i = " + i);
       }


        for (int i = 10; i >= 1; i--) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        for (int i = 0; i <= 17; i=i+2) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        for (int i = 10; i >= -10; i--) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        for (int year=1904;year<=2096;year++){
            if (year % 4 == 0) {
                System.out.println(year+" год является высокосным");

            }
         for (int i=7;i<=98;i=i+7){
             System.out.println("i = " + i);

         }
            for (int i=1;i<=512;i=i*2){
                System.out.println("i = " + i);

            }
            int monthlySavings=0;
            for (int month=1;month<=12;month++){
                monthlySavings=monthlySavings+29000;
                if (month<12){
                System.out.println("Накопления за "+ month+" месяц равны "+monthlySavings);}
                else if (month==12) {
                    System.out.println("Годовые накопления равны "+monthlySavings);}

            }
            double deposit=29000;
            double finalAmount=0;
            for (int month=1;month<=12;month++){
                    deposit=deposit+deposit*0.01;
            if (month<12){
                    System.out.println("Накопления за "+ month+" месяц равны "+deposit);}
                else if (month==12) {
                    System.out.println("Годовые накопления равны "+deposit);}

            }
            for (int i=1;i<=10;i++){
                System.out.println("2*"+i+"="+(2*i));

            }
            }
        }



    }
