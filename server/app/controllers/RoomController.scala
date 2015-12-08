package controllers

import play.api.mvc._
import play.api.mvc.Action
import shared.Room
import upickle.default._

object RoomController extends Controller {

  val room1 =  Room(id = "dsdsd", name = "kdskdjsk", presentation = "ksdjjdksj", header = "ghghsdfh",
    images = "jsqkksjq", isAnApartment = false, price = "5€")

  val room2 =  Room(id = "dsdsd1", name = "kdskdjsk1", presentation = "ksdjjdksj1", header = "ghghsdfh1",
    images = "jsqkksjq1", isAnApartment = false, price = "5€")

  val rooms = Seq(room1, room2)

  def findAll() = Action {
    Ok(write(rooms))
  }
}