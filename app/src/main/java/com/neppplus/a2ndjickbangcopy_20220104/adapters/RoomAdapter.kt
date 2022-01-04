package com.neppplus.a2ndjickbangcopy_20220104.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a2ndjickbangcopy_20220104.R
import com.neppplus.a2ndjickbangcopy_20220104.models.RoomData
import org.w3c.dom.Text

class RoomAdapter(
    val mContext : Context,
    val mList : List<RoomData>
) : RecyclerView.Adapter<RoomAdapter.MyViewHolder>() {

    inner class MyViewHolder(row : View) : RecyclerView.ViewHolder(row) {


        val txtPrice = row.findViewById<Text>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<Text>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<Text>(R.id.txtDescription)

        fun bind(data: RoomData) {

            txtDescription.text = data.description
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val row = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind( mList[position])

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}