<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>Trang chủ</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- icon cho trang -->
	<link rel="shortcut icon" type="image/x-icon"
		href="assets/img/favicon.ico">
	<!-- Toàn bộ link css -->
	<link rel="stylesheet" href="assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/css/magnific-popup.css">
	<link rel="stylesheet" href="assets/css/owl.carousel.min.css">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/css/pe-icon-7-stroke.css">
	<link rel="stylesheet" href="lib/css/nivo-slider.css" type="text/css" />
	<link rel="stylesheet" href="lib/css/preview.css" type="text/css"
		media="screen" />
	<link rel="stylesheet" href="assets/css/animate.css">
	<link rel="stylesheet" href="assets/css/meanmenu.min.css">
	<link rel="stylesheet" href="assets/css/bundle.css">
	<link rel="stylesheet" href="assets/css/style.css">
	<link rel="stylesheet" href="assets/css/main.css">
	
	<link rel="stylesheet" href="assets/css/responsive.css">
	<script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>
	</head>

<body>
    <!-- Header -->
    <jsp:include page="layout/header.jsp"></jsp:include>

    <!-- Contact Us Section -->
    <div class="container mt-5">
    <!-- Tiêu đề Contact Us -->
    <div class="section-title text-center mb-50">
        <h2>Contact Us</h2>
    </div>

    <!-- Contact Form -->
    <div class="row justify-content-center">
        <div class="col-md-8">
            <form action="ContactServlet" method="post">
                <div class="form-group">
                    <label for="name">Your Name</label>
                    <input type="text" class="form-control" id="name" name="name" required>
                </div>

                <div class="form-group">
                    <label for="email">Your Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>

                <div class="form-group">
                    <label for="message">Your Message</label>
                    <textarea class="form-control" id="message" name="message" rows="5" required></textarea>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>

    <!-- Contact Information -->
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <h4>Our SHOP</h4>
            <p>302 Cau Giay, Ha Noi</p>
            <p>Phone: 0827495297</p>
            <p>Email: contact@lathanhartist .com</p>
        </div>
    </div>
</div>


    <!-- Footer -->
    <jsp:include page="layout/footer.jsp"></jsp:include>

    <!-- JS Scripts -->
    <script src="assets/js/vendor/jquery-1.12.0.min.js"></script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/jquery.meanmenu.js"></script>
		<script src="assets/js/jquery.magnific-popup.min.js"></script>
		<script src="assets/js/isotope.pkgd.min.js"></script>
		<script src="assets/js/imagesloaded.pkgd.min.js"></script>
		<script src="assets/js/owl.carousel.min.js"></script>
		<script src="assets/js/jquery.validate.min.js"></script>
		<script src="lib/js/jquery.nivo.slider.js"></script>
		<script src="lib/home.js"></script>
		<script src="assets/js/plugins.js"></script>
		<script src="assets/js/main.js"></script>
</body>

</html>
