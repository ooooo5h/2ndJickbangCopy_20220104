package com.neppplus.a2ndjickbangcopy_20220104.models

import java.io.Serializable
import java.text.NumberFormat

class RoomData(
   val price : Int,
   val address : String,
   val floor : Int,
   val description : String
) : Serializable {

//   가격을 가공해주는 함수
   fun getFormattedPrice() : String {

      if (this.price < 10000 ) {
         return "${NumberFormat.getInstance().format(this.price)}만원"
      }
      else {

         val uk = this.price / 10000
         val rest = this.price % 10000

         return "${uk}억 ${NumberFormat.getInstance().format(rest)}만원"


      }


   }




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