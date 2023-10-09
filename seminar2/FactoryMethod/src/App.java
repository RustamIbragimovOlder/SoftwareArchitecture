import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.DiamondGenerator;
import Fabric.EmeraldGenerator;
import Fabric.GarnetGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.RubyGenerator;
import Fabric.SilverGenerator;
import Fabric.TopazGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        // ItemGenerator generator1 = new GoldGenerator();
        // generator1.openReward();
        // ItemGenerator generator2 = new SilverGenerator();
        // generator2.openReward();
        // ItemGenerator generator3 = new GemGenerator();
        // generator3.openReward();
        // ItemGenerator generator4 = new DiamondGenerator();
        // generator4.openReward();
        // ItemGenerator generator5 = new EmeraldGenerator();
        // generator5.openReward();
        // ItemGenerator generator6 = new GarnetGenerator();
        // generator6.openReward();
        // ItemGenerator generator7 = new RubyGenerator();
        // generator7.openReward();
        // ItemGenerator generator8 = new TopazGenerator();
        // generator8.openReward();

        List<ItemGenerator> listGenerator = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            listGenerator.add(new GoldGenerator());
        }
        for (int i = 0; i < 18; i++) {
            listGenerator.add(new SilverGenerator());
        }
        for (int i = 0; i < 6; i++) {
            listGenerator.add(new GemGenerator());
        }
        for (int i = 0; i < 4; i++) {
            listGenerator.add(new DiamondGenerator());
        }
        for (int i = 0; i < 16; i++) {
            listGenerator.add(new EmeraldGenerator());
        }
        for (int i = 0; i < 12; i++) {
            listGenerator.add(new GarnetGenerator());
        }
        for (int i = 0; i < 10; i++) {
            listGenerator.add(new RubyGenerator());
        }
        for (int i = 0; i < 14; i++) {
            listGenerator.add(new TopazGenerator());
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(88);
            listGenerator.get(index).openReward();
        }
    }
}
