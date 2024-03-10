package Domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StudentStream implements Iterable<StudentGroup> {
    List<StudentGroup> student_groups;

    public StudentStream(int stream_number) {
        this.student_groups = new ArrayList<>();
    }

    public void add_group(StudentGroup group) {
        this.student_groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return student_groups.iterator();
    }
}

class StudentGroup {
    private String name;
    private int size;

    public StudentGroup(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Group: " + name + ", Size: " + size;
    }
}

public class StudentSteam {
    @SuppressWarnings("unchecked")
    public static <T> void main(String[] args) {
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group A", 25);
        StudentGroup group2 = new StudentGroup("Group B", 30);
        StudentGroup group3 = new StudentGroup("Group C", 20);
        stream.add_group(group1);
        stream.add_group(group2);
        stream.add_group(group3);

        for (StudentGroup group : stream) {
            System.out.println(group);
        }

        List<StudentGroup> sorted_groups = new ArrayList<>(stream.student_groups);
        Collections.sort((List<T>) sorted_groups);
        System.out.println("\nSorted groups:");
        for (StudentGroup group : sorted_groups) {
            System.out.println(group);
        }
    }
}