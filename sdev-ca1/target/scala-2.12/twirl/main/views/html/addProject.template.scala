
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

            """),_display_(/*18.14*/for((value, name) <- users.Employee.options) yield /*18.58*/ {_display_(Seq[Any](format.raw/*18.60*/("""
                """),format.raw/*19.17*/("""<input type="checkbox" name="empSelect[]" value=""""),_display_(/*19.67*/value),format.raw/*19.72*/(""""  
                    """),_display_(/*20.22*/if(projectForm("id").getValue.isPresent && projectForm("id").getValue.get != "")/*20.102*/ {_display_(Seq[Any](format.raw/*20.104*/(""" 
                        """),_display_(/*21.26*/if(users.Employee.inProject(value.toLong, projectForm("id").getValue.get.toLong))/*21.107*/ {_display_(Seq[Any](format.raw/*21.109*/("""
                            """),format.raw/*22.29*/("""checked
                        """)))}),format.raw/*23.26*/("""
                    """)))}),format.raw/*24.22*/(""" 
                """),format.raw/*25.17*/("""/> """),_display_(/*25.21*/name),format.raw/*25.25*/(""" """),format.raw/*25.26*/("""</br>
              """)))}),format.raw/*26.16*/("""

            """),_display_(/*28.14*/inputText(projectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.78*/("""
            """),format.raw/*29.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Project" class="btn btn-primary">
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.HomeController.index()),format.raw/*31.56*/(""""> <!-- redirect to projects page -->
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*35.6*/(""" """),format.raw/*35.24*/("""
""")))}),format.raw/*36.2*/(""" """))
      }
    }
  }

  def render(projectForm:Form[models.Project],user:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((Form[models.Project],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:05:31 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/addProject.scala.html
                  HASH: 11ca318c139e29acd732384db4ba98b99bde78f5
                  MATRIX: 989->1|1125->66|1169->82|1196->84|1228->108|1266->109|1297->114|1366->158|1541->325|1580->327|1616->337|1628->341|1658->351|1712->378|1808->453|1862->480|1973->569|2014->583|2112->660|2153->674|2251->751|2293->766|2353->810|2393->812|2438->829|2515->879|2541->884|2593->909|2683->989|2724->991|2778->1018|2869->1099|2910->1101|2967->1130|3031->1163|3084->1185|3130->1203|3161->1207|3186->1211|3215->1212|3267->1233|3309->1248|3394->1312|3435->1325|3599->1462|3614->1468|3658->1491|3853->1656|3882->1674|3914->1676
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|39->8|39->8|40->9|40->9|40->9|43->12|43->12|45->14|45->14|46->15|46->15|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|55->24|56->25|56->25|56->25|56->25|57->26|59->28|59->28|60->29|62->31|62->31|62->31|66->35|66->35|67->36
                  -- GENERATED --
              */
          