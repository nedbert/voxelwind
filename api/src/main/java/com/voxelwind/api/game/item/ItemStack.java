package com.voxelwind.api.game.item;

import com.voxelwind.api.game.item.data.ItemData;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * Specifies an item stack. This class is immutable.
 */
@Nonnull
public interface ItemStack {
    /**
     * Returns the material this item stack represents.
     * @return the material the item stack represented
     */
    ItemType getItemType();

    /**
     * Returns the amount that this item stack represents.
     * @return the amount this item stack represents
     */
    int getAmount();

    /**
     * Returns the item data that this item has.
     * @return the item data
     */
    Optional<ItemData> getItemData();

    /**
     * Creates a builder from this item stack.
     * @return a {@link ItemStackBuilder}
     */
    ItemStackBuilder toBuilder();
}
