package ex_28072024;

import java.util.Arrays;

public class Second_Highest_Salary {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
//        Arrays.stream(salaries).sorted();
        int temp, size = salaries.length;
//        int max = salaries[0];
//        int min = salaries[0];
//        int Second_Highest = salaries[0];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (salaries[i] > salaries[j]) {
                    temp = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = temp;
                }
            }
//            System.out.println(salaries[i]);
//            if (salaries[i] > max) {
//                max = salaries[i];
//            }}
//        System.out.println(salaries);
//            for (int i = 0; i < max; i++) {
//                if (salaries[i] < max) {
//                    max = salaries[i];
//                       System.out.println(max);
//                }
            System.out.println(" Second laggest Number: " + salaries[size - 2]);
        }
    }
}

