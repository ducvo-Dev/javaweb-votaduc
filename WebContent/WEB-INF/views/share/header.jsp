<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<header class="section-header">
<section class="header-main border-bottom">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-xl-2 col-lg-3 col-md-12">
				<a href="home" class="brand-wrap">
					<img class="logo" src="resources/images/logo.png">
				</a> <!-- brand-wrap.// -->
			</div>
			<div class="col-xl-6 col-lg-5 col-md-6">
				<form action="#" class="search-header">
					<div class="input-group w-100">
						<select class="custom-select border-right"  name="category_name">
								<option value="">Tất Cả Loại</option><option value="codex">Đặc Biệt</option>
								<option value="comments">Tốt Nhất</option>
								<option value="content">Giảm Giá</option>
						</select>
					    <input type="text" class="form-control" placeholder="Tìm Kiếm">
					    
					    <div class="input-group-append">
					      <button class="btn btn-primary" type="submit">
					        <i class="fa fa-search"></i> Tìm kiếm
					      </button>
					    </div>
				    </div>
				</form> <!-- search-wrap .end// -->
			</div> <!-- col.// -->
			<div class="col-xl-4 col-lg-4 col-md-6">
				<div class="widgets-wrap float-md-right">
					<div class="widget-header mr-3">
						<a href="#" class="widget-view">
							<div class="icon-area">
								<i class="fa fa-user"></i>
								<span class="notify">3</span>
							</div>
							<small class="text"> Tài khoản </small>
						</a>
					</div>
					<div class="widget-header mr-3">
						<a href="#" class="widget-view">
							<div class="icon-area">
								<i class="fa fa-comment-dots"></i>
								<span class="notify">1</span>
							</div>
							<small class="text"> Tin nhắn </small>
						</a>
					</div>
					<div class="widget-header mr-3">
						<a href="#" class="widget-view">
							<div class="icon-area">
								<i class="fa fa-store"></i>
							</div>
							<small class="text"> Đơn Hàng </small>
						</a>
					</div>
					<div class="widget-header">
						<a href="ListCart" class="widget-view">
							<div class="icon-area">
								<i class="fa fa-shopping-cart"></i>
							</div>
							<small class="text"> Giỏ Hàng </small>
						</a>
					</div>
				</div> <!-- widgets-wrap.// -->
			</div> <!-- col.// -->
		</div> <!-- row.// -->
	</div> <!-- container.// -->
</section> <!-- header-main .// -->

<nav class="navbar navbar-main navbar-expand-lg border-bottom">
<div class="container">
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_nav" aria-controls="main_nav" aria-expanded="false" aria-label="Toggle navigation">
	<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="main_nav">
	<ul class="navbar-nav">
		<li class="nav-item ">
			<a  class="nav-link" href="home">Trang chủ</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="#">Sẵn sàng chuyển hàng</a>
		</li>
		<li class="nav-item">
		<a class="nav-link" href="#">Triển lãm thương mại</a>
		</li>
		<li class="nav-item">
		<a class="nav-link" href="#">Dịch vụ</a>
		</li>
		<li class="nav-item">
		<a class="nav-link" href="#">Bán với chúng tôi</a>
		</li>
	</ul>
	<ul class="navbar-nav ml-md-auto">
			<li class="nav-item">
			<a class="nav-link" href="#">Tải ứng dụng</a>
		</li>
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="http://example.com" data-toggle="dropdown">Việt Nam</a>
			<div class="dropdown-menu dropdown-menu-right">
			<a class="dropdown-item" href="#">French</a>
			<a class="dropdown-item" href="#">Spanish</a>
			<a class="dropdown-item" href="#">Chinese</a>
			</div>
		</li>
		</ul>
	</div> <!-- collapse .// -->
</div> <!-- container .// -->
</nav>

</header> <!-- section-header.// -->

