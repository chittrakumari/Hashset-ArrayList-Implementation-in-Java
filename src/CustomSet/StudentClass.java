/**
 * Creating a Set to store student objects.
 */


package CustomSet;

import java.util.Objects;

public class StudentClass {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name: " + name + " " + "rollNo:" + rollNo + "\n";
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("calling equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return rollNo == that.rollNo &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        System.out.println("calling hashcode");
        return Objects.hash(getName(),getName());
    }
}

