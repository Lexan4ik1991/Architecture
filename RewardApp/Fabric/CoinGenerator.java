package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Coin;

public class CoinGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Coin();
    }
}
