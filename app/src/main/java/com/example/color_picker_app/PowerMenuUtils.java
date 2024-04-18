package com.example.color_picker_app;

import android.content.Context;
import android.graphics.Color;

import androidx.lifecycle.LifecycleOwner;

import com.skydoves.powermenu.CircularEffect;
import com.skydoves.powermenu.MenuAnimation;
import com.skydoves.powermenu.OnMenuItemClickListener;
import com.skydoves.powermenu.PowerMenu;
import com.skydoves.powermenu.PowerMenuItem;
public class PowerMenuUtils {
    public static PowerMenu getPowerMenu(
            Context context,
            LifecycleOwner lifecycleOwner,
            OnMenuItemClickListener<PowerMenuItem> onMenuItemClickListener) {
        return new PowerMenu.Builder(context)
                .setHeaderView(R.layout.layout_header)
                .addItem(new PowerMenuItem("Palette", false))
                .addItem(new PowerMenuItem("Palette(Gallery)", false))
                .addItem(new PowerMenuItem("Selector", false))
                .addItem(new PowerMenuItem("Dialog", false))
                .setLifecycleOwner(lifecycleOwner)
                .setAnimation(MenuAnimation.SHOWUP_TOP_LEFT)
                .setCircularEffect(CircularEffect.BODY)
                .setMenuRadius(10f)
                .setMenuShadow(10f)
                .setTextColor(context.getResources().getColor(R.color.gre))
                .setSelectedEffect(false)
                .setShowBackground(false)
                .setMenuColor(Color.WHITE)
                .setOnMenuItemClickListener(onMenuItemClickListener)
                .build();
    }
}
