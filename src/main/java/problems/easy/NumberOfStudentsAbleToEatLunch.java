package problems.easy;

import java.util.HashMap;

/**
 * Complexity: O(N) (technically it's O(N) + O(N) which is O(N))
 */
public class NumberOfStudentsAbleToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        HashMap<Integer, Integer> studentsMap = new HashMap<>();

        for (int student : students) {
            Integer current = studentsMap.getOrDefault(student, 0);

            studentsMap.put(student, current + 1);
        }

        int fed = 0;

        for (int sandwich : sandwiches) {
            Integer eligibleStudents = studentsMap.getOrDefault(sandwich, 0);

            if (eligibleStudents < 1) {
                return students.length - fed;
            } else {
                fed++;
                studentsMap.put(sandwich, eligibleStudents - 1);
            }
        }

        return students.length - fed;
    }
}
