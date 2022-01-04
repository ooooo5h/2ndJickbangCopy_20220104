package com.neppplus.a2ndjickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.a2ndjickbangcopy_20220104.models.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000, "서울시 동대문구", 0, "1번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 광진구", 3, "2번째 방입니다."))
        mRoomList.add(RoomData(45000, "서울시 서대문구", -1, "3번째 방입니다."))
        mRoomList.add(RoomData(22000, "서울시 중랑구", 8, "4번째 방입니다."))
        mRoomList.add(RoomData(18000, "서울시 서초구", -4, "5번째 방입니다."))
        mRoomList.add(RoomData(70000, "서울시 강남구", -2, "6번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 강동구", 4, "7번째 방입니다."))
        mRoomList.add(RoomData(985600, "서울시 성북구", 0, "8번째 방입니다."))
        mRoomList.add(RoomData(125000, "서울시 노원구", 18, "9번째 방입니다."))


    }
}