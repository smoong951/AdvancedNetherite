package com.autovw.advancednetherite.datagen.providers;

import com.autovw.advancednetherite.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModEnchantmentTagsProvider extends FabricTagProvider.EnchantmentTagProvider
{
    public ModEnchantmentTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup)
    {
        tag(ModTags.PREVENTS_ADDITIONAL_ORE_DROPS).add(Enchantments.SILK_TOUCH);
    }
}
