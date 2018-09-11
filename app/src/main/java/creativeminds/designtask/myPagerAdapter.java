package creativeminds.designtask;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Yara on 07-Sep-18.
 */

public class myPagerAdapter extends FragmentPagerAdapter {

    public myPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment=new f1();
                break;
            case 1:
                fragment=new f2();
                break;
            case 2:
                fragment=new f3();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String titlle="";
        switch (position){
            case 0:
                titlle="تم الالغاء";
                break;
            case 1:
                titlle="تم القبول";
                break;
            case 2:
                titlle="قيد الانتظار";
                break;
        }
        return titlle;
    }
}
