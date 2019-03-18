
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
              <a href=""""),_display_(/*24.25*/routes/*24.31*/.ProjectController.updateProject(p.getProjectId)),format.raw/*24.79*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>
            <!-- Delete button -->
            <td>
              <a href=""""),_display_(/*30.25*/routes/*30.31*/.ProjectController.deleteProject(p.getProjectId)),format.raw/*30.79*/("""" class="button-xs btn-danger"
                onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
            </tr>
          """)))}),format.raw/*36.12*/("""

        """),format.raw/*38.9*/("""</tbody>
      </table>

      <p>
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.ProjectController.addProject()),format.raw/*42.56*/("""">
          <button class="btn btn-primary">Add a new project</button>
        </a>
      </p>

      """),_display_(/*47.8*/if(user != null)/*47.24*/ {_display_(Seq[Any](format.raw/*47.26*/("""
        """),format.raw/*48.9*/("""<p>
            <a href=""""),_display_(/*49.23*/routes/*49.29*/.ProjectController.showMyProjects()),format.raw/*49.64*/("""">
              <button class="btn btn-primary">Show my projects</button>
            </a>
        </p>
      """)))}),format.raw/*53.8*/("""
      
  """),format.raw/*55.3*/("""</section>

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
                  DATE: Mon Mar 18 20:58:29 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/projects.scala.html
                  HASH: f67f0a10b8a51e2238f33b44d431e3fe66da997d
                  MATRIX: 987->1|1143->62|1171->65|1201->87|1240->89|1270->93|1664->460|1698->478|1738->480|1767->481|1817->504|1827->505|1863->520|1914->544|1924->545|1967->567|2018->591|2028->592|2066->609|2192->708|2207->714|2276->762|2519->978|2534->984|2603->1032|2849->1247|2888->1259|2972->1316|2987->1322|3039->1353|3174->1462|3199->1478|3239->1480|3276->1490|3330->1517|3345->1523|3401->1558|3547->1674|3586->1686
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|56->24|56->24|56->24|62->30|62->30|62->30|68->36|70->38|74->42|74->42|74->42|79->47|79->47|79->47|80->48|81->49|81->49|81->49|85->53|87->55
                  -- GENERATED --
              */
          