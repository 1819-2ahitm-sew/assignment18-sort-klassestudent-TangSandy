package at.htl.klassestudent;

public class Klasse {
    int klassenbezeichnung;
    Student[] students;



    //Sortiert immer 2 nebeneinanderanliegende Elemte
    public static void sortBubble(Student students[]){


        int length = students.length;
        for (int i = 0; i < length-1; i++)
        for (int j = 0; j < length-i-1; j++)
            if (students[j].getNachname().charAt(0) > students[j+1].getNachname().charAt(0))
            {
                // swap arr[j+1] and arr[i]
                Student temp = students[j];
                students[j] = students[j+1];
                students[j+1] = temp;
            }
    }


    //Sortiert nach input
    public static void sortInsert(Student students[]){
        int length = students.length;
        for (int i = 1; i < length; ++i) {
            Student help = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getNachname().charAt(0) > help.getNachname().charAt(0)) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = help;
        }
    }
}
