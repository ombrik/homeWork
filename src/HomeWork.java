import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {

        //Домашка 3
        int month = 14;
        if (month <= 5 && month >= 3) {
            System.out.println("Vesna");
        } else if (month >= 6 && month <= 8) {
            System.out.println("leto");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Osen");
        } else if (month == 12 && month >= 1 && month <= 2) {
            System.out.println("zima");
        } else {
            System.out.println("NONE");
        }
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Vesna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Leto");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Osen");
                break;
            default:
                System.out.println("NONE");
                break;
        }



        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = +i;
        }
        for (int j = array.length - 1; j >= 0; j--) {

            System.out.println(array[j]);
        }

        int squareArray[][] = new int[2][3];
        int number[] = {0,1,2};
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[1][0] = 4;
        squareArray[1][1] = 5;
        squareArray[1][2] = 6;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "["+ number[i]+"]"+ "["+number[j] + "]"+ " ");
            }
            System.out.println();
        }



    }
}
