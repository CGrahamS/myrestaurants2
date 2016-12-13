package com.epicodus.myrestaurants.util;

import android.view.View;

/**
 * Created by CGrahamS on 12/12/16.
 */
public interface ItemTouchHelperViewHolder {
    void onItemSelected();
    void onItemClear();
    void onClick(View view);
}
