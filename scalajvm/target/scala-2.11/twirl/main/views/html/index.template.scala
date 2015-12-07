
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="todomvc" data-framework="angularjs">
<head>
  <meta charset="utf-8">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
  <title>Des toits en ville</title>

  <link rel="stylesheet" media="screen" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.versioned("stylesheets/tools.css")),format.raw/*10.96*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.versioned("stylesheets/font-awesome.css")),format.raw/*11.103*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*12.48*/routes/*12.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.95*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.versioned("stylesheets/angular-material.css")),format.raw/*13.107*/("""">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*14.48*/routes/*14.54*/.Assets.versioned("stylesheets/animate.min.css")),format.raw/*14.102*/("""">

  <script src="http://maps.google.com/maps/api/js"></script>

  <script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*18.64*/(""""></script>
  <script src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.versioned("plugins/angular.min.js")),format.raw/*19.66*/(""""></script>
  <script src=""""),_display_(/*20.17*/routes/*20.23*/.Assets.versioned("plugins/angular-animate.min.js")),format.raw/*20.74*/(""""></script>
  <script src=""""),_display_(/*21.17*/routes/*21.23*/.Assets.versioned("plugins/angular-aria.min.js")),format.raw/*21.71*/(""""></script>
  <script src=""""),_display_(/*22.17*/routes/*22.23*/.Assets.versioned("plugins/angular-material.js")),format.raw/*22.71*/(""""></script>
  <script src=""""),_display_(/*23.17*/routes/*23.23*/.Assets.versioned("plugins/mm-foundation.js")),format.raw/*23.68*/(""""></script>
  <script src=""""),_display_(/*24.17*/routes/*24.23*/.Assets.versioned("plugins/angular-route.min.js")),format.raw/*24.72*/(""""></script>
  <script src=""""),_display_(/*25.17*/routes/*25.23*/.Assets.versioned("plugins/ng-map.min.js")),format.raw/*25.65*/(""""></script>
  <script src=""""),_display_(/*26.17*/routes/*26.23*/.Assets.versioned("javascripts/todomvc-client-fastopt.js")),format.raw/*26.81*/(""""></script>
  <script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.versioned("javascripts/todomvc-client-launcher.js")),format.raw/*27.82*/(""""></script>
  <style>[ng-cloak] """),format.raw/*28.21*/("""{"""),format.raw/*28.22*/(""" """),format.raw/*28.23*/("""display: none; """),format.raw/*28.38*/("""}"""),format.raw/*28.39*/("""</style>
</head>
<body>


  <md-toolbar class="absolute transparent zIndex4">
    <div>
      <div class = "float-right margin20 paddingRight20" hide-sm>
        <a href="#/" class = "padding10">Accueil</a>
        <ng-contact class = "padding10 textPrimColor pointer">Contact</ng-contact>
        <a href="/mentionsLegales" class = "padding10">Mentions légales</a>
      </div>

      <rooms-nav ng-controller = "roomPagesController" class="zIndex4 float-left"></rooms-nav>
    </div>
  </md-toolbar>

  <data-search-bar class="zIndex5"></data-search-bar>

  <md-sidenav  class="md-sidenav-left md-whiteframe-z2" md-component-id="left" hide-gt-md>
    <md-toolbar class="md-theme-indigo">
      <h1 class="md-toolbar-tools">Sidenav Left</h1>
    </md-toolbar>
    <md-content layout-padding ng-controller = "roomPagesController">
      <md-button ng-click="directive.close()" class="md-primary slide-left" hide-gt-md>
        Close Sidenav Left
      </md-button>
      <a href="#/rooms/"""),format.raw/*55.24*/("""{"""),format.raw/*55.25*/("""{"""),format.raw/*55.26*/("""room.id"""),format.raw/*55.33*/("""}"""),format.raw/*55.34*/("""}"""),format.raw/*55.35*/("""" class="column primCol md-button float-left small-10"
      ng-click="directive.close()" data-ng-repeat="room in rooms">"""),format.raw/*56.67*/("""{"""),format.raw/*56.68*/("""{"""),format.raw/*56.69*/("""room.name"""),format.raw/*56.78*/("""}"""),format.raw/*56.79*/("""}"""),format.raw/*56.80*/("""</a>
      <a href="#/" class = "column primCol md-button float-left small-10">Accueil</a>
      <ng-contact class = "padding10 textPrimColor pointer">Contact</ng-contact>
      <a href="/mentionsLegales" class = "column primCol md-button float-left small-10">Mentions légales</a>
    </md-content>
  </md-sidenav>

  <md-content flex class="height100p mainContainer " ng-view=""></md-content>

</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Dec 03 03:27:04 CET 2015
                  SOURCE: /home/loann/Desktop/desToitsEnVille/scalajvm/app/views/index.scala.html
                  HASH: 1f767a9063596f32d1810cdf3db498feeb1f9f5b
                  MATRIX: 498->1|587->3|614->4|962->325|977->331|1040->373|1117->423|1132->429|1203->478|1280->528|1295->534|1357->575|1434->625|1449->631|1524->684|1601->734|1616->740|1686->788|1795->870|1810->876|1872->917|1927->945|1942->951|2006->994|2061->1022|2076->1028|2148->1079|2203->1107|2218->1113|2287->1161|2342->1189|2357->1195|2426->1243|2481->1271|2496->1277|2562->1322|2617->1350|2632->1356|2702->1405|2757->1433|2772->1439|2835->1481|2890->1509|2905->1515|2984->1573|3039->1601|3054->1607|3134->1666|3194->1698|3223->1699|3252->1700|3295->1715|3324->1716|4340->2704|4369->2705|4398->2706|4433->2713|4462->2714|4491->2715|4640->2836|4669->2837|4698->2838|4735->2847|4764->2848|4793->2849
                  LINES: 19->1|22->1|23->2|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|49->28|49->28|76->55|76->55|76->55|76->55|76->55|76->55|77->56|77->56|77->56|77->56|77->56|77->56
                  -- GENERATED --
              */
          