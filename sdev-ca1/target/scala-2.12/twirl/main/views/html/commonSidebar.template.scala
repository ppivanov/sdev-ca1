
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/defining(play.core.PlayVersion.current)/*1.41*/ { version =>_display_(Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*3.1*/("""<h3>Table of Contents</h3>
<ul>
  <li><a href=""""),_display_(/*5.17*/routes/*5.23*/.HomeController.index),format.raw/*5.44*/("""">Home</a>
  <li><a href=""""),_display_(/*6.17*/routes/*6.23*/.HomeController.projects),format.raw/*6.47*/("""">Projects</a>
</ul>

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
                  SOURCE: /home/wdd/Documents/sdev/sdev-ca1/sdev-ca1/app/views/commonSidebar.scala.html
                  HASH: 35b0604c97079af073a36f5dc17c7e289a98215e
                  MATRIX: 819->1|866->40|916->53|946->57|1022->107|1036->113|1077->134|1131->162|1145->168|1189->192
                  LINES: 26->1|26->1|26->1|28->3|30->5|30->5|30->5|31->6|31->6|31->6
                  -- GENERATED --
              */
          