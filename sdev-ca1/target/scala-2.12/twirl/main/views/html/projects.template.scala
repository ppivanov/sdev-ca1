
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Project],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project], user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""
"""),_display_(/*2.2*/main("Projects", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
  """),format.raw/*3.3*/("""<section class="content">
    
    <div class="col-sm-9">
      <table class="table table-bordered table-hover table-condensed">
        <thead>
          <tr>
            <th>Project #</th>
            <th>Project Name</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody>
          <!-- Product row(s) -->

          """),_display_(/*17.12*/for(p <- projects) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/(""" """),format.raw/*17.33*/("""<tr>
            <td>"""),_display_(/*18.18*/p/*18.19*/.getProjectName),format.raw/*18.34*/("""</td>
            <td>"""),_display_(/*19.18*/p/*19.19*/.getProjectDescription),format.raw/*19.41*/("""</td>
            <td>"""),_display_(/*20.18*/p/*20.19*/.getProjectStatus),format.raw/*20.36*/("""</td>
            <!-- Update button -->
            <td>
              <a href=""""),_display_(/*23.25*/routes/*23.31*/.ProjectController.updateProject(p.getProjectId)),format.raw/*23.79*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>
            <!-- Delete button -->
            <td>
              <a href=""""),_display_(/*29.25*/routes/*29.31*/.ProjectController.deleteProject(p.getProjectId)),format.raw/*29.79*/("""" class="button-xs btn-danger"
                onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
            </tr>
            """)))}),format.raw/*35.14*/("""

        """),format.raw/*37.9*/("""</tbody>
      </table>

      <p>
        <a href=""""),_display_(/*41.19*/routes/*41.25*/.ProjectController.addProject()),format.raw/*41.56*/("""">
          <button class="btn btn-primary">Add a new project</button>
        </a>
      </p>
  </section>

""")))}))
      }
    }
  }

  def render(projects:List[models.Project],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projects,user)

  def f:((List[models.Project],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projects,user) => apply(projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 02:33:45 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/projects.scala.html
                  HASH: dfd3db0c673fc860cbae7bd5bf48e4f5db2db268
                  MATRIX: 987->1|1143->62|1171->65|1201->87|1240->89|1270->93|1664->460|1698->478|1738->480|1767->481|1817->504|1827->505|1863->520|1914->544|1924->545|1967->567|2018->591|2028->592|2066->609|2178->694|2193->700|2262->748|2505->964|2520->970|2589->1018|2837->1235|2876->1247|2960->1304|2975->1310|3027->1341
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|55->23|61->29|61->29|61->29|67->35|69->37|73->41|73->41|73->41
                  -- GENERATED --
              */
          