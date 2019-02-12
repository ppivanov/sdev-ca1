
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("")),format.raw/*16.82*/("""'> <!-- Image -->
    <script src='"""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.66*/("""' type="text/javascript"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.0/css/bootstrap.min.css"          
     integrity="sha384-PDle/QlgIONtM1aqA2Qemk5gPOE7wFq8+Em+G/hmo5Iq0CCmYZLv3fVRDJ4MMwEA" crossorigin="anonymous"> <!-- bootstrap reference link -->
</head>

<body>
    <header>
            <h1 class="heading">Title</h1>
    </header>
    """),_display_(/*26.6*/content),format.raw/*26.13*/("""
"""),format.raw/*27.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 12 15:12:18 GMT 2019
                  SOURCE: /home/wdd/Documents/sdev/sdev-ca1/sdev-ca1/app/views/main.scala.html
                  HASH: 609580602e3e058c516f015584327b63e529be1e
                  MATRIX: 992->266|1117->296|1147->300|1231->357|1257->362|1419->497|1434->503|1496->544|1581->602|1596->608|1638->629|1702->666|1717->672|1779->713|2205->1113|2233->1120|2262->1122
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|50->26|50->26|51->27
                  -- GENERATED --
              */
          