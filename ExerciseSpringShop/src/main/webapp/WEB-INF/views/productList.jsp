<jsp:include page="header.jsp"></jsp:include>

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
        <tr>
          <th scope="row">1</th>
          <td>Shoes</td>
          <td>30.50$</td>
          <td><button onclick="javascript:alert('add #1')">Add product to cart</button></td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Hat</td>
          <td>15$</td>
          <td><button onclick="javascript:alert('add #2')">Add product to cart</button></td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Gloves</td>
          <td>6.75$</td>
          <td><button onclick="javascript:alert('add #3')">Add product to cart</button></td>
        </tr>

      </tbody>
    </table>

<jsp:include page="footer.jsp"></jsp:include>