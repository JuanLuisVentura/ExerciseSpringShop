<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<jsp:include page="header.jsp"></jsp:include>

<p><a class="btn btn-lg btn-success" href="payment.jsp" role="button">Checkout</a></p>

	<div id="message" style="margin-bottom: 15px;"></div>

	<table class="table table-hover">
      <thead>
        <tr>
          <th>#</th>
          <th>Product</th>
          <th>Quantity</th>
          <th>Price</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="product" items="${listProducts}">        
        <tr>
          <th scope="row">${product.id}</th>
          <td>${product.name}</td>
          <td><button rel="${product.id}" type="button" class="btn btn-xs btn-success myButton myButtonRemove">-</button><span id="quantity${product.id}">${product.id}</span><button rel="${product.id}" type="button" class="btn btn-xs btn-success myButton myButtonAdd">+</button></td>
          <td>$ ${product.price}</td>
        </tr>
   		</c:forEach>
 <!--      
        <tr>
          <th scope="row">1</th>
          <td>Shoes</td>
          <td><button rel="1" type="button" class="btn btn-xs btn-success myButton myButtonRemove">-</button><span id="quantity1">1</span><button rel="1" type="button" class="btn btn-xs btn-success myButton myButtonAdd">+</button></td>
          <td>30.50 $</td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Hat</td>
          <td><button rel="2" type="button" class="btn btn-xs btn-success myButton myButtonRemove">-</button><span id="quantity2">1</span><button rel="2" type="button" class="btn btn-xs btn-success myButton myButtonAdd">+</button></td>
          <td>15 $</td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Gloves</td>
          <td><button rel="3" type="button" class="btn btn-xs btn-success myButton myButtonRemove">-</button><span id="quantity3">1</span><button rel="3" type="button" class="btn btn-xs btn-success myButton myButtonAdd">+</button></td>
          <td>6.75 $</td>
        </tr>
 -->
        <tr>
          <td></td>
          <td></td>
          <td style="text-align: right;">Total</td>
          <td>100 $</td>
        </tr>

      </tbody>
    </table>
    
        
<script>
	$( document ).ready(function() {
	    console.log( "ready!" );

	    $(".myButtonRemove").click(function() {
	    	var idItem = $(this).attr('rel');
	    	$.get( "remove?idProduct=" + idItem, function( data ) {
		    	$("#quantity" + idItem).html( data );
				 $( "#message" ).html( "Eliminado: " + data );
	    	});
	    });

	    $(".myButtonAdd").click(function() {
	    	var idItem = $(this).attr('rel');
	    	$.get( "add?idProduct=" + idItem, function( data ) {
		    	$("#quantity" + idItem).html( data );
				 $( "#message" ).html( "Añadido: " + data );
	    	});
	    });
	});
</script>
    
    
<jsp:include page="footer.jsp"></jsp:include>