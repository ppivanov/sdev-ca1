
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
            <th>Project Name</th>
            <th>Description</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
          <!-- Product row(s) -->

          """),_display_(/*17.12*/for(p <- projects) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/(""" """),format.raw/*17.33*/("""<tr>
            <td>"""),_display_(/*18.18*/p/*18.19*/.getProjectName),format.raw/*18.34*/("""</td>
            <td>"""),_display_(/*19.18*/p/*19.19*/.getProjectDescription),format.raw/*19.41*/("""</td>
            <td>"""),_display_(/*20.18*/p/*20.19*/.getProjectStatus),format.raw/*20.36*/("""</td>
            
            """),_display_(/*22.14*/if(user != null)/*22.30*/{_display_(Seq[Any](format.raw/*22.31*/("""
              """),format.raw/*23.15*/("""<!-- Update button -->
              <td>
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.ProjectController.updateProject(p.getProjectId)),format.raw/*25.81*/("""" class="button-xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
                </a>
              </td>
              <!-- Delete button -->
              """),_display_(/*30.16*/if("admin".equals(user.getRole()))/*30.50*/{_display_(Seq[Any](format.raw/*30.51*/("""
                """),format.raw/*31.17*/("""<td>
                  <a href=""""),_display_(/*32.29*/routes/*32.35*/.ProjectController.deleteProject(p.getProjectId)),format.raw/*32.83*/("""" class="button-xs btn-danger"
                    onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                  </a>
                </td>
              """)))}),format.raw/*37.16*/("""
            """)))}),format.raw/*38.14*/("""
            """),format.raw/*39.13*/("""</tr>
          """)))}),format.raw/*40.12*/("""

        """),format.raw/*42.9*/("""</tbody>
      </table>

      <p>
        <a href=""""),_display_(/*46.19*/routes/*46.25*/.ProjectController.addProject()),format.raw/*46.56*/("""">
          <button class="btn btn-primary">Add a new project</button>
        </a>
      </p>

      """),_display_(/*51.8*/if(user != null)/*51.24*/ {_display_(Seq[Any](format.raw/*51.26*/("""
        """),format.raw/*52.9*/("""<p>
            <a href=""""),_display_(/*53.23*/routes/*53.29*/.ProjectController.showMyProjects()),format.raw/*53.64*/("""">
              <button class="btn btn-primary">Show my projects</button>
            </a>
        </p>
      """)))}),format.raw/*57.8*/("""
      
  """),format.raw/*59.3*/("""</section>

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
                  DATE: Mon Mar 18 21:26:32 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/projects.scala.html
                  HASH: f55157f28e025ba92a81b8efdc36f5f7ba0dab30
                  MATRIX: 987->1|1143->62|1171->65|1201->87|1240->89|1270->93|1661->457|1695->475|1735->477|1764->478|1814->501|1824->502|1860->517|1911->541|1921->542|1964->564|2015->588|2025->589|2063->606|2124->640|2149->656|2188->657|2232->673|2329->743|2344->749|2413->797|2637->994|2680->1028|2719->1029|2765->1047|2826->1081|2841->1087|2910->1135|3157->1351|3203->1366|3245->1380|3294->1398|3333->1410|3417->1467|3432->1473|3484->1504|3619->1613|3644->1629|3684->1631|3721->1641|3775->1668|3790->1674|3846->1709|3992->1825|4031->1837
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|55->23|57->25|57->25|57->25|62->30|62->30|62->30|63->31|64->32|64->32|64->32|69->37|70->38|71->39|72->40|74->42|78->46|78->46|78->46|83->51|83->51|83->51|84->52|85->53|85->53|85->53|89->57|91->59
                  -- GENERATED --
              */
          