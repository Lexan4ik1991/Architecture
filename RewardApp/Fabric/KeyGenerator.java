package RewardApp.Fabric;

import RewardApp.Interface.IGameItem;
import RewardApp.Product.Key;

public class KeyGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Key();

    }
}
