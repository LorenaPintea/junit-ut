package springboot.junitut.stub;

public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        super();
        this.studentDao = studentDao;
    }

    int findTotal() {
        //fetch student marks from a database
        int[] array = studentDao.getMarks();

        int sum = 0;

        for(int value : array) {
            sum += value;
        }
        return sum;
    }

}
