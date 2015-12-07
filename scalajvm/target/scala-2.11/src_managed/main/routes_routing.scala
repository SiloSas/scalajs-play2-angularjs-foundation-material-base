// @SOURCE:/home/loann/Desktop/desToitsEnVille/scalajvm/conf/routes
// @HASH:726ac1a046da98e14a87e5aedea65c836fccb734
// @DATE:Thu Dec 03 02:20:47 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:1
private[this] lazy val controllers_TodoController_home0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_TodoController_home0_invoker = createInvoker(
controllers.TodoController.home,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "home", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:2
private[this] lazy val controllers_RoomsController_findAll1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rooms"))))
private[this] lazy val controllers_RoomsController_findAll1_invoker = createInvoker(
controllers.RoomsController.findAll,
HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findAll", Nil,"GET", """""", Routes.prefix + """rooms"""))
        

// @LINE:3
private[this] lazy val controllers_AgreementsController_findAll2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("agreements"))))
private[this] lazy val controllers_AgreementsController_findAll2_invoker = createInvoker(
controllers.AgreementsController.findAll,
HandlerDef(this.getClass.getClassLoader, "", "controllers.AgreementsController", "findAll", Nil,"GET", """""", Routes.prefix + """agreements"""))
        

// @LINE:4
private[this] lazy val controllers_RoomsController_findById3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("room"))))
private[this] lazy val controllers_RoomsController_findById3_invoker = createInvoker(
controllers.RoomsController.findById(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findById", Seq(classOf[String]),"GET", """""", Routes.prefix + """room"""))
        

// @LINE:5
private[this] lazy val controllers_RoomsController_findAvailable4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("availableRooms"))))
private[this] lazy val controllers_RoomsController_findAvailable4_invoker = createInvoker(
controllers.RoomsController.findAvailable(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.RoomsController", "findAvailable", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """availableRooms"""))
        

// @LINE:6
private[this] lazy val controllers_TodoController_list5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos"))))
private[this] lazy val controllers_TodoController_list5_invoker = createInvoker(
controllers.TodoController.list,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "list", Nil,"GET", """""", Routes.prefix + """api/todos"""))
        

// @LINE:7
private[this] lazy val controllers_TodoController_create6_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos"))))
private[this] lazy val controllers_TodoController_create6_invoker = createInvoker(
controllers.TodoController.create,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "create", Nil,"PUT", """""", Routes.prefix + """api/todos"""))
        

// @LINE:8
private[this] lazy val controllers_TodoController_markAll7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos/markAll"))))
private[this] lazy val controllers_TodoController_markAll7_invoker = createInvoker(
controllers.TodoController.markAll(fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "markAll", Seq(classOf[Boolean]),"POST", """""", Routes.prefix + """api/todos/markAll"""))
        

// @LINE:9
private[this] lazy val controllers_TodoController_clearAll8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos/clearAll"))))
private[this] lazy val controllers_TodoController_clearAll8_invoker = createInvoker(
controllers.TodoController.clearAll,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "clearAll", Nil,"POST", """""", Routes.prefix + """api/todos/clearAll"""))
        

// @LINE:11
private[this] lazy val controllers_TodoController_update9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_TodoController_update9_invoker = createInvoker(
controllers.TodoController.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """api/todos/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_TodoController_delete10_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/todos/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_TodoController_delete10_invoker = createInvoker(
controllers.TodoController.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TodoController", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """api/todos/$id<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_versioned11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:16
private[this] lazy val controllers_SourceMapProvider_client12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scalajs/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_SourceMapProvider_client12_invoker = createInvoker(
controllers.SourceMapProvider.client(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SourceMapProvider", "client", Seq(classOf[String]),"GET", """""", Routes.prefix + """scalajs/$file<.+>"""))
        

// @LINE:17
private[this] lazy val controllers_SourceMapProvider_common13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scala/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_SourceMapProvider_common13_invoker = createInvoker(
controllers.SourceMapProvider.common(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SourceMapProvider", "common", Seq(classOf[String]),"GET", """""", Routes.prefix + """scala/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.TodoController.home"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rooms""","""controllers.RoomsController.findAll"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """agreements""","""controllers.AgreementsController.findAll"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """room""","""controllers.RoomsController.findById(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """availableRooms""","""controllers.RoomsController.findAvailable(start:String, end:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos""","""controllers.TodoController.list"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos""","""controllers.TodoController.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos/markAll""","""controllers.TodoController.markAll(completed:Boolean)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos/clearAll""","""controllers.TodoController.clearAll"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos/$id<[^/]+>""","""controllers.TodoController.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/todos/$id<[^/]+>""","""controllers.TodoController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:Asset)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scalajs/$file<.+>""","""controllers.SourceMapProvider.client(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scala/$file<.+>""","""controllers.SourceMapProvider.common(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:1
case controllers_TodoController_home0_route(params) => {
   call { 
        controllers_TodoController_home0_invoker.call(controllers.TodoController.home)
   }
}
        

// @LINE:2
case controllers_RoomsController_findAll1_route(params) => {
   call { 
        controllers_RoomsController_findAll1_invoker.call(controllers.RoomsController.findAll)
   }
}
        

// @LINE:3
case controllers_AgreementsController_findAll2_route(params) => {
   call { 
        controllers_AgreementsController_findAll2_invoker.call(controllers.AgreementsController.findAll)
   }
}
        

// @LINE:4
case controllers_RoomsController_findById3_route(params) => {
   call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_RoomsController_findById3_invoker.call(controllers.RoomsController.findById(id))
   }
}
        

// @LINE:5
case controllers_RoomsController_findAvailable4_route(params) => {
   call(params.fromQuery[String]("start", None), params.fromQuery[String]("end", None)) { (start, end) =>
        controllers_RoomsController_findAvailable4_invoker.call(controllers.RoomsController.findAvailable(start, end))
   }
}
        

// @LINE:6
case controllers_TodoController_list5_route(params) => {
   call { 
        controllers_TodoController_list5_invoker.call(controllers.TodoController.list)
   }
}
        

// @LINE:7
case controllers_TodoController_create6_route(params) => {
   call { 
        controllers_TodoController_create6_invoker.call(controllers.TodoController.create)
   }
}
        

// @LINE:8
case controllers_TodoController_markAll7_route(params) => {
   call(params.fromQuery[Boolean]("completed", None)) { (completed) =>
        controllers_TodoController_markAll7_invoker.call(controllers.TodoController.markAll(completed))
   }
}
        

// @LINE:9
case controllers_TodoController_clearAll8_route(params) => {
   call { 
        controllers_TodoController_clearAll8_invoker.call(controllers.TodoController.clearAll)
   }
}
        

// @LINE:11
case controllers_TodoController_update9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TodoController_update9_invoker.call(controllers.TodoController.update(id))
   }
}
        

// @LINE:12
case controllers_TodoController_delete10_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TodoController_delete10_invoker.call(controllers.TodoController.delete(id))
   }
}
        

// @LINE:14
case controllers_Assets_versioned11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        

// @LINE:16
case controllers_SourceMapProvider_client12_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_SourceMapProvider_client12_invoker.call(controllers.SourceMapProvider.client(file))
   }
}
        

// @LINE:17
case controllers_SourceMapProvider_common13_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_SourceMapProvider_common13_invoker.call(controllers.SourceMapProvider.common(file))
   }
}
        
}

}
     