package com.neppplus.a2ndjickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.a2ndjickbangcopy_20220104.models.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

//        받아온 SerializableExtra 를 RoomData로 다시 원복
        val roomData = intent.getSerializableExtra("room") as RoomData
    }
}