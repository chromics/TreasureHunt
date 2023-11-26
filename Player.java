package TreasureHunt;
public class Player {
    private final int id;  
    private int score;
    private int steps;
    private Position position;
    private Map map;
    private int idCount = 1;

    public Player(Map map, Position initialPosition) {
        this.map = map;
        this.position = initialPosition;
        this.id = this.idCount;
        this.idCount++;
    }

    public Player(Map map, Position initialPosition, int maxStepAllowed) {
        this.map = map;
        this.position = initialPosition;
        this.steps = maxStepAllowed;
        this.id = this.idCount;
        this.idCount++;
    }

    // GETTER
    public int getScore() {
        return score;
    }
    public int getSteps() {
        return steps;
    }
    public Position getPosition() {
        return position;
    }
    public int getId() {
        return id;
    }

    // METHODS
    public boolean move(Direction direction, int steps) {

        // CONDITIONS FOR FALSE
        if (map.isActive() == false) {
            return false;
        }
        if (position.getRow() > map.getRows() - 1 || position.getRow() < 0) {
            return false;
        }
        if (position.getCol() > map.getCols() - 1 || position.getCol() < 0) {
            return false;
        }
        if (this.steps <= 0) {
            return false;
        }

        // MOVE WITH RESTRICTION
        // right
        int excessSteps;
        if (direction == Direction.RIGHT && steps + position.getRow() > map.getRows() - 1) {
            excessSteps = steps + position.getRow() - map.getRows();
            if (excessSteps > 0) {
                position.setRow(position.getRow() + excessSteps);
                this.steps -= excessSteps;
            }
        }
        // left
        if (direction == Direction.LEFT && position.getRow() - steps < 0) {
            excessSteps = position.getRow();
            if (excessSteps > 0) {
                position.setRow(position.getRow() - excessSteps);
                this.steps -= excessSteps;
            }
        }
        // down
        if (direction == Direction.DOWN && steps + position.getCol() > map.getCols() - 1) {
            excessSteps = steps + position.getCol() - map.getCols();
            if (excessSteps > 0) {
                position.setCol(position.getCol() + excessSteps);
                this.steps += excessSteps;
            }
        }
        // up
        if (direction == Direction.UP && position.getCol() - steps < 0) {
            excessSteps = position.getCol();
            if (excessSteps > 0) {
                position.setCol(position.getCol() - excessSteps);
                this.steps += excessSteps;
            }
        }

        // MOVE WITHOUT RESTRICTION
        if (direction == Direction.UP && position.getCol() - steps >= 0) {
            position.setCol(position.getCol() + steps);
            this.steps += steps;
        }
        if (direction == Direction.DOWN && steps + position.getCol() <= map.getCols() - 1) {
            position.setCol(position.getCol() - steps);
            this.steps -= steps;
        }
        if (direction == Direction.LEFT && position.getRow() - steps >= 0) {
            position.setRow(position.getRow() - steps);
            this.steps -= steps;
        }
        if (direction == Direction.RIGHT && steps + position.getRow() <= map.getRows() - 1) {
            position.setRow(position.getRow() + steps);
            this.steps += steps;
        }

        map.update(position);

        return true;

    }

    public boolean equals(Player player) {
        if (player.id == this.id) {
            return true;
        }
        return false;
    }

}
