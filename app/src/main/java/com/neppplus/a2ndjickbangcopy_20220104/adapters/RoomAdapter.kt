package com.neppplus.a2ndjickbangcopy_20220104.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a2ndjickbangcopy_20220104.R
import com.neppplus.a2ndjickbangcopy_20220104.ViewRoomDetailActivity
import com.neppplus.a2ndjickbangcopy_20220104.models.RoomData
import org.w3c.dom.Text

class RoomAdapter(
    val mContext : Context,
    val mList : List<RoomData>
) : RecyclerView.Adapter<RoomAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row : View) : RecyclerView.ViewHolder(row) {


        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        fun bind(data: RoomData) {

            txtDescription.text = data.description
            txtAddressAndFloor.text = "${data.address}, ${data.getFormattedFloor()}"

            txtPrice.text = data.getFormattedPrice()


//             리싸이클러뷰의 한 줄이 눌리면 이벤트 처리
//            row  -> 안눌림
            row.setOnClickListener {

                val myIntent = Intent(mContext, ViewRoomDetailActivity::class.java)

//                방 정보를 들고 가야됨
                myIntent.putExtra("room", data)

//                startActivity가 안됨 ==> mContext의 도움을 받자
                mContext.startActivity(myIntent)

            }

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