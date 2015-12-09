package Room

import javax.inject.Inject

import play.api.db.slick.DatabaseConfigProvider
import play.api.mvc.{Action, _}
import shared.Room
import upickle.default._

import scala.concurrent.ExecutionContext.Implicits.global

class RoomController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider, val roomMethods: RoomMethods)
    extends Controller {

  val room1 =  Room(id = "dsdsd", name = "kdskdjsk", presentation = "ksdjjdksj", header = "ghghsdfh",
    images = "assets/images/desToits1.jpg", isAnApartment = false, price = "5€")

  val room2 =  Room(id = "dsdsd1", name = "kdskdjsk1", presentation = "ksdjjdksj1", header = "ghghsdfh1",
    images = "assets/images/doubleBed.jpg", isAnApartment = false, price = "5€")

//  val rooms = Seq(room1, room2)

  def findAll() = Action.async {
    roomMethods.findAll.map { rooms =>
      println(" rooms = " + rooms)
      Ok(write(rooms))
    }
  }
}