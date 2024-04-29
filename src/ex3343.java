import java.util.*;

public class ex3343 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityOfTitans = scanner.nextInt();
        int wallLength = scanner.nextInt();
        String[] titans = scanner.next().split("");
        int wallDestructionLvlP = scanner.nextInt();
        int wallDestructionLvlM = scanner.nextInt();
        int wallDestructionLvlG = scanner.nextInt();

        Map<String, Integer> wallDestructionsLvl = new HashMap<>();
        wallDestructionsLvl.put("P", wallDestructionLvlP);
        wallDestructionsLvl.put("M", wallDestructionLvlM);
        wallDestructionsLvl.put("G", wallDestructionLvlG);

        Map<String, Integer> lastDestructedWalls = new HashMap<>();
        lastDestructedWalls.put("P", 0);
        lastDestructedWalls.put("M", 0);
        lastDestructedWalls.put("G", 0);

        List<Integer> walls = new ArrayList<>();
        walls.add(wallLength);

        for (String titan : titans) {
            Integer destructionLvl = wallDestructionsLvl.get(titan);
            Integer lastDestructedWallTitan = lastDestructedWalls.get(titan);

            for (int j = lastDestructedWallTitan; j < walls.size(); j++) {
                Integer wall = walls.get(j);

                if (destructionLvl > wall && j == walls.size() - 1) {
                    walls.add(wallLength);
                }
                if (wall >= destructionLvl) {
                    walls.set(j, wall - destructionLvl);
                    lastDestructedWalls.replace(titan, j);
                    break;
                }
            }
        }

        System.out.println(walls.size());
    }
}
