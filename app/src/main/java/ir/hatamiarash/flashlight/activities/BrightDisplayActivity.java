/*
 * Copyright (c) 2017 - All Rights Reserved - Arash Hatami
 */

package ir.hatamiarash.flashlight.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import ir.hatamiarash.flashlight.R;

public class BrightDisplayActivity extends SimpleActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bright_display);
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        toggleBrightness(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        toggleBrightness(false);
    }

    private void toggleBrightness(boolean increase) {
        final WindowManager.LayoutParams layout = getWindow().getAttributes();
        layout.screenBrightness = (increase ? 1 : 0);
        getWindow().setAttributes(layout);
    }
}