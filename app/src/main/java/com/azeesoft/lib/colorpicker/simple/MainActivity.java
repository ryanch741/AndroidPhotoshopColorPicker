package com.azeesoft.lib.colorpicker.simple;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.azeesoft.lib.colorpicker.ColorPickerDialog;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTestClick(View view) {
        ColorPickerDialog dialog= ColorPickerDialog.createColorPickerDialog(
                this,ColorPickerDialog.DARK_THEME);
        dialog.setOnColorPickedListener(new ColorPickerDialog.OnColorPickedListener() {
            @Override
            public void onColorPicked(int color, String hexVal) {
                Toast.makeText(MainActivity.this,"color hex: "+hexVal,Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setInitialColor(Color.parseColor("#ff348018"));
        dialog.setNegativeActionText("取消");
        dialog.setPositiveActionText("确定");
        dialog.setHexaDecimalTextColor(Color.WHITE);
        dialog.show();
    }
}
