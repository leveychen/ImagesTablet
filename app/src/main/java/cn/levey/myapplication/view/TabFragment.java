package cn.levey.myapplication.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.levey.myapplication.R;

/**
 * Created by Levey on 2018/2/7 13:45.
 * e-mail: m@levey.cn
 */

public class TabFragment extends Fragment {

    public static final String TAB = "tab_name";

    @BindView(R.id.rv)
    RecyclerView rv;
    Unbinder unbinder;

    private RvAdapter adapter;
    private int mPage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        EventBus.getDefault().register(this);
        View v = inflater.inflate(R.layout.fragment_tab, null);
        unbinder = ButterKnife.bind(this, v);
        mPage = getArguments().getInt(TAB);
        initView();
        return v;
    }

    private void initView(){
        final StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(11, StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        rv.setLayoutManager(layoutManager);
        adapter = new RvAdapter();
        rv.setAdapter(adapter);

    }


    @Subscribe
    public void loadData(RvEvent event){
        if(event != null
                && adapter != null
                && adapter.getDatas().isEmpty()
                && mPage == event.getPage()){
            OkGo.<String>get("http://gank.io/api/data/福利/121/" + mPage).execute(new StringCallback() {
                @Override
                public void onSuccess(Response<String> response) {
                    final RvPojo pojo = JSON.parseObject(response.body(),RvPojo.class);
                    if(pojo!=null && pojo.getResults() != null && !pojo.getResults().isEmpty()){

//                        for (int i = 0; i < pojo.getResults().size(); i++) {
//                            adapter.setData(pojo.getResults().get(i),i);
//                        }
                        adapter.setDatas(pojo.getResults());

                    }
                }
            });
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        EventBus.getDefault().unregister(this);
    }
}
