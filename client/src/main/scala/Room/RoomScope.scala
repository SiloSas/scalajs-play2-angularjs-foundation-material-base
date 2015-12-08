
import com.greencatsoft.angularjs.core.Scope

import scala.scalajs.js
import shared.Room

trait RoomScope extends Scope {

  var rooms: js.Array[shared.Room] = js.native

  var room: shared.Room = js.native

}