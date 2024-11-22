public class Day2
{
    
    public static void solution(String file)
    {
        System.out.println(findBathroomCode(file.split("")));
    }
    public static String findBathroomCode(String[] instructions) {
        int[][] keypad =
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = 1;
        int col = 1;

        StringBuilder code = new StringBuilder();

        for (String instruction : instructions) 
        {
            for (char move : instruction.toCharArray()) 
            {
                
                switch (move) 
                {
                    case 'U': if (row > 0) row--; break;
                    case 'D': if (row < 2) row++; break;
                    case 'L': if (col > 0) col--; break;
                    case 'R': if (col < 2) col++; break;
                }
            }

            code.append(keypad[row][col]);
        }

        return code.toString();
    }
}

