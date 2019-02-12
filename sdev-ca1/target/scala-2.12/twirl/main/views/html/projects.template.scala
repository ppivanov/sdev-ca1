
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Title - projects")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<section class="content">
    <table>
        <thead>
          <th>Project #</th>
          <th>Project Name</th>
          <th>Description</th>
          <th>Employees working on project</th>
        </thead>
        
      </table>
    <aside>
      """),_display_(/*13.8*/commonSidebar()),format.raw/*13.23*/("""
    """),format.raw/*14.5*/("""</aside>
</section>

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
                  DATE: Tue Feb 12 15:52:45 GMT 2019
                  SOURCE: /home/wdd/Documents/sdev/sdev-ca1/sdev-ca1/app/views/projects.scala.html
                  HASH: 7fc2c3a67d3afd67af0ae16ba4312aad6ecf2711
                  MATRIX: 814->1|846->25|885->27|913->29|1204->294|1240->309|1273->315
                  LINES: 26->1|26->1|26->1|27->2|38->13|38->13|39->14
                  -- GENERATED --
              */
          