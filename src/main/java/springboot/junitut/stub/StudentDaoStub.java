package springboot.junitut.stub;

public class StudentDaoStub extends StudentDao {
    @Override
    public int[] getMarks() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
