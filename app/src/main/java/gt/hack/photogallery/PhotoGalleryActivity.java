package gt.hack.photogallery;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PhotoGalleryActivity extends AppCompatActivity {

    private List<Drawable> images;
    private int SPAN_COUNT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_gallery);

        images = loadImages();

        RecyclerView rvImages = findViewById(R.id.rvImages);
        rvImages.setLayoutManager(new GridLayoutManager(this, SPAN_COUNT));

        ImageAdapter adapter = new ImageAdapter(images);
        rvImages.setAdapter(adapter);

        rvImages.addItemDecoration(new GridLayoutSpacingItemDecoration(40));
    }

    private List<Drawable> loadImages() {
        List<Drawable> images = new ArrayList<>();

        images.add(ContextCompat.getDrawable(this, R.drawable.sample_0));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_1));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_2));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_3));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_4));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_5));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_6));
        images.add(ContextCompat.getDrawable(this, R.drawable.sample_7));

        return images;
    }
}
