
class PrachiException extends Exception {

    public PrachiException(String message) {
        super(message);
    }

}

public class customexception {

    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {

            j = 18 / i;

            if (j == 0) {
                throw new PrachiException("my own exception you allll");
            }

        }

        catch (PrachiException e) {
            System.out.println("default value is " + 18 / i  + " "+ e);
        }

        catch (Exception e) {
            System.out.println("Something went worng  : " + e);
        }
        System.out.println("i = " + i + " and j = " + j);

    }

}
