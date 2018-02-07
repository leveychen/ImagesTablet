package cn.levey.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.levey.myapplication.view.NoViewPaper;
import cn.levey.myapplication.view.RvEvent;
import cn.levey.myapplication.view.TabFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tab)
    SmartTabLayout tab;
    @BindView(R.id.viewpaper)
    NoViewPaper viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTab();
    }

    private void initTab() {
        final FragmentPagerItems pages = new FragmentPagerItems(getApplicationContext());
        pages.add(getTab(1));
        pages.add(getTab(2));
        pages.add(getTab(3));
        pages.add(getTab(4));
        pages.add(getTab(5));
        initTabView(pages);
    }

    private FragmentPagerItem getTab(int page){
        return FragmentPagerItem.of("福利" +page, TabFragment.class, getBundle(page));
    }

    private Bundle getBundle(int page){
        Bundle bundle = new Bundle();
        bundle.putInt(TabFragment.TAB,page);
        return bundle;
    }

    public void initTabView(final FragmentPagerItems pages) {
        final FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), pages);
        viewPager.setAdapter(adapter);
        tab.setViewPager(viewPager);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                sendData(position + 1);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setOffscreenPageLimit(pages.size());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sendData(1);
            }
        }).start();
    }

    private void sendData(int page){
        RvEvent event = new RvEvent();
        event.setPage(page);
        EventBus.getDefault().post(event);
    }
}
