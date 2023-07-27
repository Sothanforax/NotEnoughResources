package neresources.compatibility.ntm;

import cpw.mods.fml.common.Optional;
import com.hbm.blocks.ModBlocks;
import com.hbm.config.WorldConfig;
import com.hbm.config.GeneralConfig;
import neresources.api.distributions.DistributionCustom;
import neresources.api.distributions.DistributionSquare;
import neresources.api.messages.RegisterOreMessage;
import neresources.api.utils.DistributionHelpers;
import neresources.compatibility.CompatBase;
import neresources.utils.ModList;

public class NuclearTechModCompat extends CompatBase
{

    @Override
    protected void init()
    {
        registerNTMOres();
    }

    private void registerNTMOres()
    {

    }
}