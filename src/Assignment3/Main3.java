package Assignment3;

import static Assignment3.Browser.*;

public class Main3 {
    public static void main(String[] args) {

        TestSession testSession1=new TestSession(CHROME);

        System.out.println(testSession1.getInfo());
        TestSession testSession2=new TestSession(FIREFOX);

        System.out.println(testSession2.getInfo());

        TestSession testSession3=new TestSession(EDGE);

        System.out.println(testSession3.getInfo());

        System.out.println("sessions count = "+TestSession.getSessionCount());
    }
}
