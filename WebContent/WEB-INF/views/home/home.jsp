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

<title> alistyle </title>

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
<!-- ========================= HEADER========================= -->
<jsp:include page ="../share/header.jsp"></jsp:include>
<!-- =========================END  HEADER========================= -->
<div class="container">
<!-- ========================= SECTION MAIN  ========================= -->
<jsp:include page ="section_main.jsp"></jsp:include>
<!-- ========================= SECTION MAIN END// ========================= -->

<!-- =============== SECTION DEAL =============== -->
<jsp:include page ="deal.jsp"></jsp:include>
<!-- =============== SECTION DEAL // END =============== -->

<!-- =============== SECTION APPAREL =============== -->
<jsp:include page ="apparel.jsp"></jsp:include>
<!-- =============== SECTION APPAREL END =============== -->

<!-- =============== SECTION ELECTRONICS =============== -->
<jsp:include page ="electronic.jsp"></jsp:include>
<!-- =============== SECTION ELECTRONICS END =============== -->

<!-- =============== SECTION REQUEST =============== -->
<jsp:include page ="request.jsp"></jsp:include>
<!-- =============== SECTION REQUEST .//END =============== -->


<!-- =============== SECTION RECOMMENDED ITEMS =============== -->
<jsp:include page ="recommended_item.jsp"></jsp:include>
<!-- =============== SECTION RECOMMENDED ITEMS .//END =============== -->


<!-- =============== SECTION TRADE SERVICES =============== -->
<jsp:include page ="trade_service.jsp"></jsp:include>
<!-- =============== SECTION TRADE SERVICES .//END =============== -->

<!-- =============== SECTION REGION =============== -->
<jsp:include page ="choose_region.jsp"></jsp:include>
<!-- =============== SECTION CHOOSE REGION .//END =============== -->


</div>
<!-- container end.// -->

<!-- ========================= SECTION SUBSCRIBE  ========================= -->
<jsp:include page ="suprise.jsp"></jsp:include>
<!-- ========================= SECTION SUBSCRIBE END// ========================= -->


<!-- ========================= FOOTER ========================= -->
<jsp:include page ="../share/footer.jsp"></jsp:include>
<!-- ========================= FOOTER END // ========================= -->



</body>
</html>