package net.nukebob.shinypots.mixin;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PotionItem.class)
public abstract class PotionItemMixin extends Item {
	public PotionItemMixin(Settings settings) {
		super(settings);
	}

	@Override
	public boolean hasGlint(ItemStack stack) {
		PotionContentsComponent component = stack.getComponents().get(DataComponentTypes.POTION_CONTENTS);
		if (component != null) return super.hasGlint(stack) || component.hasEffects();
		return super.hasGlint(stack);
	}
}