package TreasureHunt;
public class Test {
    public static void main(String[] args) {
        // TreasureLocalTest sss = new TreasureLocalTest();
        // sss.Test01checkEqualScore();
    //    sss.Test02checkStepsAndMapActive();
//        sss.Test03checkStopGame();
//        sss.Test03checkStopGame2();
//        sss.Test04ExampleInDocument();
//        sss.Test05isActive();

        Treasure[] treasures = new Treasure[3];
         treasures[0] = new Treasure(5, new Position(1, 0));
         treasures[1] = new Treasure(5, new Position(0, 2));
         treasures[2] = new Treasure(5, new Position(2, 3));
         GameSystem game = new GameSystem();
         Map map = game.newGame(4, 4, treasures);
         Player player1 = new Player(map, new Position(0, 0));
         Player player2 = new Player(map, new Position(2, 0));
         Player player3 = new Player(map, new Position(0, 3));
         game.addPlayer(player1);
         game.addPlayer(player2);
         game.addPlayer(player3);
         System.out.println(player3.move(Direction.DOWN, 2));
         System.out.println(player3.getPosition().getRow() + " " + player3.getPosition().getCol());





    //    GameSystem game = new GameSystem();


    //    Treasure[] treasures = new Treasure[4];
    //    treasures[0] = new Treasure(5, new Position(0,1));
    //    treasures[1] = new Treasure(10, new Position(0,2));
    //    treasures[2] = new Treasure(2, new Position(0,4));
    //    treasures[3] = new Treasure(15, new Position(1,3));

    //    Map map = game.newGame(3,5, treasures);

    //    Player player1 = new Player(map, new Position(0,0));
    //    Player player2 = new Player(map, new Position(1,4), 4);
    //    Player player3 = new Player(map, new Position(0,3));

    //    game.addPlayer(player1);
    //    game.addPlayer(player2);
    //    game.addPlayer(player3);

    //    System.out.println(player1.move(Direction.DOWN, 2));
    //    System.out.println(player1.move(Direction.RIGHT, 2));
//        player1.move(Direction.UP, 4); //player1 can only move 2 steps UP before hitting the boundary
//
//        player2.move(Direction.LEFT, 2);
//        player2.move(Direction.UP,1); //player2 cannot get the treasure at (0,2), which is already obtained by player1
//
//        player1.move(Direction.LEFT, 3); //player1 can only move 2 steps LEFT before hitting the boundary
//
//        player2.move(Direction.RIGHT, 2); //player2 can only move 1 step RIGHT before reaching the maximum steps allowed
//
//        player3.move(Direction.RIGHT,1);
//        player3.move(Direction.DOWN, 2); //player3 cannot move because all treasures have been found and the map is inactive
//
//        assert(player1.getSteps() == 8);
//        assert(player1.getPosition().equals(new Position(0,0)));
//        assert(player1.getScore() == 15);
//
//        assert(player2.getSteps() == 4);
//        assert(player2.getPosition().equals(new Position(0,3)));
//        assert(player2.getScore() == 15);
//
//        assert(player3.getSteps() == 1);
//        assert(player3.getPosition().equals(new Position(0,4)));
//        assert(player3.getScore() == 2);
//
//        Player winner = game.getWinner();
//        assert(winner.equals(player2)); //player2 and player1 have the same scores, but player2 takes less steps, so player2 is the winner
    }
}