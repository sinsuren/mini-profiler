package in.sinsuren.profiler.mini;

public class Main {
    public static void agentmain(String agentArgs) {
        premain(agentArgs);
    }

    public static void premain(String agentArgs) {
        Main main = new Main();
        main.run(new Options(agentArgs));
    }

    private void run(Options options) {
        Thread t = new Thread(Profiler.newInstance(options));
        t.setDaemon(true);
        t.setName("Profiler");
        t.start();
    }
}