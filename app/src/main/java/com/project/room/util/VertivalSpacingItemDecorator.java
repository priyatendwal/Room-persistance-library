package com.project.room.util;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class VertivalSpacingItemDecorator extends RecyclerView.ItemDecoration{

    private final int verticalSpaceHeight;

    public VertivalSpacingItemDecorator(int verticalSpaceHeight) {
        this.verticalSpaceHeight = verticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {

        outRect.bottom = verticalSpaceHeight;
    }
}