<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Exercise Spring Shop</title>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

	<style>
	/* Space out content a bit */
	body {
	  padding-top: 20px;
	  padding-bottom: 20px;
	}
	
	/* Everything but the jumbotron gets side spacing for mobile first views */
	.header,
	.marketing,
	.footer {
	  padding-right: 15px;
	  padding-left: 15px;
	}
	
	/* Custom page header */
	.header {
	  padding-bottom: 20px;
	  border-bottom: 1px solid #e5e5e5;
	}
	/* Make the masthead heading the same height as the navigation */
	.header h3 {
	  margin-top: 0;
	  margin-bottom: 0;
	  line-height: 40px;
	}
	
	/* Custom page footer */
	.footer {
	  padding-top: 19px;
	  color: #777;
	  border-top: 1px solid #e5e5e5;
	}
	
	/* Customize container */
	@media (min-width: 768px) {
	  .container {
	    max-width: 730px;
	  }
	}
	.container-narrow > hr {
	  margin: 30px 0;
	}
	
	/* Main marketing message and sign up button */
	.jumbotron {
	  text-align: center;
	  border-bottom: 1px solid #e5e5e5;
	}
	.jumbotron .btn {
	  padding: 14px 24px;
	  font-size: 21px;
	}
	
	/* Supporting marketing content */
	.marketing {
	  margin: 40px 0;
	}
	.marketing p + h4 {
	  margin-top: 28px;
	}
	
	/* Responsive: Portrait tablets and up */
	@media screen and (min-width: 768px) {
	  /* Remove the padding we set earlier */
	  .header,
	  .marketing,
	  .footer {
	    padding-right: 0;
	    padding-left: 0;
	  }
	  /* Space out the masthead */
	  .header {
	    margin-bottom: 30px;
	  }
	  /* Remove the bottom border on the jumbotron for visual effect */
	  .jumbotron {
	    border-bottom: 0;
	  }
	}
	
	td {
		text-align: center;
	}
	 
	th {
		text-align: center;
	}
	 
	</style>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

</head>
<body>

    <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <!--  <li role="presentation" class="active"><a href="home.jsp">Home</a></li>  -->
            <li role="presentation"><a href="productList.jsp">View products</a></li>
            <li role="presentation"><a href="viewCart.jsp">View cart</a></li>
            <li role="presentation"><a href="login.jsp">Login</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Exercise Spring Shop</h3>
      </div>
     