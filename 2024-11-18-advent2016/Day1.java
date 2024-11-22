public class Day1 
{
    
    public static void solution(String file)
    {
        System.out.println(calculateBlocksAway(file));
    }
    public static int calculateBlocksAway(String input) 
    {
        String[] instructions = input.split(", ");
        
        int x = 0;
        int y = 0;
        int direction = 0; // 0 = North, 1 = East, 2 = South, 3 = West

        for (String instruction : instructions) 
        {
            char turn = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));
            direction = turn == 'R'? (direction + 1) % 4: (direction + 3) % 4;

            switch (direction) 
            {
                case 0: 
                    y += steps; 
                    break; // North
                case 1: 
                    x += steps; 
                    break; // East
                case 2: 
                    y -= steps; 
                    break; // South
                case 3: 
                    x -= steps; 
                    break; // West
            }
        }
        return Math.abs(x) + Math.abs(y);
    }
}

