package com.bymarcin.openglasses.integration.nei.recipe;

import java.util.Arrays;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.bymarcin.openglasses.OpenGlasses;
import com.bymarcin.openglasses.item.OpenGlassesItem;

import codechicken.nei.recipe.ShapelessRecipeHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipHandlerOpenGlassesChatBoxUpgrade extends ShapelessRecipeHandler {

    public RecipHandlerOpenGlassesChatBoxUpgrade() {
        super();
        CachedShapelessRecipe recipe = new CachedShapelessRecipe(
                Arrays.asList(
                        new ItemStack(OpenGlasses.openGlasses),
                        new ItemStack(
                                Item.getItemFromBlock(GameRegistry.findBlock("computronics", "computronics.chatBox")))),
                OpenGlassesItem.setChatBoxUpgrade(new ItemStack(OpenGlasses.openGlasses), true));
        arecipes.add(recipe);
    }
}
