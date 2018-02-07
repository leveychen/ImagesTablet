package cn.levey.myapplication.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.levey.myapplication.R;
import cn.levey.myapplication.utils.FrescoBase;

/**
 * Created by Levey on 2018/2/7 13:53.
 * e-mail: m@levey.cn
 */

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<RvPojo.ResultsBean> list = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final ViewHolder vh = (ViewHolder) holder;
        vh.name.setText(list.get(position).getWho() + " id=" + (position+1));
        vh.price.setText(list.get(position).getDesc());
        vh.image.setController(FrescoBase.getController(list.get(position).getUrl(),180,100));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public List<RvPojo.ResultsBean> getDatas() {
        return list;
    }

    public void setData(RvPojo.ResultsBean data,int position){
        list.add(data);
        notifyItemChanged(position);
        //notifyDataSetChanged();
    }
    public void setDatas(List<RvPojo.ResultsBean> data){
        list.clear();
        list.addAll(data);
        notifyDataSetChanged();
//        for (int i = 0; i < data.size(); i++) {
//            setData(data.get(i),i);
//        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.image)
        SimpleDraweeView image;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            image.setHierarchy(FrescoBase.getHierarchy(itemView.getContext()));
        }
    }
}
