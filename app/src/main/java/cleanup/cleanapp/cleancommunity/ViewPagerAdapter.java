package cleanup.cleanapp.cleancommunity;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int totalTabs;

    public ViewPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Gps_Fragment gps_fragment = new Gps_Fragment();
        Settings_Fragment settings_fragment = new Settings_Fragment();
        if (position == 1) {
            return settings_fragment;
        }
        return gps_fragment;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }


}
