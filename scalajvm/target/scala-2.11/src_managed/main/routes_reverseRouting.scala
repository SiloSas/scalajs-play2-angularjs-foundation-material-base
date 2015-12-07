// @SOURCE:/home/loann/Desktop/desToitsEnVille/scalajvm/conf/routes
// @HASH:726ac1a046da98e14a87e5aedea65c836fccb734
// @DATE:Thu Dec 03 02:20:47 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers {

// @LINE:14
class ReverseAssets {


// @LINE:14
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        

}
                          

// @LINE:3
class ReverseAgreementsController {


// @LINE:3
def findAll(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "agreements")
}
                        

}
                          

// @LINE:5
// @LINE:4
// @LINE:2
class ReverseRoomsController {


// @LINE:2
def findAll(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rooms")
}
                        

// @LINE:4
def findById(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "room" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                        

// @LINE:5
def findAvailable(start:String, end:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "availableRooms" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("start", start)), Some(implicitly[QueryStringBindable[String]].unbind("end", end)))))
}
                        

}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:1
class ReverseTodoController {


// @LINE:12
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "api/todos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:8
def markAll(completed:Boolean): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "api/todos/markAll" + queryString(List(Some(implicitly[QueryStringBindable[Boolean]].unbind("completed", completed)))))
}
                        

// @LINE:7
def create(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "api/todos")
}
                        

// @LINE:9
def clearAll(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "api/todos/clearAll")
}
                        

// @LINE:11
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "api/todos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:6
def list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "api/todos")
}
                        

// @LINE:1
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:17
// @LINE:16
class ReverseSourceMapProvider {


// @LINE:17
def common(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scala/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

// @LINE:16
def client(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scalajs/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
class ReverseAssets {


// @LINE:14
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:3
class ReverseAgreementsController {


// @LINE:3
def findAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AgreementsController.findAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agreements"})
      }
   """
)
                        

}
              

// @LINE:5
// @LINE:4
// @LINE:2
class ReverseRoomsController {


// @LINE:2
def findAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RoomsController.findAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rooms"})
      }
   """
)
                        

// @LINE:4
def findById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RoomsController.findById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "room" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:5
def findAvailable : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.RoomsController.findAvailable",
   """
      function(start,end) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "availableRooms" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("start", start), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("end", end)])})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:1
class ReverseTodoController {


// @LINE:12
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:8
def markAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.markAll",
   """
      function(completed) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/markAll" + _qS([(""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("completed", completed)])})
      }
   """
)
                        

// @LINE:7
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.create",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos"})
      }
   """
)
                        

// @LINE:9
def clearAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.clearAll",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/clearAll"})
      }
   """
)
                        

// @LINE:11
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:6
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/todos"})
      }
   """
)
                        

// @LINE:1
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TodoController.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
class ReverseSourceMapProvider {


// @LINE:17
def common : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SourceMapProvider.common",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

// @LINE:16
def client : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SourceMapProvider.client",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scalajs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        


// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.ref {


// @LINE:14
class ReverseAssets {


// @LINE:14
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:3
class ReverseAgreementsController {


// @LINE:3
def findAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AgreementsController.findAll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.AgreementsController", "findAll", Seq(), "GET", """""", _prefix + """agreements""")
)
                      

}
                          

// @LINE:5
// @LINE:4
// @LINE:2
class ReverseRoomsController {


// @LINE:2
def findAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RoomsController.findAll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findAll", Seq(), "GET", """""", _prefix + """rooms""")
)
                      

// @LINE:4
def findById(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RoomsController.findById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findById", Seq(classOf[String]), "GET", """""", _prefix + """room""")
)
                      

// @LINE:5
def findAvailable(start:String, end:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.RoomsController.findAvailable(start, end), HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findAvailable", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """availableRooms""")
)
                      

}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:1
class ReverseTodoController {


// @LINE:12
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """api/todos/$id<[^/]+>""")
)
                      

// @LINE:8
def markAll(completed:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.markAll(completed), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "markAll", Seq(classOf[Boolean]), "POST", """""", _prefix + """api/todos/markAll""")
)
                      

// @LINE:7
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "create", Seq(), "PUT", """""", _prefix + """api/todos""")
)
                      

// @LINE:9
def clearAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.clearAll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "clearAll", Seq(), "POST", """""", _prefix + """api/todos/clearAll""")
)
                      

// @LINE:11
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """api/todos/$id<[^/]+>""")
)
                      

// @LINE:6
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "list", Seq(), "GET", """""", _prefix + """api/todos""")
)
                      

// @LINE:1
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TodoController.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "home", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          

// @LINE:17
// @LINE:16
class ReverseSourceMapProvider {


// @LINE:17
def common(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SourceMapProvider.common(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.SourceMapProvider", "common", Seq(classOf[String]), "GET", """""", _prefix + """scala/$file<.+>""")
)
                      

// @LINE:16
def client(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SourceMapProvider.client(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.SourceMapProvider", "client", Seq(classOf[String]), "GET", """""", _prefix + """scalajs/$file<.+>""")
)
                      

}
                          
}
        
    