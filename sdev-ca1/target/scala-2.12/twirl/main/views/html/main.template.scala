
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.Employee)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href=""""),_display_(/*22.38*/routes/*22.44*/.HomeController.index()),format.raw/*22.67*/("""">ProjectManagement</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "Projects")/*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""class="active"""")))}),format.raw/*26.55*/("""><a href=""""),_display_(/*26.66*/routes/*26.72*/.HomeController.projects(0)),format.raw/*26.99*/("""">Projects</a></li> <!-- redirect to projects page -->
			
			"""),_display_(/*28.5*/if((user != null) && ("admin".equals(user.getRole())))/*28.59*/ {_display_(Seq[Any](format.raw/*28.61*/("""
				"""),format.raw/*29.5*/("""<li """),_display_(/*29.10*/if(pagename == "Add an employee")/*29.43*/ {_display_(Seq[Any](format.raw/*29.45*/("""class="active"""")))}),format.raw/*29.60*/("""><a href=""""),_display_(/*29.71*/routes/*29.77*/.LoginController.addEmployee()),format.raw/*29.107*/("""">Register employee</a></li>
				<li """),_display_(/*30.10*/if(pagename == "Add an admin")/*30.40*/ {_display_(Seq[Any](format.raw/*30.42*/("""class="active"""")))}),format.raw/*30.57*/("""><a href=""""),_display_(/*30.68*/routes/*30.74*/.LoginController.addAdmin()),format.raw/*30.101*/("""">Register admin</a></li>
				<li """),_display_(/*31.10*/if(pagename == "Administrators")/*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""class="active"""")))}),format.raw/*31.59*/("""><a href=""""),_display_(/*31.70*/routes/*31.76*/.HomeController.usersAdmin()),format.raw/*31.104*/("""">View admins</a></li>
				<li """),_display_(/*32.10*/if(pagename == "Employees")/*32.37*/ {_display_(Seq[Any](format.raw/*32.39*/("""class="active"""")))}),format.raw/*32.54*/("""><a href=""""),_display_(/*32.65*/routes/*32.71*/.HomeController.usersEmployee()),format.raw/*32.102*/("""">View employees</a></li>

			""")))}),format.raw/*34.5*/("""
			
			"""),format.raw/*36.4*/("""<li """),_display_(/*36.9*/if(pagename == "Log In")/*36.33*/ {_display_(Seq[Any](format.raw/*36.35*/("""class="active"""")))}),format.raw/*36.50*/(""">
				"""),_display_(/*37.6*/if(user != null)/*37.22*/ {_display_(Seq[Any](format.raw/*37.24*/("""
					"""),format.raw/*38.6*/("""<a href=""""),_display_(/*38.16*/routes/*38.22*/.LoginController.logout()),format.raw/*38.47*/("""">Log Out</a>
				""")))}/*39.7*/else/*39.12*/{_display_(Seq[Any](format.raw/*39.13*/("""
					"""),format.raw/*40.6*/("""<a href=""""),_display_(/*40.16*/routes/*40.22*/.LoginController.login()),format.raw/*40.46*/("""">Log In</a>
			</li>
""")))}),format.raw/*42.2*/(""" 
		"""),format.raw/*43.3*/("""</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Progress</h3>
			<p>This week we move the <span class="redtext">NATO Surveilance</span> project into develelopment stage.</p>
			<p>We will also start planning <span class="redtext">TUD Timetable system</span> project.</p>
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*59.5*/content),format.raw/*59.12*/("""
		    """),format.raw/*60.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3></h3>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Copyright &copy;Dean and Pavel
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*77.17*/routes/*77.23*/.Assets.versioned("javascripts/main.js")),format.raw/*77.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:25:26 GMT 2019
                  SOURCE: D:/Computing/sdev-ca1/sdev-ca1/sdev-ca1/app/views/main.scala.html
                  HASH: a1ca42fcd33f45255584c3ddb7c50bd6d552e595
                  MATRIX: 974->1|1127->61|1409->316|1437->317|1465->318|1550->376|1578->377|1611->383|1648->392|1677->393|1706->394|1782->442|1811->443|1844->449|1884->461|1913->462|1942->463|1989->482|2018->483|2051->489|2090->500|2119->501|2148->502|2215->541|2244->542|2277->548|2316->559|2345->560|2374->561|2440->599|2469->600|2502->606|2539->615|2568->616|2597->617|2637->629|2666->630|2695->632|2744->654|2773->662|2971->833|2986->839|3030->862|3137->942|3168->964|3208->966|3254->981|3292->992|3307->998|3351->1021|3405->1048|3440->1074|3480->1076|3526->1091|3564->1102|3579->1108|3627->1135|3716->1198|3779->1252|3819->1254|3851->1259|3883->1264|3925->1297|3965->1299|4011->1314|4049->1325|4064->1331|4116->1361|4181->1399|4220->1429|4260->1431|4306->1446|4344->1457|4359->1463|4408->1490|4470->1525|4511->1557|4551->1559|4597->1574|4635->1585|4650->1591|4700->1619|4759->1651|4795->1678|4835->1680|4881->1695|4919->1706|4934->1712|4987->1743|5048->1774|5083->1782|5114->1787|5147->1811|5187->1813|5233->1828|5266->1835|5291->1851|5331->1853|5364->1859|5401->1869|5416->1875|5462->1900|5499->1920|5512->1925|5551->1926|5584->1932|5621->1942|5636->1948|5681->1972|5734->1995|5765->1999|6255->2463|6283->2470|6317->2477|6657->2790|6672->2796|6733->2836
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|53->22|53->22|53->22|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|65->34|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|73->42|74->43|90->59|90->59|91->60|108->77|108->77|108->77
                  -- GENERATED --
              */
          