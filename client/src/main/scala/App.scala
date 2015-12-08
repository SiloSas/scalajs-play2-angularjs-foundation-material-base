import Room.{RoomMinDirective, RoomController}
import com.greencatsoft.angularjs.Angular
import example.RoomServiceFactory

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

@JSExport
object App extends JSApp {

  override def main() {
    val module = Angular.module("app", Seq("ngAnimate", "ngAria", "ngMaterial", "mm.foundation", "ngRoute", "ngMap"))

    module
    .factory[RoomServiceFactory]
    .controller[RoomController]
    .directive[RoomMinDirective]
  }
}