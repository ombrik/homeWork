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


        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = +i;
        }
        for (int j = array.length - 1; j >= 0; j--) {

            System.out.println(array[j]);
        }

        int squareArray[][] = new int[2][3];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[1][0] = 4;
        squareArray[1][1] = 5;
        squareArray[1][2] = 6;
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

        //Домашка 2
        int yearOfBirthday = 1995;
        int monthOfBirthday = 5;
        int dayOfBirthday = 29;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println(sum + " Сумма чисел даты рождения");
        System.out.println(monthBiggerDay);
        char name[] = new char[4];
        name[0] = 'С';
        name[1] = 'а';
        name[2] = 'ш';
        name[3] = 'а';
        System.out.println(Arrays.toString(name));

        double myAge = 25;
        double partYear = 4.0 / 12.0;
        double sumDate = partYear + myAge;
        System.out.println(sumDate);

    }
}
