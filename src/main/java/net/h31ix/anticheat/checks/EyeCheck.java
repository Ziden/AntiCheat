package net.h31ix.anticheat.checks;

import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class EyeCheck {
    private static final int EYE_DISTANCE = 20;
    
    public EyeCheck()
    {
        
    }
    
    public boolean canSee(Player player, Block block)
    {
        //TODO: The logic here is NOT concrete, especially when looking down at an angle.
        List<Block> blocks = player.getLineOfSight(null, EYE_DISTANCE);
        Location bloc = block.getLocation();
        boolean see = false;
        for(Block b : blocks)
        {
            Location loc = b.getLocation();
            double d = loc.distance(bloc);
            if(d <= 2D)
            {
                see = true;
            }
        }
        return see;
    }    
}
