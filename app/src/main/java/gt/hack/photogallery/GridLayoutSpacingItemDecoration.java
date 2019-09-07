package gt.hack.photogallery;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

public class GridLayoutSpacingItemDecoration extends RecyclerView.ItemDecoration {

    private final int spacing;

    GridLayoutSpacingItemDecoration(int spacing) {
        this.spacing = spacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        outRect.bottom = spacing;
        outRect.top = spacing;
        outRect.left = spacing;
        outRect.right = spacing;
    }
}