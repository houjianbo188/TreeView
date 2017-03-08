package com.houjianbo.treeview.view;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


import com.houjianbo.library.Node;
import com.houjianbo.library.TreeListViewAdapter;
import com.houjianbo.treeview.FileNode;
import com.houjianbo.treeview.R;
import com.houjianbo.treeview.adapter.SimpleTreeAdapter;
import com.houjianbo.treeview.base.BaseActivity;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangke on 2017-1-15.
 */
public class ListViewActivity extends BaseActivity {
    int num = 0;
    private TreeListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        RecyclerView mRecyTree = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyTree.setVisibility(View.GONE);


        ListView mTree = (ListView) findViewById(R.id.lv_tree);
        //第一个参数  ListView
        //第二个参数  上下文
        //第三个参数  数据集
        //第四个参数  默认展开层级数 0为不展开
        //第五个参数  展开的图标
        //第六个参数  闭合的图标
        mAdapter = new SimpleTreeAdapter(mTree, ListViewActivity.this,
                mDatas, 1, R.mipmap.tree_ex, R.mipmap.tree_ec);
        mTree.setAdapter(mAdapter);
    }

    /**
     * 添加数据
     *
     * @param v
     */
    public void click(View v) {

        List<Node> mlist = new ArrayList<>();
        if (num == 0)
            mlist.add(new Node("22", "0", "测试部", new FileNode()));

        //添加一个根节点
        mlist.add(new Node("223", "0", "售后", new FileNode()));

        //加在新节点上
        mlist.add(new Node("333" + num, "22", "测试1" + num));
        mlist.add(new Node("44444" + num, "22", "测试2" + num));
        //加到现有数据的父节点上

        num++;

        mAdapter.addData(0, mlist);
    }

    /**
     * 显示选中数据
     */
    public void clickShow(View v) {
        StringBuilder sb = new StringBuilder();
        //获取排序过的nodes
        //如果不需要刻意直接用 mDatas既可
        final List<Node> allNodes = mAdapter.getAllNodes();
        for (int i = 0; i < allNodes.size(); i++) {
            if (allNodes.get(i).isChecked()) {
                sb.append(allNodes.get(i).getName() + ",");
            }
        }
        String strNodesName = sb.toString();
        if (!TextUtils.isEmpty(strNodesName))
            Toast.makeText(this, strNodesName.substring(0, strNodesName.length() - 1), Toast.LENGTH_SHORT).show();
    }

}
