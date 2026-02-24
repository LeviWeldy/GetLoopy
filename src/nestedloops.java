public static void main(String[] args) {


    //nested for loops #7
    System.out.println("Problem #7: Nested For Loops");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    //nested for loops #6
    System.out.println("Problem #6: Nested For Loops");
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }

//nested for loops #5
    System.out.println("Problem #5: Nested For Loops");

    for (int i = 5; i >=1 ; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }



}