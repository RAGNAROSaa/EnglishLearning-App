package com.iReadingGroup.iReading.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.iReadingGroup.iReading.Fragment.SettingsFragment;
import com.iReadingGroup.iReading.Fragment.WordSearchFragment;
import com.iReadingGroup.iReading.Fragment.ArticleListFragment;
import com.iReadingGroup.iReading.Fragment.CollectionFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * MainActivityPagesAdapter
 * A bridge between fragment and each page
 */
public class MainActivityPagesAdapter extends FragmentPagerAdapter {

    /**
     * The Fragments.
     */
    private List<Fragment> fragments = new ArrayList<>();


    /**
     * Instantiates a new Main adapter.
     *
     * @param fm the fm
     */
    public MainActivityPagesAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new ArticleListFragment());
        fragments.add(new WordSearchFragment());
        fragments.add(new CollectionFragment());
        fragments.add(new SettingsFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
