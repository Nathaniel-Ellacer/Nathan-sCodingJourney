package CIRCULARLINKEDLIST;

public class Main {
    public static void main(String[] args) {
        CircleList gamePlayers = new CircleList();
        
        gamePlayers.add(new CNode("CaRtOoNz", null));
        gamePlayers.add(new CNode("H20Delirious", null));
        gamePlayers.add(new CNode("Kyle", null));
        gamePlayers.add(new CNode("DeadSquirrel", null));
        gamePlayers.add(new CNode("Rocky", null));
        
        
        System.out.println("Players in the game: " + gamePlayers.toString());
        
        
        for(int i = 0; i < 3; i++) {
            
            System.out.println("Current player: " + gamePlayers.getCursor().getElement()+ "\n");
            
           
            CNode eliminatedPlayer = gamePlayers.remove();
            System.out.println("Eliminated Player: " + eliminatedPlayer.getElement()+ "\n");
            
            
            System.out.println("Remaining players: " + gamePlayers.toString());
            
            gamePlayers.advance();
        }
        
        System.out.println("Final players remaining: " + gamePlayers.toString());
    }
}