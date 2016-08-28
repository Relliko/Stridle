package rellikolbaid.stridle;

/**
 * SPAGHETTI CODE AHOY!
 */
public class GameCore {
    private static int lifetimeSteps = -1; //TODO: save/load this
    private static int sessionSteps = -1; // Allow this to reset every time the app is closed
    private static int points = 0;

    /**
     * Core points calculation method.
     */
    private void pointsCalc() {
        points = lifetimeSteps;
    }

    public void addSteps() {
        sessionSteps += 1;
        lifetimeSteps += 1;
        pointsCalc();
    }

    public int getPoints() {
        return points;
    }

    public int getSessionSteps() {
        return sessionSteps;
    }
}