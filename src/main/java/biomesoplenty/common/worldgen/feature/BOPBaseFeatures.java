/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package biomesoplenty.common.worldgen.feature;

import biomesoplenty.common.worldgen.feature.configurations.BasicTreeConfiguration;
import biomesoplenty.common.worldgen.feature.configurations.BigTreeConfiguration;
import biomesoplenty.common.worldgen.feature.configurations.TaigaTreeConfiguration;
import biomesoplenty.common.worldgen.feature.configurations.TwigletTreeConfiguration;
import biomesoplenty.common.worldgen.feature.misc.MossSplatterFeature;
import biomesoplenty.common.worldgen.feature.misc.ShortBambooFeature;
import biomesoplenty.common.worldgen.feature.tree.*;
import biomesoplenty.core.BiomesOPlenty;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.ForgeRegistries;

public class BOPBaseFeatures
{
    // Trees
    public static final BOPTreeFeature<TaigaTreeConfiguration> TAIGA_TREE = register("taiga_tree", new TaigaTreeFeature(TaigaTreeConfiguration.CODEC));
    public static final BOPTreeFeature<BasicTreeConfiguration> BASIC_TREE = register("basic_tree", new BasicTreeFeature(BasicTreeConfiguration.CODEC));
    public static final Feature<NoneFeatureConfiguration> SHORT_BAMBOO = register("short_bamboo", new ShortBambooFeature(NoneFeatureConfiguration.CODEC));
    public static final BOPTreeFeature<BasicTreeConfiguration> BUSH_TREE = register("bush_tree", new BushTreeFeature(BasicTreeConfiguration.CODEC));
    public static final BOPTreeFeature<BigTreeConfiguration> BIG_TREE = register("big_tree", new BigTreeFeature(BigTreeConfiguration.CODEC));
    public static final Feature<NoneFeatureConfiguration> MOSS_SPLATTER = register("moss_splatter", new MossSplatterFeature(NoneFeatureConfiguration.CODEC));
    public static final BOPTreeFeature<TaigaTreeConfiguration> REDWOOD_TREE = register("redwood_tree", new RedwoodTreeFeature(TaigaTreeConfiguration.CODEC));
    public static final BOPTreeFeature<TwigletTreeConfiguration> TWIGLET_TREE = register("twiglet_tree", new TwigletTreeFeature(TwigletTreeConfiguration.CODEC));

    private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String key, F value)
    {
        value.setRegistryName(new ResourceLocation(BiomesOPlenty.MOD_ID, key));
        ForgeRegistries.FEATURES.register(value);
        return value;
    }
}