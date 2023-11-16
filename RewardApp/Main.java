package RewardApp;

import RewardApp.Fabric.*;
import RewardApp.Product.Skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ItemGenerator GemFabric = new GemGenerator();
        ItemGenerator GoldFabric = new GoldGenerator();
        ItemGenerator CoinFabric = new CoinGenerator();
        ItemGenerator HeartFabric = new HeartGenerator();
        ItemGenerator KitFabric = new KitGenerator();
        ItemGenerator KeyFabric = new KeyGenerator();
        ItemGenerator SkillFabric = new SkillGenerator();
        GemFabric.openReward();
        CoinFabric.openReward();
        GoldFabric.openReward();
        HeartFabric.openReward();
        KitFabric.openReward();
        KeyFabric.openReward();
        SkillFabric.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(GemFabric);
        generators.add(CoinFabric);
        generators.add(GoldFabric);
        generators.add(SkillFabric);
        generators.add(HeartFabric);
        generators.add(KitFabric);
        generators.add(KeyFabric);

        Random rnd  = new Random();
        for (int i = 0; i < 10; i++){
            generators.get(rnd.nextInt(generators.size())).openReward();
        }
    }
}
