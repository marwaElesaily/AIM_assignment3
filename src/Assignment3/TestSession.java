package Assignment3;

public class TestSession {

    public static int sessionCount=0;
    int sessionId;
    Browser browser;
    long startTime;

    TestSession(Browser browser){
        sessionCount = sessionCount+1;
        sessionId=sessionCount;
        startTime=System.currentTimeMillis();
        this.browser=browser;
    }

    public static int getSessionCount(){
        return sessionCount;
    }
    public String getInfo(){
        return "Session Id= "+sessionId
                + "  Session Count = "+ sessionCount+
                "  Start Time = "+startTime+
                "  browser = "+browser;
    }
    /*
   instance fields sessionId (auto-assigned from count), browser (enum), and startTime
(System.currentTimeMillis()). Static getSessionCount() method. Instance getInfo() method. Create 3 objects
and verify shared count.
     */
}
