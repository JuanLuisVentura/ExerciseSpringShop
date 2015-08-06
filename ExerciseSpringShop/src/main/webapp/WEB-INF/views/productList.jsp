<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<jsp:include page="header.jsp"></jsp:include>

	<div id="message" style="margin-bottom: 15px;"></div>

	<table class="table table-hover">
      <thead>
        <tr>
          <th>#</th>
          <th>Product</th>
          <th>Price</th>
          <th>Add to cart</th>
        </tr>
      </thead>
      <tbody>
      
      <c:forEach var="product" items="${listProducts}">
        <tr>
          <th scope="row">${product.id}</th>
          <td scope="row">${product.name}</td>
          <td scope="row">$ ${product.price}</td>
          <td><button rel="${product.id}" class="myButton">Add product to cart</button></td>
        </tr>
   		</c:forEach>
      <!-- 
        <tr>
          <th scope="row">1</th>
          <td>Shoes</td>
          <td>30.50$</td>
          <td><button rel="1" class="myButton">Add product to cart</button></td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Hat</td>
          <td>15$</td>
          <td><button rel="2" class="myButton">Add product to cart</button></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Gloves</td>
          <td>6.75$</td>
          <td><button rel="3" class="myButton">Add product to cart</button></td>
        </tr>
 -->
      </tbody>
    </table>
    
    
<script>
	$( document ).ready(function() {
	    console.log( "ready!" );

	    $(".myButton").click(function() {
	    	var idItem = $(this).attr('rel');
	    	$.get( "add?idProduct=" + idItem, function( data ) {
				 $( "#message" ).html( data );
	    	});
	    });
	});
</script>

<jsp:include page="footer.jsp"></jsp:include>