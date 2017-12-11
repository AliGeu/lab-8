
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""<p class="lead">Product Catalogue</p>
  
<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>
      
      <th>Description</th>
      
      <th>Stock</th>
      
      <th class="numeric">Price</th>
      
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*29.55*/("""
    """),_display_(/*30.6*/for(p<-products) yield /*30.22*/ {_display_(Seq[Any](format.raw/*30.24*/("""
  
  """),format.raw/*32.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*36.12*/p/*36.13*/.getId),format.raw/*36.19*/("""</td>
      
      <td>"""),_display_(/*38.12*/p/*38.13*/.getName),format.raw/*38.21*/("""</td>
      
      <td>"""),_display_(/*40.12*/p/*40.13*/.getDescription),format.raw/*40.28*/("""</td>
      
      <td>"""),_display_(/*42.12*/p/*42.13*/.getStock),format.raw/*42.22*/("""</td>
      
      <td class="numeric">&euro; """),_display_(/*44.35*/("%.2f".format(p.getPrice))),format.raw/*44.62*/("""</td>
    
    </tr>
  """)))}),format.raw/*47.4*/(""" """),format.raw/*47.22*/("""
  
  """),format.raw/*49.3*/("""</tbody>
  
  </table>
  
  """)))}),format.raw/*53.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 13:25:26 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 8.1/app/views/index.scala.html
                  HASH: 0435aeab0968f3c29364ceca5d1a9014c43ecf4d
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1599->469|1631->475|1663->491|1703->493|1736->499|1815->551|1825->552|1852->558|1903->582|1913->583|1942->591|1993->615|2003->616|2039->631|2090->655|2100->656|2130->665|2204->712|2252->739|2306->763|2335->781|2368->787|2427->816
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|61->29|62->30|62->30|62->30|64->32|68->36|68->36|68->36|70->38|70->38|70->38|72->40|72->40|72->40|74->42|74->42|74->42|76->44|76->44|79->47|79->47|81->49|85->53
                  -- GENERATED --
              */
          