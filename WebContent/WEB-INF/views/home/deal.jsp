<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value ="vi_VN"/>
<section class="padding-bottom">
 <div class="card card-deal">
     <div class="col-heading content-body">
      <header class="section-heading">
       <h3 class="section-title">Giảm Giá CỰC SỐC</h3>
       <p>Kết thúc sau:</p>
     </header><!-- sect-heading -->
     
     <div class="timer">
       <div> <span class="num">04</span> <small>Ngày</small></div>
       <div> <span class="num">12</span> <small>Giờ</small></div>
       <div> <span class="num">58</span> <small>Phút</small></div>
       <div> <span class="num">02</span> <small>Giây</small></div>
     </div>
     
   	</div> <!-- col.// -->
   <div class="row no-gutters items-wrap">
   <c:forEach var="product" items="${dealsOfWeek}">
   
    <div class="col-md col-6">
     <figure class="card-product-grid card-sm">
      <a href="" class="img-wrap"> 
       <img src="resources/images/${product.getImage()}"> 
      </a>
      <div class="text-wrap p-3">
       	<a href="product?id=${product.getId()}" class="title">${product.getTitle()}</a>
       	<span class="badge badge-danger"> ${product.getDiscount()}% </span>
      </div>
   </figure>
 </div> 
 
 <!-- col.// -->
</c:forEach>
</div>
</div>

</section>
