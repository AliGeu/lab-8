
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add or update a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")),format.raw/*8.105*/("""
        """),format.raw/*9.37*/("""
        """),format.raw/*10.99*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),_display_(/*14.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*14.99*/("""
        """),_display_(/*15.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*15.87*/("""
        """),_display_(/*16.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.87*/("""
  
        """),_display_(/*18.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.74*/("""
  
        """),format.raw/*20.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*22.23*/routes/*22.29*/.HomeController.index),format.raw/*22.50*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*26.6*/(""" """),format.raw/*26.24*/("""
"""))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 17:29:08 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 8.1/app/views/addProduct.scala.html
                  HASH: e4849e5b99374dcf4637b48694adba6591bf7a3e
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1175->57|1202->76|1241->78|1272->83|1351->137|1471->236|1507->273|1544->372|1581->382|1594->386|1625->396|1663->407|1759->482|1796->492|1906->581|1943->591|2041->668|2078->678|2176->755|2216->768|2301->832|2340->844|2496->973|2511->979|2553->1000|2701->1118|2730->1136
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|50->18|50->18|52->20|54->22|54->22|54->22|58->26|58->26
                  -- GENERATED --
              */
          