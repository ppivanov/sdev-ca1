
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
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""

"""),format.raw/*4.1*/("""<section class="content">
    
    <aside>
      """),_display_(/*7.8*/commonSidebar()),format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""</aside>
</section>
""")))}),format.raw/*10.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 12 15:13:11 GMT 2019
                  SOURCE: /home/wdd/Documents/sdev/sdev-ca1/sdev-ca1/app/views/index.scala.html
                  HASH: ccae0465bb7389b9ebe55e82696386eff332937f
                  MATRIX: 811->1|834->16|873->18|901->21|948->60|998->73|1028->77|1106->130|1141->145|1173->151|1226->174
                  LINES: 26->1|26->1|26->1|27->2|27->2|27->2|29->4|32->7|32->7|33->8|35->10
                  -- GENERATED --
              */
          