package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Vegefoods - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"goto-here\">\n");
      out.write("\t\t<div class=\"py-1 bg-primary\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row no-gutters d-flex align-items-start align-items-center px-md-0\">\n");
      out.write("\t    \t\t<div class=\"col-lg-12 d-block\">\n");
      out.write("\t\t    \t\t<div class=\"row d-flex\">\n");
      out.write("\t\t    \t\t\t<div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"icon mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-phone2\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">+ 1235 2355 98</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"icon mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-paper-plane\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">youremail@email.com</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-5 pr-4 d-flex topper align-items-center text-lg-right\">\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">3-5 Business days delivery &amp; Free Returns</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("    </div>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("\t    <div class=\"container\">\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"index.html\">Vegefoods</a>\n");
      out.write("\t      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t        <span class=\"oi oi-menu\"></span> Menu\n");
      out.write("\t      </button>\n");
      out.write("\n");
      out.write("\t      <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("\t        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link\">Home</a></li>\n");
      out.write("\t          <li class=\"nav-item active dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Shop</a>\n");
      out.write("              <div class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\n");
      out.write("              \t<a class=\"dropdown-item\" href=\"shop.html\">Shop</a>\n");
      out.write("              \t<a class=\"dropdown-item\" href=\"wishlist.html\">Wishlist</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"product-single.html\">Single Product</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"cart.html\">Cart</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"checkout.html\">Checkout</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog</a></li>\n");
      out.write("\t          <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n");
      out.write("\t          <li class=\"nav-item cta cta-colored\"><a href=\"cart.html\" class=\"nav-link\"><span class=\"icon-shopping_cart\"></span>[0]</a></li>\n");
      out.write("\n");
      out.write("\t        </ul>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </nav>\n");
      out.write("    <!-- END nav -->\n");
      out.write("\n");
      out.write("    <div class=\"hero-wrap hero-bread\" style=\"background-image: url('images/bg_1.jpg');\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row no-gutters slider-text align-items-center justify-content-center\">\n");
      out.write("          <div class=\"col-md-9 ftco-animate text-center\">\n");
      out.write("          \t<p class=\"breadcrumbs\"><span class=\"mr-2\"><a href=\"index.html\">Home</a></span> <span>Cart</span></p>\n");
      out.write("            <h1 class=\"mb-0 bread\">My Cart</h1>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section class=\"ftco-section ftco-cart\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("    \t\t\t<div class=\"col-md-12 ftco-animate\">\n");
      out.write("    \t\t\t\t<div class=\"cart-list\">\n");
      out.write("\t    \t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t    <thead class=\"thead-primary\">\n");
      out.write("\t\t\t\t\t\t      <tr class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t        <th>&nbsp;</th>\n");
      out.write("\t\t\t\t\t\t        <th>&nbsp;</th>\n");
      out.write("\t\t\t\t\t\t        <th>Product name</th>\n");
      out.write("\t\t\t\t\t\t        <th>Price</th>\n");
      out.write("\t\t\t\t\t\t        <th>Quantity</th>\n");
      out.write("\t\t\t\t\t\t        <th>Total</th>\n");
      out.write("\t\t\t\t\t\t      </tr>\n");
      out.write("\t\t\t\t\t\t    </thead>\n");
      out.write("\t\t\t\t\t\t    <tbody>\n");
      out.write("\t\t\t\t\t\t      <tr class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t        <td class=\"product-remove\"><a href=\"#\"><span class=\"ion-ios-close\"></span></a></td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"image-prod\"><div class=\"img\" style=\"background-image:url(images/product-3.jpg);\"></div></td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"product-name\">\n");
      out.write("\t\t\t\t\t\t        \t<h3>Bell Pepper</h3>\n");
      out.write("\t\t\t\t\t\t        \t<p>Far far away, behind the word mountains, far from the countries</p>\n");
      out.write("\t\t\t\t\t\t        </td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"price\">$4.90</td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"quantity\">\n");
      out.write("\t\t\t\t\t\t        \t<div class=\"input-group mb-3\">\n");
      out.write("\t\t\t\t\t             \t<input type=\"text\" name=\"quantity\" class=\"quantity form-control input-number\" value=\"1\" min=\"1\" max=\"100\">\n");
      out.write("\t\t\t\t\t          \t</div>\n");
      out.write("\t\t\t\t\t          </td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"total\">$4.90</td>\n");
      out.write("\t\t\t\t\t\t      </tr><!-- END TR-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t      <tr class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t        <td class=\"product-remove\"><a href=\"#\"><span class=\"ion-ios-close\"></span></a></td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"image-prod\"><div class=\"img\" style=\"background-image:url(images/product-4.jpg);\"></div></td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"product-name\">\n");
      out.write("\t\t\t\t\t\t        \t<h3>Bell Pepper</h3>\n");
      out.write("\t\t\t\t\t\t        \t<p>Far far away, behind the word mountains, far from the countries</p>\n");
      out.write("\t\t\t\t\t\t        </td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"price\">$15.70</td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"quantity\">\n");
      out.write("\t\t\t\t\t\t        \t<div class=\"input-group mb-3\">\n");
      out.write("\t\t\t\t\t             \t<input type=\"text\" name=\"quantity\" class=\"quantity form-control input-number\" value=\"1\" min=\"1\" max=\"100\">\n");
      out.write("\t\t\t\t\t          \t</div>\n");
      out.write("\t\t\t\t\t          </td>\n");
      out.write("\t\t\t\t\t\t        \n");
      out.write("\t\t\t\t\t\t        <td class=\"total\">$15.70</td>\n");
      out.write("\t\t\t\t\t\t      </tr><!-- END TR-->\n");
      out.write("\t\t\t\t\t\t    </tbody>\n");
      out.write("\t\t\t\t\t\t  </table>\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"row justify-content-end\">\n");
      out.write("    \t\t\t<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n");
      out.write("    \t\t\t\t<div class=\"cart-total mb-3\">\n");
      out.write("    \t\t\t\t\t<h3>Coupon Code</h3>\n");
      out.write("    \t\t\t\t\t<p>Enter your coupon code if you have one</p>\n");
      out.write("  \t\t\t\t\t\t<form action=\"#\" class=\"info\">\n");
      out.write("\t              <div class=\"form-group\">\n");
      out.write("\t              \t<label for=\"\">Coupon code</label>\n");
      out.write("\t                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n");
      out.write("\t              </div>\n");
      out.write("\t            </form>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Apply Coupon</a></p>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n");
      out.write("    \t\t\t\t<div class=\"cart-total mb-3\">\n");
      out.write("    \t\t\t\t\t<h3>Estimate shipping and tax</h3>\n");
      out.write("    \t\t\t\t\t<p>Enter your destination to get a shipping estimate</p>\n");
      out.write("  \t\t\t\t\t\t<form action=\"#\" class=\"info\">\n");
      out.write("\t              <div class=\"form-group\">\n");
      out.write("\t              \t<label for=\"\">Country</label>\n");
      out.write("\t                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n");
      out.write("\t              </div>\n");
      out.write("\t              <div class=\"form-group\">\n");
      out.write("\t              \t<label for=\"country\">State/Province</label>\n");
      out.write("\t                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n");
      out.write("\t              </div>\n");
      out.write("\t              <div class=\"form-group\">\n");
      out.write("\t              \t<label for=\"country\">Zip/Postal Code</label>\n");
      out.write("\t                <input type=\"text\" class=\"form-control text-left px-3\" placeholder=\"\">\n");
      out.write("\t              </div>\n");
      out.write("\t            </form>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Estimate</a></p>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t\t<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n");
      out.write("    \t\t\t\t<div class=\"cart-total mb-3\">\n");
      out.write("    \t\t\t\t\t<h3>Cart Totals</h3>\n");
      out.write("    \t\t\t\t\t<p class=\"d-flex\">\n");
      out.write("    \t\t\t\t\t\t<span>Subtotal</span>\n");
      out.write("    \t\t\t\t\t\t<span>$20.60</span>\n");
      out.write("    \t\t\t\t\t</p>\n");
      out.write("    \t\t\t\t\t<p class=\"d-flex\">\n");
      out.write("    \t\t\t\t\t\t<span>Delivery</span>\n");
      out.write("    \t\t\t\t\t\t<span>$0.00</span>\n");
      out.write("    \t\t\t\t\t</p>\n");
      out.write("    \t\t\t\t\t<p class=\"d-flex\">\n");
      out.write("    \t\t\t\t\t\t<span>Discount</span>\n");
      out.write("    \t\t\t\t\t\t<span>$3.00</span>\n");
      out.write("    \t\t\t\t\t</p>\n");
      out.write("    \t\t\t\t\t<hr>\n");
      out.write("    \t\t\t\t\t<p class=\"d-flex total-price\">\n");
      out.write("    \t\t\t\t\t\t<span>Total</span>\n");
      out.write("    \t\t\t\t\t\t<span>$17.60</span>\n");
      out.write("    \t\t\t\t\t</p>\n");
      out.write("    \t\t\t\t</div>\n");
      out.write("    \t\t\t\t<p><a href=\"checkout.html\" class=\"btn btn-primary py-3 px-4\">Proceed to Checkout</a></p>\n");
      out.write("    \t\t\t</div>\n");
      out.write("    \t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<section class=\"ftco-section ftco-no-pt ftco-no-pb py-5 bg-light\">\n");
      out.write("      <div class=\"container py-4\">\n");
      out.write("        <div class=\"row d-flex justify-content-center py-5\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("          \t<h2 style=\"font-size: 22px;\" class=\"mb-0\">Subcribe to our Newsletter</h2>\n");
      out.write("          \t<span>Get e-mail updates about our latest shops and special offers</span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 d-flex align-items-center\">\n");
      out.write("            <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("              <div class=\"form-group d-flex\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Enter email address\">\n");
      out.write("                <input type=\"submit\" value=\"Subscribe\" class=\"submit px-3\">\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"ftco-footer ftco-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("      \t<div class=\"row\">\n");
      out.write("      \t\t<div class=\"mouse\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"mouse-icon\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mouse-wheel\"><span class=\"ion-ios-arrow-up\"></span></div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("      \t</div>\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Vegefoods</h2>\n");
      out.write("              <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia.</p>\n");
      out.write("              <ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-5\">\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4 ml-md-5\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Menu</h2>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"#\" class=\"py-2 d-block\">Shop</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"py-2 d-block\">Journal</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"py-2 d-block\">Contact Us</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("             <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Help</h2>\n");
      out.write("              <div class=\"d-flex\">\n");
      out.write("\t              <ul class=\"list-unstyled mr-l-5 pr-l-3 mr-4\">\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Shipping Information</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Returns &amp; Exchange</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Terms &amp; Conditions</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Privacy Policy</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t              <ul class=\"list-unstyled\">\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">FAQs</a></li>\n");
      out.write("\t                <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-4\">\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n");
      out.write("            \t<div class=\"block-23 mb-3\">\n");
      out.write("\t              <ul>\n");
      out.write("\t                <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 text-center\">\n");
      out.write("\n");
      out.write("            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\t\t\t\t\t\t  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"icon-heart color-danger\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("\t\t\t\t\t\t  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("  <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("  <script src=\"js/google-map.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\n");
      out.write("\t\tvar quantitiy=0;\n");
      out.write("\t\t   $('.quantity-right-plus').click(function(e){\n");
      out.write("\t\t        \n");
      out.write("\t\t        // Stop acting like a button\n");
      out.write("\t\t        e.preventDefault();\n");
      out.write("\t\t        // Get the field name\n");
      out.write("\t\t        var quantity = parseInt($('#quantity').val());\n");
      out.write("\t\t        \n");
      out.write("\t\t        // If is not undefined\n");
      out.write("\t\t            \n");
      out.write("\t\t            $('#quantity').val(quantity + 1);\n");
      out.write("\n");
      out.write("\t\t          \n");
      out.write("\t\t            // Increment\n");
      out.write("\t\t        \n");
      out.write("\t\t    });\n");
      out.write("\n");
      out.write("\t\t     $('.quantity-left-minus').click(function(e){\n");
      out.write("\t\t        // Stop acting like a button\n");
      out.write("\t\t        e.preventDefault();\n");
      out.write("\t\t        // Get the field name\n");
      out.write("\t\t        var quantity = parseInt($('#quantity').val());\n");
      out.write("\t\t        \n");
      out.write("\t\t        // If is not undefined\n");
      out.write("\t\t      \n");
      out.write("\t\t            // Increment\n");
      out.write("\t\t            if(quantity>0){\n");
      out.write("\t\t            $('#quantity').val(quantity - 1);\n");
      out.write("\t\t            }\n");
      out.write("\t\t    });\n");
      out.write("\t\t    \n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
