package adam.sevenKyu.MissingArray;

public class TestMissingArray {
    public static void main(String args[]) {
        MissingArray m = new MissingArray();

        int expectedTestResult0 = 2;
        int testResult0 = m.getLengthOfMissingArray(new Object[][]{new Object[]{null}, new Object[]{null, null, null}});
        if (testResult0 != 2) {
            System.out.println(String.format("Incorrect test result %d, should be %d", testResult0, expectedTestResult0));
        } else {
            System.out.println("Test 0 result is OK");
        }

        int expectedTestResult1 = 2;
        int testResult1 = m.getLengthOfMissingArray(new Object[][]{null, new Object[]{null}, new Object[]{null, null, null}});
        if (testResult1 != 2) {
            System.out.println(String.format("Incorrect test result %d, should be %d", expectedTestResult1, testResult1));
        } else {
            System.out.println("Test 0 result is OK");
        }
    }
}
