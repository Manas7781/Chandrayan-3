public class GalacticSpacecraft { //Main Class name with GalacticSpacecraft
    private int[] position;
    private String direction;

    public GalacticSpacecraft(int[] initialPosition, String initialDirection) { //Constructor
        position = initialPosition;
        direction = initialDirection;
    }

    public void moveForward() { // Move Forward according to command
        if (direction.equals("N")) {
            position[1]++;
        } else if (direction.equals("S")) {
            position[1]--;
        } else if (direction.equals("E")) {
            position[0]++;
        } else if (direction.equals("W")) {
            position[0]--;
        } else if (direction.equals("Up")) {
            position[2]++;
        } else if (direction.equals("Down")) {
            position[2]--;
        }
    }
    public void moveBackward() { // Move Backward according to command
        if (direction.equals("N")) {
            position[1]--;
        } else if (direction.equals("S")) {
            position[1]++;
        } else if (direction.equals("E")) {
            position[0]--;
        } else if (direction.equals("W")) {
            position[0]++;
        } else if (direction.equals("Up")) {
            position[2]--;
        } else if (direction.equals("Down")) {
            position[2]++;
        }
    }

    public void turnLeft() { // Move TurnLeft
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        } else if (direction.equals("W")) {
            direction = "S";
        }
    }

    public void turnRight() {  // Move TurnLeft
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("E")) {
            direction = "S";
        } else if (direction.equals("W")) {
            direction = "N";
        }
    }

    public void turnUp() {  // Move TurnUp
        if (direction.equals("N")) {
            direction = "Up";
        } else if (direction.equals("S")) {
            direction = "Down";
        } else if (direction.equals("E") || direction.equals("W")) {
            // No change in direction
        }
    }

    public void turnDown() {  // Move TurnDown
        if (direction.equals("N")) {
            direction = "Down";
        } else if (direction.equals("S")) {
            direction = "Up";
        } else if (direction.equals("E") || direction.equals("W")) {
            // No change in direction
        }
    }

    public static void executeCommands(String[] commands, GalacticSpacecraft spacecraft) {
        for (String command : commands) {
            switch (command) { // Switch case to use to select many Options
                case "f":
                    spacecraft.moveForward();
                    break;
                case "b":
                    spacecraft.moveBackward();
                    break;
                case "r":
                    spacecraft.turnRight();
                    break;
                case "l":
                    spacecraft.turnLeft();
                    break;
                case "u":
                    spacecraft.turnUp();
                    break;
                case "d":
                    spacecraft.turnDown();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] initialPosition = {0, 0, 0};
        String initialDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l"}; //Move forward,right,left,down,bottom,up

        GalacticSpacecraft spacecraft = new GalacticSpacecraft(initialPosition, initialDirection);
        executeCommands(commands, spacecraft);

        System.out.println("Final Position: (" + spacecraft.position[0] + ", " + spacecraft.position[1] + ", " + spacecraft.position[2] + ")");
        System.out.println("Final Direction: " + spacecraft.direction);
    }
}
