<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value ="vi_VN"/>
<section  class="padding-bottom-sm">

<header class="section-heading heading-line">
	<h4 class="title-section text-uppercase">Các sản phẩm đề xuất</h4>
</header>

<div class="row row-sm">
<c:forEach var="product" items="${Hotnew}">

	<div class="col-xl-2 col-lg-3 col-md-4 col-6">
		<div class="card card-sm card-product-grid">
			<a href="#" class="img-wrap"> <img src="resources/images/${product.getImage()}"> </a>
			<figcaption class="info-wrap">
				<a href="product?id=${product.getId()}" class="title">${product.getTitle()}</a>
				<div class="price mt-1"><fmt:formatNumber value="${product.getPrice()}" type="number" maxIntegerDigits="14"/> vnđ</div> <!-- price-wrap.// -->
			</figcaption>
		</div>
	</div> <!-- col.// -->
</c:forEach>

</div> <!-- row.// -->
</section>
