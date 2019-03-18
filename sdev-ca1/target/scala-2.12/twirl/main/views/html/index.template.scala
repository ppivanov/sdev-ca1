
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
"""),format.raw/*3.1*/("""<h1>Welcome to Project Management! </h1>
<h3>"""),format.raw/*4.5*/("""{"""),format.raw/*4.6*/("""Companny name here"""),format.raw/*4.24*/("""}"""),format.raw/*4.25*/("""</h3>
""")))}),format.raw/*5.2*/("""		  """))
      }
    }
  }

  def render(user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:09:44 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/index.scala.html
                  HASH: 1177edc9843ec59209f85d823cd15f35283bdf60
                  MATRIX: 963->1|1087->30|1115->33|1140->50|1178->51|1206->53|1278->99|1305->100|1350->118|1378->119|1415->127
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4|36->4|36->4|37->5
                  -- GENERATED --
              */
          