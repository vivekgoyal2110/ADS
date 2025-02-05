class MxPlayer extends Thread {
    private String methodName;

    public MxPlayer(String methodName) {
        this.methodName = methodName;
    }

    public void run() {
        System.out.println(methodName + " is running");
    }

    public static void main(String[] args) {
        MxPlayer audioThread = new MxPlayer("Audio");
        // audioThread.sleep(1000);
        MxPlayer videoThread = new MxPlayer("Video");
        // videoThread.sleep(1000);
        MxPlayer timerThread = new MxPlayer("Timer");
        // timerThread.sleep(1000);

        audioThread.start();
        videoThread.start();
        timerThread.start();
    }
}
