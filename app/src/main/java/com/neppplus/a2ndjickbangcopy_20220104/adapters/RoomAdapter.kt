package com.neppplus.a2ndjickbangcopy_20220104.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a2ndjickbangcopy_20220104.models.RoomData

class RoomAdapter(
    val mContext : Context,
    val mList : List<RoomData>
) : RecyclerView.Adapter<RoomAdapter.MyViewHolder>() {

    inner class MyViewHolder(row : View) : RecyclerView.ViewHolder(row) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}