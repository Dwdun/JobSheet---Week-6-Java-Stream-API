package JavaProblems;

import java.util.Arrays;

public class ProblemThree {
    public static void main(String[] args) {
        int arr[] = {12, 4, 3, 1, 9, 657};
        int n = 3; // Mencari elemen terbesar ke-3

        int ans = [1]__________.stream(arr)
                .[2]__________()                             // Konversi ke Stream<Integer>
                .sorted((a, b) -> Integer.compare(b, a))     // Urutkan descending
                .[3]__________(n - 1)                        // Lewati 2 elemen pertama
                .[4]__________()                             // Ambil elemen yang tersisa
                .[5]__________(0);                           // Nilai default jika tidak ada

        System.out.println("Elemen terbesar ke-3 adalah: " + ans);
    }
}
