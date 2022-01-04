package com.neppplus.a2ndjickbangcopy_20220104.models

class RoomData(
   val price : Int,
   val address : String,
   val floor : Int,
   val description : String
) {

//   층 수를 가공해주는 함수
   fun getFormattedFloor() : String {

      if (this.floor > 0) {
         return "${this.floor}층"
      }
      else if (this.floor < 0) {
         return  "지하 ${-this.floor}층"
      }
      else {
         return "반지하"
      }

   }
}