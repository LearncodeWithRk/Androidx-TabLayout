package in.learncodewithrk.tablayout;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Home Home = new Home();
                return Home;
            case 1:
                Course Course = new Course();
                return Course;
            case 2:
                Service Service = new Service();
                return Service;
            case 3:
                Contact Contact = new Contact();
                return Contact;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}