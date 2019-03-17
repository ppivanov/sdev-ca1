
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectForm: Form[models.Project],user: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Project",user)/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new project</p>

    """),_display_(/*7.6*/form(action=routes.ProjectController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form",
           'method -> "POST", 'enctype -> "multipart/form-data")/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""

           
            """),_display_(/*12.14*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.89*/("""
            
            """),_display_(/*14.14*/inputText(projectForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.103*/("""
            """),_display_(/*15.14*/inputText(projectForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*15.91*/("""
            """),_display_(/*16.14*/inputText(projectForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.91*/("""

            """),_display_(/*18.14*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.78*/("""
            """),format.raw/*19.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Project" class="btn btn-primary">
                <a href=""""),_display_(/*21.27*/routes/*21.33*/.HomeController.projects()),format.raw/*21.59*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*25.6*/(""" """),format.raw/*25.24*/("""
""")))}),format.raw/*26.2*/(""" """))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 01:55:52 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addProject.scala.html
                  HASH: cb9c545c83fdcd8ab0472b11a4134679f0813617
                  MATRIX: 989->1|1125->66|1169->82|1196->84|1228->108|1266->109|1297->114|1366->158|1541->325|1580->327|1616->337|1628->341|1658->351|1712->378|1808->453|1862->480|1973->569|2014->583|2112->660|2153->674|2251->751|2293->766|2378->830|2419->843|2583->980|2598->986|2645->1012|2805->1142|2834->1160|2866->1162
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|39->8|39->8|40->9|40->9|40->9|43->12|43->12|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|50->19|52->21|52->21|52->21|56->25|56->25|57->26
                  -- GENERATED --
              */
          