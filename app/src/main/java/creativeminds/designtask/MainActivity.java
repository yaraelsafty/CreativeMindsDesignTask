package creativeminds.designtask;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MainActivity extends AppCompatActivity {
    ViewPager vpager;

    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpager= (ViewPager) findViewById(R.id.pager);
        tabLayout= (TabLayout) findViewById(R.id.tabs);
        myPagerAdapter adapter=new myPagerAdapter(getSupportFragmentManager());
        vpager.setAdapter(adapter);
    }
}
