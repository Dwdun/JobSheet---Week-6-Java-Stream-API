package JavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(101, "Joe"),
                new Student(103, "Zulkifli"),
                new Student(102, "Riza"),
                new Student(104, "Alice"),
                new Student(105, "Joshua")
        );

        List<Student> ans = students.[1]__________ // Membuka stream
                .[2]__________((s1, s2) -> {       // Melakukan pengurutan
                    
                    // Logika: Jika nama sama, bandingkan ID
                    if (s1.getName().equalsIgnoreCase(s2.getName())) {
                        return [3]__________.compare(s1.getId(), s2.getId());
                    } 
                    // Jika nama berbeda, bandingkan Nama
                    else {
                        return s1.getName().[4]__________(s2.getName());
                    }
                })
                .[5]__________(Collectors.toList()); // Mengumpulkan hasil

        for (Student student : ans) {
            System.out.println(student);
        }
    }
}
