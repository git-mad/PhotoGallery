package gt.hack.photogallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileActivity extends AppCompatActivity {

    private ImageView profile_image;
    private TextView name;
    private TextView numPhotos;
    private BottomNavigationView navBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_image = findViewById(R.id.profile_photo);
        name = findViewById(R.id.name);
        numPhotos = findViewById(R.id.description);
        profile_image.setImageResource(R.drawable.sample_1);

        navBar = findViewById(R.id.navigation);

        navBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                System.out.println(item.toString());
                if (item.toString().equals("Camera")) {
                    Toast.makeText(ProfileActivity.this, "The camera function is not implemented!",
                            Toast.LENGTH_SHORT).show();
                } else if (item.toString().equals("Home")) {
                    Intent newIntent = new Intent(ProfileActivity.this, PhotoGalleryActivity.class);
                    startActivity(newIntent);
                }
                // handle desired action here
                // One possibility of action is to replace the contents above the nav bar
                // return true if you want the item to be displayed as the selected item
                return true;
            }
        });


    }

}
