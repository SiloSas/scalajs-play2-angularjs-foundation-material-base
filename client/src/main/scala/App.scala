import com.greencatsoft.angularjs.Angular
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport


@JSExport
object App extends JSApp {

  override def main() {
    val module = Angular.module("app")
  }
}