<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="max-age=604800" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<meta name="description" content="Bootstrap e-commerce html template similar to Alibaba">
<meta name="keywords" content="Online template, shop, theme, template, html, css, bootstrap 4">

<link href="resources/images/favicon.ico" rel="shortcut icon" type="image/x-icon">

<!-- jQuery -->
<script src="resources/js/jquery-2.0.0.min.js" type="text/javascript"></script>

<!-- Bootstrap4 files-->
<script src="resources/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>

<!-- Font awesome 5 -->
<link href="resources/fonts/fontawesome/css/all.min.css" type="text/css" rel="stylesheet">

<!-- custom style -->
<link href="resources/css/ui.css" rel="stylesheet" type="text/css"/>
<link href="resources/css/responsive.css" rel="stylesheet" type="text/css" />

<!-- custom javascript -->
<script src="resources/js/script.js" type="text/javascript"></script>

</head>
<body>

<b class="screen-overlay"></b>

<jsp:include page ="../share/header.jsp"></jsp:include>

<!-- ========================= SECTION CONTENT ========================= -->
<section class="section-content padding-y">
<div class="container" style="max-width: 720px;">

<div class="card mb-4">
      <div class="card-body">
      <h4 class="card-title mb-3">Thông tin giao hàng</h4>

	  <div class="form-row">
			<div class="form-group col-sm-6">
				<label class="js-check box active">
					<input type="radio" name="dostavka" value="option1" checked>
					<h6 class="title">Giao hàng tiêu chuẩn</h6>
					<p class="text-muted">Miễn phí của hãng hàng không trong vòng 20 ngày</p>
				</label> <!-- js-check.// -->
			</div>
			<div class="form-group col-sm-6">
				<label class="js-check box">
					<input type="radio" name="dostavka" value="option1">
					<h6 class="title">Chuyển phát nhanh</h6>
					<p class="text-muted">Phí vận chuyển 50000 vnđ </p>
				</label> <!-- js-check.// -->
			</div>
		</div> <!-- form row.// -->

	<div class="form-row">
		<div class="col form-group">
			<label>Tên</label>
		  	<input type="text" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
		<div class="col form-group">
			<label>Họ</label>
		  	<input type="text" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
	</div> <!-- form-row end.// -->

	<div class="form-row">
		<div class="col form-group">
			<label>Email</label>
		  	<input type="email" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
		<div class="col form-group">
			<label>Số điện thoại</label>
		  	<input type="text" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
	</div> <!-- form-row end.// -->

	<div class="form-row">
		<div class="form-group col-md-6">
		  <label>Đất Nước</label>
		  	<input type="text" class="form-control" placeholder="">
		</div> <!-- form-group end.// -->
		<div class="form-group col-md-6">
		  <label>Thành Phố</label>
		  <input type="text" class="form-control">
		</div> <!-- form-group end.// -->
	</div> <!-- form-row.// -->
	<div class="form-group">
		<label>Địa Chỉ</label>
       <textarea class="form-control" rows="2"></textarea>
    </div> <!-- form-group// -->  

      </div> <!-- card-body.// -->
    </div>  <!-- card .// -->


		<div class="card mb-4">
      <div class="card-body">
      <h4 class="card-title mb-4">Thanh toán</h4>
      <form role="form" style="max-width:380px;">
			<div class="form-group">
			<label for="username">Tên chủ thẻ</label>
			<input type="text" class="form-control" name="username" placeholder="" required="">
			</div> <!-- form-group.// -->

			<div class="form-group">
			<label for="cardNumber">Số Tài khoản</label>
			<div class="input-group">
				<input type="text" class="form-control" name="cardNumber" placeholder="">
				<div class="input-group-append">
					<span class="input-group-text">
						<i class="fab fa-cc-visa"></i> &nbsp; <i class="fab fa-cc-amex"></i> &nbsp; 
						<i class="fab fa-cc-mastercard"></i> 
					</span>
				</div>
			</div> <!-- input-group.// -->
			</div> <!-- form-group.// -->

		
			<button class="subscribe btn btn-primary btn-block" type="button"> Thanh Toán  </button>
		</form>
      </div> <!-- card-body.// -->
    </div> <!-- card .// -->


<br><br> 

</div> <!-- container .//  -->
</section>
<!-- ========================= SECTION CONTENT END// ========================= -->




<!-- ========================= FOOTER ========================= -->
<jsp:include page = "../share/footer.jsp"></jsp:include>
<!-- ========================= FOOTER END // ========================= -->



</body>
</html>